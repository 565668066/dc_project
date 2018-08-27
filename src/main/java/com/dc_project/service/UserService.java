package com.dc_project.service;

import com.dc_project.dao.UserDao;
import com.dc_project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserService() {

    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     ********业务层：*******
     * 检查用户名是否存在
     * 用户得到其信息
     * 增加用户
     * 查询所有用户
     * 查询用户（依据：姓名、学号、学院、用户名）,管理员可以模糊查询，在业务处理层添加了“%”
     * 删除用户
     * 修改用户
     */

    /**
     * 检查登录
     * @param username
     * @param password
     */
    public String signinCheck(String username, String password){
        System.out.println("signinCheck in UserService");
        User user=new User("","","",username,password,"");
        int result =userDao.checkUsername(username);
        if(result==1)
        {
            int res=userDao.checkUser(user);
            if(res==1)
            {
                return "success";
            }
            else return "password error";
        }
        else return "username error";
    }

    /**
     * 检查id、username存在
     * @param user
     */
    public String checkUser(User user) {
        System.out.println("CheckUser in UserService");
        int rs1 = userDao.checkUsername(user.getUsername());
        int rs2 = userDao.checkId(user.getId());
        if (rs1 > 0) {
            return "username error";
        }
        else if (rs2 > 0) {
            return "id error";
        }
        else return "success";
    }

    /**
     * 查询所有用户
     */
    public List<User> selectAllUser() {
        return userDao.selectAllUser();
    }

    /**
     * 查询单个用户信息
     * @param id
     */
    public User selectUser(String id) {
        return userDao.selectUser(id);
    }

    /**
     * 通过学号/工号
     * @param id
     */
    public List<User> selectById(String id) {
        id = "%"+id+"%";
        System.out.println(id+"根据学号/工号模糊查找，UserService");
        return userDao.selectById(id);
    }

    /**
     * 通过人名
     * @param realName
     */
    public List<User> selectByRealName(String realName) {
        realName = "%"+realName+"%";
        System.out.println(realName+"根据人名模糊查找，UserService");
        return userDao.selectByRealName(realName);
    }

    /**
     * 通过用户名
     * @param username
     */
    public List<User> selectByUsername(String username) {
        username = "%"+username+"%";
        System.out.println(username+"根据用户模糊查找，UserService");
        return userDao.selectByUsername(username);
    }

    /**
     * 通过学院
     * @param college
     */
    public List<User> selectByCollege(String college) {
        college = "%"+college+"%";
        System.out.println(college+"根据学院模糊查找，UserService");
        return userDao.selectByCollege(college);
    }

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     * 删除用户
     * @param id
     */
    public void deleteUser(String id) {
        userDao.deleteUser(id);
    }

    /**
     * 修改用户
     * @param user
     */
    public void reviseUser(User user) {
        userDao.reviseUser(user);
    }

}
