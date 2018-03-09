package travel.hk.attraction.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.hk.attraction.bean.Attraction;
import travel.hk.attraction.service.AttractionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AttractionTest {

    @Autowired
    AttractionService attractionService;

    @Test
    public void testSelectAttractionById(){
        Attraction attraction =attractionService.getAttractionById(1);
        System.out.println("景点名字："+attraction.getName());
    }
}
