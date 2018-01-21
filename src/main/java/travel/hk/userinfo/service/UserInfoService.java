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


    public List<UserInfo> getAllUserInfo(){
        return userInfoMapper.selectByExample(null);
    }

    public UserInfo getOneUserById(int id){
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
