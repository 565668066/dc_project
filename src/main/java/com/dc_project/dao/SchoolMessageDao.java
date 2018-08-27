package com.dc_project.dao;

import com.dc_project.entity.SchoolMessage;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface SchoolMessageDao {

    /**
     * 添加社团活动
     * @param schoolMessage
     */
    public void addSchoolMessage(SchoolMessage schoolMessage);

    /**
     * 删除社团活动
     * @param id
     */
    public void deleteSchoolMessage(int id);

    /**
     * 选择所有社团活动
     */
    public List<SchoolMessage> selectAllSchoolMessage();

    /**
     * 通过社团
     * @param department
     */
    public List<SchoolMessage> selectByDepartment(String department);

    /**
     * 通过日期
     * @param newsTime
     */
    public List<SchoolMessage> selectByNewsTime(String newsTime);

    /**
     * 通过标题
     * @param title
     */
    public List<SchoolMessage> selectByTitle(String title);

    /**
     * 通过标题选择活动
     * @param title
     */
    public SchoolMessage selectSchoolMessage(String title);

    /**
     * 修改社团活动
     * @param SchoolMessage
     */
    public void reviseSchoolMessage(SchoolMessage schoolMessage);

}

