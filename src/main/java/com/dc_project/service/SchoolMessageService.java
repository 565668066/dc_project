package com.dc_project.service;

import com.dc_project.dao.SchoolMessageDao;
import com.dc_project.entity.SchoolMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.List;

@Service
public class SchoolMessageService {

    @Autowired
    private SchoolMessageDao schoolMessageDao;

    public SchoolMessageService() {

    }
    public SchoolMessageDao getSchoolMessageDao(){
        return schoolMessageDao;
    }
    public void setSchoolMessageDao(SchoolMessage schoolMessage){
        this.schoolMessageDao = schoolMessageDao;
    }

    /**
     ********业务层：*******
     * 增加活动
     * 删除活动
     * 查询所有活动
     * 查询活动（依据：社团名称、日期、标题）,可以模糊查询，在业务处理层添加了“%”
     */

    /**
     * 添加活动
     * @param schoolMessage
     */
    public String addSchoolMessage(SchoolMessage schoolMessage) {
        try {
            System.out.println(schoolMessage.getDepartment()+schoolMessage.getTitle()+" 返回成功---这在schoolMessageService里面");
            schoolMessageDao.addSchoolMessage(schoolMessage);
            return "success";
        }
        catch (Exception e) {
            System.out.println(schoolMessage.getDepartment()+schoolMessage.getTitle()+" 返回失败，估计语句错误---这在schoolMessageService里面");
            return "error";
        }
    }

    /**
     * 删除活动
     * @param id
     */
    public void deleteSchoolMessage(int id) {
        schoolMessageDao.deleteSchoolMessage(id);
    }

    /**
     * 查询所有活动
     */
    public List<SchoolMessage> selectAllSchoolMessage() {
        return schoolMessageDao.selectAllSchoolMessage();
    }

    /**
     * 通过社团名称
     * @param department
     */
    public List<SchoolMessage> selectByDepartment(String department) {
        department = "%"+department+"%";
        System.out.println(department+"根据社团名称模糊查找, SchoolMessageService");
        return schoolMessageDao.selectByDepartment(department);
    }
    /**
     * 通过日期
     * @param newsTime
     */
    public List<SchoolMessage> selectByNewsTime(String newsTime) {
        newsTime = "%"+newsTime+"%";
        System.out.println(newsTime+"根据日期查找, SchoolMessageService");
        return schoolMessageDao.selectByNewsTime(newsTime);
    }
    /**
     * 通过标题
     * @param title
     */
    public List<SchoolMessage> selectByTitle(String title) {
        title = "%"+title+"%";
        System.out.println(title+"根据标题模糊查找, SchoolMessageService");
        return schoolMessageDao.selectByTitle(title);
    }

    /**
     * 查询得到该活动信息
     * @param title
     */
    public SchoolMessage selectSchoolMessage(String title) {
        SchoolMessage schoolMessage = schoolMessageDao.selectSchoolMessage(title);
        return schoolMessage;
    }

    /**
     * 修改活动
     * @param schoolMessage
     */
    public String reviseSchoolMessage(SchoolMessage schoolMessage) {
        try {
            System.out.println(schoolMessage.getDepartment()+schoolMessage.getTitle()+" 返回成功---这在schoolMessageService里面");
            schoolMessageDao.reviseSchoolMessage(schoolMessage);
            return "success";
        }
        catch (Exception e) {
            System.out.println(schoolMessage.getDepartment()+schoolMessage.getTitle()+" 返回失败，估计语句错误---这在schoolMessageService里面");
            return "error";
        }
    }
}
