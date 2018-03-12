package travel.hk.userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.hk.userinfo.bean.UserInfo;
import travel.hk.userinfo.service.UserInfoService;
import travel.hk.util.ChectUtil;
import travel.hk.util.Message;

import java.util.List;

@Controller
@RequestMapping("UserInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    /**
     * 获取所有用户的信息
     * @return
     */
    @RequestMapping("/getAllUserInfo")
    @ResponseBody
    public Message getAllUserInfo(){
        List<UserInfo> userInfoList =userInfoService.getAllUserInfo();
        return Message.success().add("result",userInfoList);
    }

    /**
     * 根据用户Id获取用户详细信息
     * @param userId
     * @return
     */
    @RequestMapping("/getOneUserById")
    @ResponseBody
    public Message getOneUserById(@RequestParam(value = "userId" ) String userId){
        if(!ChectUtil.isStringNull(userId)){
            UserInfo userInfo =userInfoService.getOneUserById(userId);
            if(userInfo!=null)
                return Message.success().add("result",userInfo);
            return Message.fail();
        }
        return Message.fail();

    }

}
