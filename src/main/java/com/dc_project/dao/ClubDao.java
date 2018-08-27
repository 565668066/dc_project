package com.dc_project.dao;

import com.dc_project.entity.Club;

import java.util.List;

public interface ClubDao {

    /**
     * 添加社团
     * @param club
     */
    public void addClub(Club club);

    /**
     * 删除社团
     * @param id
     */
    public void deleteClub(String id);

    /**
     * 选择所有社团活动
     */
    public List<Club> selectAllClub();

    /**
     * 通过社团id
     * @param id
     */
    public List<Club> selectById(String id);

    /**
     * 通过社团名称
     * @param clubName
     */
    public List<Club> selectByClubName(String clubName);

    /**
     * 通过建立日期
     * @param buildTime
     */
    public List<Club> selectByBuildTime(String buildTime);

    /**
     * 通过管理者
     * @param manager
     */
    public List<Club> selectByManager(String manager);

    /**
     * 通过id选择社团
     * @param id
     */
    public Club selectClub(String id);

    /**
     * 修改社团
     * @param club
     */
    public void reviseClub(Club club);

}
