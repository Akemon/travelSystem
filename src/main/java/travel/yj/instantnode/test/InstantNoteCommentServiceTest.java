package travel.yj.instantnode.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.yj.instantnode.service.InstantNoteCommentService;

import static org.junit.Assert.*;

/**
 * @author 杨景
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class InstantNoteCommentServiceTest {

    @Autowired
    private InstantNoteCommentService instantNoteCommentService;

    @Test
    public void testAddInstantNoteComment(){
          String result=  instantNoteCommentService.addInstantNoteComment(12,"826299017","1","谢谢你的回复（多余一条）");
          assertEquals(true,result.indexOf("成功")>=0);
    }

    @Test
    public void testDeleteOneInstantNoteCommentById(){
        String result=instantNoteCommentService.deleteOneInstantNoteCommentById(7);
        assertEquals(true,result.indexOf("成功")>=0);
    }
}
