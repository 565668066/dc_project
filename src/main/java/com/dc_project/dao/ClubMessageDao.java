package com.dc_project.dao;

import com.dc_project.entity.ClubMessage;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ClubMessageDao {

    /**
     * 添加社团活动
     * @param clubMessage
     */
    public void addClubMessage(ClubMessage clubMessage);

    /**
     * 删除社团活动
     * @param id
     */
    public void deleteClubMessage(int id);

    /**
     * 选择所有社团活动
     */
    public List<ClubMessage> selectAllClubMessage();

    /**
     * 通过社团
     * @param clubName
     */
    public List<ClubMessage> selectByClubName(String clubName);

    /**
     * 通过日期
     * @param newsTime
     */
    public List<ClubMessage> selectByNewsTime(String newsTime);

    /**
     * 通过标题
     * @param title
     */
    public List<ClubMessage> selectByTitle(String title);

    /**
     * 通过标题选择活动
     * @param title
     */
    public ClubMessage selectClubMessage(String title);

    /**
     * 修改社团活动
     * @param clubMessage
     */
    public void reviseClubMessage(ClubMessage clubMessage);

}

