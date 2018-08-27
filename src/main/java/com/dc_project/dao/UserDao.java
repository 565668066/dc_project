package com.dc_project.dao;

import com.dc_project.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 验证用户
     * @param user
     */
    public int checkUser(User user);

    /**
     * 验证用户名
     * @param username
     */
    public int checkUsername(String username);

    /**
     * 验证学号/工号
     * @param id
     */
    public int checkId(String id);

    /**
     * 验证密码
     * @param password
     */
    public int checkPassword(String password);

    /**
     * 选择所有用户
     */
    public List<User> selectAllUser();

    /**
     * 选择单个用户
     * @param id
     */
    public User selectUser(String id);

    /**
     * 通过学号/工号
     * @param id
     */
    public List<User> selectById(String id);

    /**
     * 通过用户名
     * @param username
     */
    public List<User> selectByUsername(String username);

    /**
     * 通过姓名
     * @param realName
     */
    public List<User> selectByRealName(String realName);

    /**
     * 通过学院
     * @param college
     */
    public List<User> selectByCollege(String college);

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 删除用户
     * @param id
     */
    public void deleteUser(String id);

    /**
     * 修改用户
     * @param user
     */
    public void reviseUser(User user);
}
