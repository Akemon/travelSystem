package travel.yj.followlist.test;

import travel.common.test.HttpURLConectionUtil;

import java.util.HashMap;
import java.util.Map;

public class FollowPeopleListControllerTest {

    public static void main(String[] args) {
        //1.testSelectMyFollowUserList
        //testSelectMyFollowUserList();
        //2.testSelectMyFans
        //testSelectMyFans();
        //3.cancelFollowSomeOne
        //testCancelFollowSomeOne();
        //4.testFollowSomeone
        //testFollowSomeone();
    }

    public static void testSelectMyFollowUserList(){
        Map<String,String> params=new HashMap<String,String>();
        params.put("loginUserId","826299017");
        HttpURLConectionUtil.get("http://localhost:8080/travelSystem/followPeopleList/selectMyFollowUserList",params);
    }

    public static void testSelectMyFans(){
        Map<String,String> params=new HashMap<String,String>();
        params.put("loginUserId","826299017");
        HttpURLConectionUtil.get("http://localhost:8080/travelSystem/followPeopleList/selectMyFans",params);
    }

    public static void testCancelFollowSomeOne(){
        Map<String,String> params=new HashMap<String,String>();
        params.put("followPeopleListId","2");
        HttpURLConectionUtil.post("http://localhost:8080/travelSystem/followPeopleList/cancelFollowSomeOne",params);
    }

    public static void testFollowSomeone(){
        Map<String,String> params=new HashMap<String,String>();
        params.put("loginUserId","826299017");
        params.put("hostUserId","1");
        HttpURLConectionUtil.post("http://localhost:8080/travelSystem/followPeopleList/followSomeone",params);
    }


}
