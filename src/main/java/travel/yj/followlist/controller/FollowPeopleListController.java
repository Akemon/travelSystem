package travel.yj.followlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.yj.followlist.service.FollowPeopleListService;

/**
 * @author 杨景
 */
@Controller
@RequestMapping("followPeopleList")
public class FollowPeopleListController {
    @Autowired
    private FollowPeopleListService followPeopleListService;

    @RequestMapping(value="followSomeone",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String followSomeone(String loginUserId,String hostUserId){
        String result=followPeopleListService.followSomeone(hostUserId,loginUserId);
        return result;
    }

    @RequestMapping(value="cancelFollowSomeOne",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String cancelFollowSomeOne(Integer followPeopleListId){
        String result=followPeopleListService.cancelFollowSomeOne(followPeopleListId);
        return result;
    }

    @RequestMapping(value="selectMyFollowUserList",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String selectMyFollowUserList(String loginUserId){
        String result=followPeopleListService.selectMyFollowUserList(loginUserId);
        return result;
    }

    @RequestMapping(value="selectMyFans",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String selectMyFans(String loginUserId){
        String result=followPeopleListService.selectMyFans(loginUserId);
        return result;
    }


}
