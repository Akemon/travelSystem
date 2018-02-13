package travel.yj.instantnode.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.yj.instantnode.service.InstantNoteLikePeopleService;

/**
 * @author 杨景
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class InstantNoteLikePeopleServiceTest {

    @Autowired
    private InstantNoteLikePeopleService instantNoteLikePeopleService;

    @Test
    public void testAddInstantNoteLikePeople(){
        instantNoteLikePeopleService.addInstantNoteLikePeople(12,"1");
    }

    @Test
    public void testSelectListInstantNoteLikePeopleByInstantNoteId(){
        String result=instantNoteLikePeopleService.selectListInstantNoteLikePeopleByInstantNoteId(10).toString();
        System.out.println(result);
    }

    @Test
    public void testCancelLikeInstantNote(){
        instantNoteLikePeopleService.cancelLikeInstantNote(12,"826299017");
    }

}
