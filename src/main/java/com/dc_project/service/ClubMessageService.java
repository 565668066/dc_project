package com.dc_project.service;

import com.dc_project.dao.ClubMessageDao;
import com.dc_project.entity.ClubMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class ClubMessageService {

    @Autowired
    private ClubMessageDao clubMessageDao;

    public ClubMessageService() {

    }
    public ClubMessageDao getClubMessageDao(){
        return clubMessageDao;
    }
    public void setClubMessageDao(ClubMessageDao clubMessageDao){
        this.clubMessageDao = clubMessageDao;
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
     * @param clubMessage
     */
    public String addClubMessage(ClubMessage clubMessage) {
        try {
            System.out.println(clubMessage.getClubName()+clubMessage.getTitle()+" 返回成功---这在clubMessageService里面");
            clubMessageDao.addClubMessage(clubMessage);
            return "success";
        }
        catch (Exception e) {
            System.out.println(clubMessage.getClubName()+clubMessage.getTitle()+" 返回失败，估计语句错误---这在clubMessageService里面");
            return "error";
        }
    }

    /**
     * 删除活动
     * @param id
     */
    public void deleteClubMessage(int id) {
        clubMessageDao.deleteClubMessage(id);
    }

    /**
     * 查询所有活动
     */
    public List<ClubMessage> selectAllClubMessage() {
        return clubMessageDao.selectAllClubMessage();
    }

    /**
     * 通过社团名称
     * @param clubName
     */
    public List<ClubMessage> selectByClubName(String clubName) {
        clubName = "%"+clubName+"%";
        System.out.println(clubName+"根据社团名称模糊查找, ClubMessageService");
        return clubMessageDao.selectByClubName(clubName);
    }
    /**
     * 通过日期
     * @param newsTime
     */
    public List<ClubMessage> selectByNewsTime(String newsTime) {
        newsTime = "%"+newsTime+"%";
        System.out.println(newsTime+"根据日期查找, ClubMessageService");
        return clubMessageDao.selectByNewsTime(newsTime);
    }
    /**
     * 通过标题
     * @param title
     */
    public List<ClubMessage> selectByTitle(String title) {
        title = "%"+title+"%";
        System.out.println(title+"根据标题模糊查找, ClubMessageService");
        return clubMessageDao.selectByTitle(title);
    }

    /**
     * 查询得到该活动信息
     * @param title
     */
    public ClubMessage selectClubMessage(String title) {
        ClubMessage clubMessage = clubMessageDao.selectClubMessage(title);
        return clubMessage;
    }

    /**
     * 修改活动
     * @param clubMessage
     */
    public String reviseClubMessage(ClubMessage clubMessage) {
        try {
            System.out.println(clubMessage.getClubName()+clubMessage.getTitle()+" 返回成功---这在clubMessageService里面");
            clubMessageDao.reviseClubMessage(clubMessage);
            return "success";
        }
        catch (Exception e) {
            System.out.println(clubMessage.getClubName()+clubMessage.getTitle()+" 返回失败，估计语句错误---这在clubMessageService里面");
            return "error";
        }
    }
}
