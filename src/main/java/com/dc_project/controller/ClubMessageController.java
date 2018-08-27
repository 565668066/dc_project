package com.dc_project.controller;

import com.dc_project.entity.ClubMessage;
import com.dc_project.service.ClubMessageService;
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
public class ClubMessageController {
    @Autowired
    private ClubMessageService clubMessageService;

    //跳转社团组织主页
    @RequestMapping(value = "/club_index", method = RequestMethod.GET)
    public String club_index(Model model) {
        List<ClubMessage> list = clubMessageService.selectAllClubMessage();
        model.addAttribute("list",list);
        return "club_index";
    }

    //查询所有活动
    @RequestMapping(value = "/admin_clubMessage_query", method = RequestMethod.GET)
    public String user_clubMessage_query(Model model) {
        List<ClubMessage> list = clubMessageService.selectAllClubMessage();
        model.addAttribute("list",list);
        return "admin_clubMessage_query";
    }

    //根据社团名查
    @RequestMapping(value = "/admin_clubMessage_query_by_clubName", method = RequestMethod.GET)
    public String admin_clubMessage_query_by_clubName(String clubName, Model model) {
        List<ClubMessage> list = clubMessageService.selectByClubName(clubName);
        model.addAttribute("list", list);
        return "admin_clubMessage_query";
    }

    //根据日期查
    @RequestMapping(value = "/admin_clubMessage_query_by_newsTime", method = RequestMethod.GET)
    public String admin_clubMessage_query_by_newsTime(String newsTime, Model model) {
        List<ClubMessage> list = clubMessageService.selectByNewsTime(newsTime);
        model.addAttribute("list", list);
        return "admin_clubMessage_query";
    }

    //根据标题查
    @RequestMapping(value = "/admin_clubMessage_query_by_title", method = RequestMethod.GET)
    public String admin_clubMessage_query_by_title(String title, Model model) {
        List<ClubMessage> list = clubMessageService.selectByTitle(title);
        model.addAttribute("list", list);
        return "admin_clubMessage_query";
    }

    //删除该活动
    @RequestMapping(value = "/admin_clubMessage_delete", method = RequestMethod.GET)
    public String admin_clubMessage_delete(@RequestParam("id") int id, Model model) {
        clubMessageService.deleteClubMessage(id);
        List<ClubMessage> list = clubMessageService.selectAllClubMessage();
        model.addAttribute("list", list);
        return "admin_clubMessage_query";
    }

    //添加活动
    @RequestMapping(value = "/admin_clubMessage_add", method = RequestMethod.GET)
    public String admin_clubMessage_add() {
        return "admin_clubMessage_add";
    }
    @RequestMapping(value = "/admin_clubMessage_add", method = RequestMethod.POST)
    public String admin_clubMessage_add(
            @RequestParam("clubName") String clubName,
            @RequestParam("newsTime") String newsTime,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("manager") String manager,
            @RequestParam("contact") String contact,
            Model model
    ) {
        System.out.println("start_"+clubName+newsTime+title+content+manager+contact+"_end");
        if (clubName.equals("")||newsTime.equals("")||title.equals("")||content.equals("")||manager.equals("")||contact.equals("")
                ||clubName==null||newsTime==null||title==null||content==null||manager==null||contact==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_clubMessage_add";
        }
        else{
            ClubMessage clubMessage = new ClubMessage(clubName,content,newsTime,manager,contact,0,title);
            System.out.println(clubMessage.getClubName()+clubMessage.getTitle()+" 返回成功---这在userController里面");
            clubMessageService.addClubMessage(clubMessage);
            List<ClubMessage> list = clubMessageService.selectAllClubMessage();
            model.addAttribute("list", list);
            return "admin_clubMessage_query";
        }
    }

    //修改该活动
    @RequestMapping(value = "admin_clubMessage_revise", method = RequestMethod.GET)
    public String admin_clubMessage_revise(@RequestParam("title") String title, HttpSession session, Model model) {
        ClubMessage clubMessage = clubMessageService.selectClubMessage(title);
        int id = clubMessage.getId();
        model.addAttribute("clubMessage", clubMessage);
        model.addAttribute("id",id);
        System.out.println(clubMessage.getClubName()+id+"——Controller");
        return "admin_clubMessage_revise";
    }

    @RequestMapping(value = "admin_clubMessage_revise", method = RequestMethod.POST)
    public String admin_clubMessage_revise(
            @RequestParam("clubName") String clubName,
            @RequestParam("newsTime") String newsTime,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("manager") String manager,
            @RequestParam("contact") String contact,
            @RequestParam("id") int id,
            Model model, HttpSession session
    ) {
        System.out.println("start_"+clubName+newsTime+title+content+manager+contact+"_end");
        if (clubName.equals("")||newsTime.equals("")||title.equals("")||content.equals("")||manager.equals("")||contact.equals("")
                ||clubName==null||newsTime==null||title==null||content==null||manager==null||contact==null) {
            model.addAttribute("error", "输入不完整，请重新输入");
            return "admin_clubMessage_revise";
        }
        else{
            ClubMessage clubMessage = new ClubMessage(clubName,content,newsTime,manager,contact,id,title);
            System.out.println(id+" "+clubMessage.getId()+" 返回成功---这在userController里面");
            clubMessageService.reviseClubMessage(clubMessage);
            List<ClubMessage> list = clubMessageService.selectAllClubMessage();
            model.addAttribute("list", list);
            return "admin_clubMessage_query";
        }
    }
}