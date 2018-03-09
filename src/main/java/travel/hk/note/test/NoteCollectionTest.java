package travel.hk.note.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.hk.note.bean.NoteCollection;
import travel.hk.note.mapper.NoteCollectionMapper;
import travel.hk.note.service.NoteCollectionService;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class NoteCollectionTest {
    @Autowired
    NoteCollectionService noteCollectionService;

    @Test
    public void selectAllCollectionByUserId(){
        List<NoteCollection> noteCollections = noteCollectionService.getAllCollectionByUserId("1");
        Iterator iterator =noteCollections.iterator();
        while(iterator.hasNext()){
            NoteCollection noteCollection =(NoteCollection)iterator.next();
            System.out.println("收藏游记的标题"+noteCollection.getNote().getTitle());
            System.out.println("收藏者名字："+noteCollection.getUserInfo().getName());
        }
    }

    @Test
    public void cancelCollection(){
        noteCollectionService.cancelCollection("1",1);
    }

    @Test
    public void testCollectNote(){
        System.out.println(noteCollectionService.collectSomeNote("1",1));
    }
}
