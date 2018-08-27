package com.dc_project.controller;

import com.dc_project.entity.SchoolMessage;
import com.dc_project.service.SchoolMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.util.List;

@Controller
public class SchoolMessageController {
    @Autowired
    private SchoolMessageService schoolMessageService;

    //访问学校信息界面
    @RequestMapping(value = "/school_message_index",method = RequestMethod.GET)
    public String school_message_index(Model model){
        List<SchoolMessage> list = schoolMessageService.selectAllSchoolMessage();
        model.addAttribute("list",list);
        return"school_message_index";
    }

    //查询所有活动
    @RequestMapping(value = "/admin_schoolMessage_query", method = RequestMethod.GET)
    public String admin_schoolMessage_query(Model model) {
        List<SchoolMessage> list = schoolMessageService.selectAllSchoolMessage();
        model.addAttribute("list",list);
        return "admin_schoolMessage_query";
    }

    //根据社团名查
    @RequestMapping(value = "/admin_schoolMessage_query_by_department", method = RequestMethod.GET)
    public String admin_schoolMessage_query_by_department(String department, Model model) {
        List<SchoolMessage> list = schoolMessageService.selectByDepartment(department);
        model.addAttribute("list", list);
        return "admin_schoolMessage_query";
    }

    //根据日期查
    @RequestMapping(value = "/admin_schoolMessage_query_by_newsTime", method = RequestMethod.GET)
    public String admin_schoolMessage_query_by_newsTime(String newsTime, Model model) {
        List<SchoolMessage> list = schoolMessageService.selectByNewsTime(newsTime);
        model.addAttribute("list", list);
        return "admin_schoolMessage_query";
    }

    //根据标题查
    @RequestMapping(value = "/admin_schoolMessage_query_by_title", method = RequestMethod.GET)
    public String admin_schoolMessage_query_by_title(String title, Model model) {
        List<SchoolMessage> list = schoolMessageService.selectByTitle(title);
        model.addAttribute("list", list);
        return "admin_schoolMessage_query";
    }

    //删除该活动
    @RequestMapping(value = "/admin_schoolMessage_delete", method = RequestMethod.GET)
    public String admin_schoolMessage_delete(@RequestParam("id") int id, Model model) {
        schoolMessageService.deleteSchoolMessage(id);
        List<SchoolMessage> list = schoolMessageService.selectAllSchoolMessage();
        model.addAttribute("list", list);
        return "admin_schoolMessage_query";
    }

    //添加活动
    @RequestMapping(value = "/admin_schoolMessage_add", method = RequestMethod.GET)
    public String admin_schoolMessage_add() {
        return "admin_schoolMessage_add";
    }
    @RequestMapping(value = "/admin_schoolMessage_add", method = RequestMethod.POST)
    public String admin_schoolMessage_add(
            @RequestParam("department") String department,
            @RequestParam("newsTime") String newsTime,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("manager") String manager,
            @RequestParam("contact") String contact,
            Model model
    ) {
        System.out.println("start_"+department+newsTime+title+content+manager+contact+"_end");
        if (department.equals("")||newsTime.equals("")||title.equals("")||content.equals("")||manager.equals("")||contact.equals("")
                ||department==null||newsTime==null||title==null||content==null||manager==null||contact==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_schoolMessage_add";
        }
        else{
            SchoolMessage schoolMessage = new SchoolMessage(department,content,newsTime,manager,contact,0,title);
            System.out.println(schoolMessage.getDepartment()+schoolMessage.getTitle()+" 返回成功---这在schoolMessageController里面");
            schoolMessageService.addSchoolMessage(schoolMessage);
            List<SchoolMessage> list = schoolMessageService.selectAllSchoolMessage();
            model.addAttribute("list", list);
            return "admin_schoolMessage_query";
        }
    }

    //修改该活动
    @RequestMapping(value = "admin_schoolMessage_revise", method = RequestMethod.GET)
    public String admin_schoolMessage_revise(@RequestParam("title") String title, HttpSession session, Model model) {
        SchoolMessage schoolMessage = schoolMessageService.selectSchoolMessage(title);
        int id = schoolMessage.getId();
        model.addAttribute("clubMessage", schoolMessage);
        model.addAttribute("id",id);
        System.out.println(schoolMessage.getDepartment()+id+"——Controller");
        return "admin_schoolMessage_revise";
    }

    @RequestMapping(value = "admin_schoolMessage_revise", method = RequestMethod.POST)
    public String admin_schoolMessage_revise(
            @RequestParam("department") String department,
            @RequestParam("newsTime") String newsTime,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("manager") String manager,
            @RequestParam("contact") String contact,
            @RequestParam("id") int id,
            Model model, HttpSession session
    ) {
        System.out.println("start_"+department+newsTime+title+content+manager+contact+"_end");
        if (department.equals("")||newsTime.equals("")||title.equals("")||content.equals("")||manager.equals("")||contact.equals("")
                ||department==null||newsTime==null||title==null||content==null||manager==null||contact==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_schoolMessage_revise";
        }
        else{
            SchoolMessage schoolMessage = new SchoolMessage(department,content,newsTime,manager,contact,id,title);
            System.out.println(id+" "+schoolMessage.getId()+" 返回成功---这在userController里面");
            schoolMessageService.reviseSchoolMessage(schoolMessage);
            List<SchoolMessage> list = schoolMessageService.selectAllSchoolMessage();
            model.addAttribute("list", list);
            return "admin_schoolMessage_query";
        }
    }
}