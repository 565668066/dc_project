package com.dc_project.controller;

import com.dc_project.entity.Club;
import com.dc_project.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ClubController {
    @Autowired
    private ClubService clubService;

    //查询所有活动
    @RequestMapping(value = "/admin_club_query", method = RequestMethod.GET)
    public String admin_club_query(Model model) {
        List<Club> list = clubService.selectAllClub();
        model.addAttribute("list",list);
        return "admin_club_query";
    }

    //根据id查
    @RequestMapping(value = "/admin_club_query_by_id", method = RequestMethod.GET)
    public String admin_club_query_by_id(String id, Model model) {
        List<Club> list = clubService.selectById(id);
        model.addAttribute("list", list);
        return "admin_club_query";
    }

    //根据社团名查
    @RequestMapping(value = "/admin_club_query_by_clubName", method = RequestMethod.GET)
    public String admin_club_query_by_clubName(String clubName, Model model) {
        List<Club> list = clubService.selectByClubName(clubName);
        model.addAttribute("list", list);
        return "admin_club_query";
    }

    //根据管理者查
    @RequestMapping(value = "/admin_club_query_by_manager", method = RequestMethod.GET)
    public String admin_club_query_by_manager(String manager, Model model) {
        List<Club> list = clubService.selectByManager(manager);
        model.addAttribute("list", list);
        return "admin_club_query";
    }

    //根据建立日期查
    @RequestMapping(value = "/admin_club_query_by_newsTime", method = RequestMethod.GET)
    public String admin_club_query_by_newsTime(String buildTime, Model model) {
        List<Club> list = clubService.selectByBuildTime(buildTime);
        model.addAttribute("list", list);
        return "admin_club_query";
    }


    //删除该活动
    @RequestMapping(value = "/admin_club_delete", method = RequestMethod.GET)
    public String club_delete(@RequestParam("id") String id, Model model) {
        clubService.deleteClub(id);
        List<Club> list = clubService.selectAllClub();
        model.addAttribute("list", list);
        return "admin_club_query";
    }

    //添加活动
    @RequestMapping(value = "/admin_club_add", method = RequestMethod.GET)
    public String club_add() {
        return "admin_club_add";
    }
    @RequestMapping(value = "/admin_club_add", method = RequestMethod.POST)
    public String club_add(
            @RequestParam("id") String id,
            @RequestParam("clubName") String clubName,
            @RequestParam("manager") String manager,
            @RequestParam("buildTime") String buildTime,
            @RequestParam("intro") String intro,
            Model model
    ) {
        System.out.println("start_"+id+clubName+manager+buildTime+intro+"_end");
        if (id.equals("")||clubName.equals("")||manager.equals("")||buildTime.equals("")||intro.equals("")
                ||id==null||clubName==null||manager==null||buildTime==null||intro==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_club_add";
        }
        else{
            Club club = new Club(id,clubName,manager,buildTime,intro);
            System.out.println(club.getId()+club.getClubName()+" 返回成功---这在clubController里面");
            clubService.addClub(club);
            List<Club> list = clubService.selectAllClub();
            model.addAttribute("list", list);
            return "admin_club_query";
        }
    }

    //修改该活动
    @RequestMapping(value = "admin_club_revise", method = RequestMethod.GET)
    public String admin_club_revise(@RequestParam("id") String id, HttpSession session, Model model) {
        Club club = clubService.selectClub(id);
        model.addAttribute("club", club);
        model.addAttribute("id",id);
        System.out.println(club.getClubName()+id+"——Controller");
        return "admin_club_revise";
    }

    @RequestMapping(value = "admin_club_revise", method = RequestMethod.POST)
    public String admin_club_revise(
            @RequestParam("id") String id,
            @RequestParam("clubName") String clubName,
            @RequestParam("manager") String manager,
            @RequestParam("buildTime") String buildTime,
            @RequestParam("intro") String intro,
            Model model, HttpSession session
    ) {
        System.out.println("start_"+id+clubName+manager+buildTime+intro+"_end");
        if (id.equals("")||clubName.equals("")||manager.equals("")||buildTime.equals("")||intro.equals("")
                ||id==null||clubName==null||manager==null||buildTime==null||intro==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_club_revise";
        }
        else{
            Club club = new Club(id,clubName,manager,buildTime,intro);
            System.out.println(club.getId()+club.getClubName()+" 返回成功---这在clubController里面");
            clubService.reviseClub(club);
            List<Club> list = clubService.selectAllClub();
            model.addAttribute("list", list);
            return "admin_club_query";
        }
    }
}