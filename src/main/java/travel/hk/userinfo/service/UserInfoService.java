package travel.hk.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travel.hk.userinfo.bean.UserInfo;
import travel.hk.userinfo.mapper.UserInfoMapper;

import java.util.List;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 获取所有的用户信息
     * @return
     */
    public List<UserInfo> getAllUserInfo(){
        return userInfoMapper.selectByExample(null);
    }

    /**
     * 根据用户id获取用户信息
     * @param userid
     * @return
     */
    public UserInfo getOneUserById(String userid){
        return userInfoMapper.selectByPrimaryKey(userid);
    }

    public boolean userLogin(UserInfo userInfo){
        return false;
    }
}
