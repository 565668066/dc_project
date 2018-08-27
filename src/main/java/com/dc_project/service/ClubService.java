package com.dc_project.service;

import com.dc_project.dao.ClubDao;
import com.dc_project.entity.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    @Autowired
    private ClubDao clubDao;

    public ClubService() {

    }
    public ClubDao getClubDao(){
        return clubDao;
    }
    public void setClubDao(ClubDao clubDao){
        this.clubDao = clubDao;
    }

    /**
     ********业务层：*******
     * 增加社团
     * 删除社团
     * 查询所有社团
     * 查询社团（依据：社团名称、日期、标题）,可以模糊查询，在业务处理层添加了“%”
     */

    /**
     * 添加社团
     * @param club
     */
    public String addClub(Club club) {
        try {
            System.out.println(club.getId()+club.getClubName()+" 返回成功---这在clubService里面");
            clubDao.addClub(club);
            return "success";
        }
        catch (Exception e) {
            System.out.println(club.getId()+club.getClubName()+" 返回失败，估计语句错误---这在clubService里面");
            return "error";
        }
    }

    /**
     * 删除社团
     * @param id
     */
    public void deleteClub(String id) {
        clubDao.deleteClub(id);
    }

    /**
     * 查询所有社团
     */
    public List<Club> selectAllClub() {
        return clubDao.selectAllClub();
    }
    /**
     * 通过社团id
     * @param id
     */
    public List<Club> selectById(String id) {
        id = "%"+id+"%";
        System.out.println(id+"根据社团id模糊查找, ClubService");
        return clubDao.selectById(id);
    }
    /**
     * 通过社团名称
     * @param clubName
     */
    public List<Club> selectByClubName(String clubName) {
        clubName = "%"+clubName+"%";
        System.out.println(clubName+"根据社团名称模糊查找, ClubService");
        return clubDao.selectByClubName(clubName);
    }
    /**
     * 通过建立日期
     * @param buildTime
     */
    public List<Club> selectByBuildTime(String buildTime) {
        buildTime = "%" +buildTime+"%";
        System.out.println(buildTime+"根据建立日期查找, ClubService");
        return clubDao.selectByBuildTime(buildTime);
    }
    /**
     * 通过管理者
     * @param manager
     */
    public List<Club> selectByManager(String manager) {
        manager = "%"+manager+"%";
        System.out.println(manager+"根据管理者模糊查找, ClubService");
        return clubDao.selectByManager(manager);
    }

    /**
     * 查询得到该活动信息
     * @param id
     */
    public Club selectClub(String id) {
        Club club = clubDao.selectClub(id);
        return club;
    }

    /**
     * 修改活动
     * @param club
     */
    public String reviseClub(Club club) {
        try {
            System.out.println(club.getClubName()+club.getManager()+" 返回成功---这在clubService里面");
            clubDao.reviseClub(club);
            return "success";
        }
        catch (Exception e) {
            System.out.println(club.getClubName()+club.getManager()+" 返回失败，估计语句错误---这在clubService里面");
            return "error";
        }
    }
}
