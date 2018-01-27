package travel.yj.instantnode.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.yj.instantnode.service.InstantNoteService;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)//表示整合JUnit4进行测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载spring配置文件
public class InstantNoteServiceTest {

    @Autowired
    private InstantNoteService instantNoteService;

    @Test
    public void testAddOneInstantNote(){

    }
}
