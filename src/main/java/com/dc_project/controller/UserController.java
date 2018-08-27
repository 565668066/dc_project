package com.dc_project.controller;

import com.dc_project.entity.User;
import com.dc_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    //返回主页
    @RequestMapping(value = "/backtoindex",method = RequestMethod.GET)
    public String backtoindex(){
        return"ushare";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin(){
        System.out.println("打开初始页面");
        return "signin";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String signin(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model, HttpSession session)
    {
        if (username.equals("admin")&&password.equals("admin"))
            return "admin_index";
        else if(userService.signinCheck(username,password).equals("success")) {
            model.addAttribute("username", username);
            System.out.println(session.getAttribute("username"));
            return "ushare";
        }
        else {
            System.out.println(userService.signinCheck(username,password));
            model.addAttribute("error","用户名或密码错误！");
            return "signin";
        }
    }

    @RequestMapping(value = "admin_user_add", method = RequestMethod.GET)
    public String admin_user_add() {
        return "admin_user_add";
    }

    @RequestMapping(value = "admin_user_add", method = RequestMethod.POST)
    public String admin_user_add (
            @RequestParam("realName") String realName,
            @RequestParam("password") String password,
            @RequestParam("repassword") String repassword,
            @RequestParam("username") String username,
            @RequestParam("id") String id,
            @RequestParam("college") String college,
            @RequestParam("email") String email,
            Model model
    )
    {
        User user = new User(realName, id, college, username, password, email);
        if (realName.equals("")||id.equals("")||college.equals("")||username.equals("")||password.equals("")||email.equals("")
                ||realName==null||id==null||college==null||username==null||password==null||email==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_user_add";
        }
        else if (!email.contains("@")||!email.contains(".")) {
            model.addAttribute("error", "邮箱格式不正确，请重新输入");
            return "admin_user_add";
        }
        else if (password.length()<6) {
            model.addAttribute("error", "密码过短，请重新输入");
            return "admin_user_add";
        }
        else if (!password.equals(repassword)) {
            model.addAttribute("error", "两次密码不一致，请重新输入");
            return "admin_user_add";
        }
        else if (userService.checkUser(user).equals("username error")) {
            model.addAttribute("error", "用户名已被注册，请重新输入");
            return "admin_user_add";
        }
        else if (userService.checkUser(user).equals("id error")) {
            model.addAttribute("error", "学号/工号已被注册，请重新输入");
            return "admin_user_add";
        }
        else if (userService.checkUser(user).equals("success")) {
            System.out.println("add_success in StudentController");
            userService.addUser(user);
            List<User> list = userService.selectAllUser();
            model.addAttribute("list", list);
            model.addAttribute("error", "注册成功");
            return "admin_user_query";
        }
        else {
            model.addAttribute("error", "玄学错误，请重新输入");
            return "admin_user_add";
        }
    }

    //注册页面
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String signup() {
        return "signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String signup (
            @RequestParam("realName") String realName,
            @RequestParam("password") String password,
            @RequestParam("repassword") String repassword,
            @RequestParam("username") String username,
            @RequestParam("id") String id,
            @RequestParam("college") String college,
            @RequestParam("email") String email,
            Model model
    )
    {
        User user = new User(realName, id, college, username, password, email);
        if (realName.equals("")||id.equals("")||college.equals("")||username.equals("")||password.equals("")||email.equals("")
                ||realName==null||id==null||college==null||username==null||password==null||email==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "signup";
        }
        else if (!email.contains("@")||!email.contains(".")) {
            model.addAttribute("error", "邮箱格式不正确，请重新输入");
            return "signup";
        }
        else if (password.length()<6) {
            model.addAttribute("error", "密码过短，请重新输入");
            return "signup";
        }
        else if (!password.equals(repassword)) {
            model.addAttribute("error", "两次密码不一致，请重新输入");
            return "signup";
        }
        else if (userService.checkUser(user).equals("username error")) {
            model.addAttribute("error", "用户名已被注册，请重新输入");
            return "signup";
        }
        else if (userService.checkUser(user).equals("id error")) {
            model.addAttribute("error", "学号/工号已被注册，请重新输入");
            return "signup";
        }
        else if (userService.checkUser(user).equals("success")) {
            System.out.println("add_success in StudentController");
            userService.addUser(user);
/*            List<User> list = userService.selectAllUser();
            model.addAttribute("list", list);*/
            model.addAttribute("error", "注册成功，请登录");
            return "signin";
        }
        else {
            model.addAttribute("error", "玄学错误，请重新输入");
            return "signup";
        }
    }

    //查询所有用户信息
    @RequestMapping(value = "/admin_user_query", method = RequestMethod.GET)
    public String admin_user_query(Model model) {
        List<User> list = userService.selectAllUser();
        model.addAttribute("list",list);
        return "admin_user_query";
    }

    //根据人名查
    @RequestMapping(value = "/admin_user_query_by_realName",method = RequestMethod.GET)
    public String admin_user_query_by_realName(String realName, Model model) {
        List<User> list = userService.selectByRealName(realName);
        model.addAttribute("list", list);
        return "admin_user_query";
    }

    //根据用户名查
    @RequestMapping(value = "/admin_user_query_by_username", method = RequestMethod.GET)
    public String admin_user_query_by_username(String username, Model model) {
        List<User> list = userService.selectByUsername(username);
        model.addAttribute("list", list);
        return "admin_user_query";
    }

    //根据id查
    @RequestMapping(value = "/admin_user_query_by_id", method = RequestMethod.GET)
    public String admin_user_query_by_id(String id, Model model) {
        List<User> list = userService.selectById(id);
        model.addAttribute("list", list);
        return "admin_user_query";
    }

    //根据学院查
    @RequestMapping(value = "/admin_user_query_by_college", method = RequestMethod.GET)
    public String admin_user_query_by_college(String college, Model model) {
        List<User> list = userService.selectByCollege(college);
        model.addAttribute("list", list);
        return "admin_user_query";
    }

    //删除用户，post，book
    @RequestMapping(value = "/admin_user_delete", method = RequestMethod.GET)
    public String admin_user_delete(@RequestParam("id") String id, Model model) {
        userService.deleteUser(id);
        List<User> list=userService.selectAllUser();
        model.addAttribute("list",list);
        return "admin_user_query";
    }

    //修改用户
    @RequestMapping(value = "/admin_user_revise", method = RequestMethod.GET)
    public String admin_user_revise(
            @RequestParam("realName") String realName,
            @RequestParam("password") String password,
            @RequestParam("username") String username,
            @RequestParam("id") String id,
            @RequestParam("college") String college,
            @RequestParam("email") String email,
            Model model
    )
    {
        model.addAttribute("realName", realName);
        model.addAttribute("password", password);
        model.addAttribute("username", username);
        model.addAttribute("id", id);
        model.addAttribute("college", college);
        model.addAttribute("email", email);
        /*Student student = new Student(realname, studentID, username, password);
        System.out.println("revise in StudentController");
        studentService.reviseStudent(student);
        List<Student> list = studentService.selectAllStudent();
        model.addAttribute("list", list);*/
        return "admin_user_revise";
    }

    @RequestMapping(value = "/admin_user_revise", method = RequestMethod.POST)
    public String admin_student_revise(
            @RequestParam("realName") String realName,
            @RequestParam("password") String password,
            @RequestParam("username") String username,
            @RequestParam("id") String id,
            @RequestParam("college") String college,
            @RequestParam("email") String email,
            Model model,HttpSession session
    )
    {
        User user = new User(realName, id, college, username, password, email);
        if (userService.checkUser(user).equals("id error")) {
            System.out.println("revise in UserController");
            userService.reviseUser(user);
            List<User> list = userService.selectAllUser();
            model.addAttribute("list", list);
            return "admin_user_query";
        }
        else if (userService.checkUser(user).equals("error")) {
            model.addAttribute("error", "用户名已被注册");
            model.addAttribute("realName", realName);
            model.addAttribute("password", password);
            model.addAttribute("username", username);
            model.addAttribute("id", id);
            model.addAttribute("college", college);
            model.addAttribute("email", email);
           /* List<Student> list = studentService.selectAllStudent();
            model.addAttribute("list", list);
            return "student_admin_query";*/
            return "admin_user_revise";
        }
        else {
            List<User> list = userService.selectAllUser();
            model.addAttribute("list", list);
            return "admin_user_query";
        }
    }

    //注销登陆
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(SessionStatus sessionStatus){
        System.out.println("logout in UserController");
        sessionStatus.setComplete();
        return "signin";
    }

}
