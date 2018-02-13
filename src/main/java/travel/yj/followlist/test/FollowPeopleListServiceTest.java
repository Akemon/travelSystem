package travel.yj.followlist.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.yj.followlist.service.FollowPeopleListService;

import static org.junit.Assert.*;

/**
 * @author 杨景
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class FollowPeopleListServiceTest {

    @Autowired
    private FollowPeopleListService followPeopleListService;

    @Test
    public void testFolowSomeone(){
        String result=followPeopleListService.followSomeone("826299017","dsf");
        assertEquals(true,result.indexOf("成功")>=0);
    }

    @Test
    public void testCancelFollowSomeOne(){
        String result=followPeopleListService.cancelFollowSomeOne(5);
        assertEquals(true,result.indexOf("成功")>=0);
    }

    @Test
    public void testSelectMyFans(){
        String result=followPeopleListService.selectMyFans("826299017");
        System.out.println(result);
    }

    @Test
    public void testSelectMyFollowUserList(){
        String result=followPeopleListService.selectMyFollowUserList("826299017");
        System.out.println(result);
    }


}
