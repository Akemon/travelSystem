package travel.hk.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.hk.note.bean.Note;
import travel.hk.note.service.NoteService;
import travel.hk.util.Message;

@Controller
@RequestMapping("Note")
public class NoteController {
    @Autowired
    NoteService noteService;

    /**
     * 根据游记Id获取详细信息
     * @param id
     * @return
     */
    @RequestMapping("getNoteByNoteId")
    @ResponseBody
    public Message getNoteByNoteId(@RequestParam(value = "id")int id){
        return Message.success().add("result",noteService.getNoteByNoteId(id));
    }

    /**
     * 插入一篇游记
     * @param note
     * @return
     */
    @RequestMapping("insertNewNote")
    @ResponseBody
    public Message insertNewNote(Note note){
        noteService.insertNewNote(note);
        return Message.success();
    }

    /**
     * 删除一篇游记
     * @param note
     * @return
     */
    @RequestMapping("deleteOneNote")
    @ResponseBody
    public Message deleteOneNote(Note note){
        if(noteService.deleteOneNote(note))
            return Message.success();
        return Message.fail();
    }
}
