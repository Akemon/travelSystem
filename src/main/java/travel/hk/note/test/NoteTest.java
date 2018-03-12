package travel.hk.note.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.hk.note.bean.Note;
import travel.hk.note.service.NoteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class NoteTest {
    @Autowired
    NoteService noteService;

    @Test
    public void testNoteContent(){
        Note note =noteService.getNoteByNoteId(1);
        System.out.println(note.getTitle());
        System.out.println(note.getContent().getTravelNoteContent());
    }

    @Test
    public void testDeleteNote(){
        Note note =new Note();
        note.setTravelNoteId(2);
        note.setUserId("2");
       System.out.println(noteService.deleteOneNote(note));
    }
}
