package travel.hk.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.hk.note.service.CommentService;
import travel.hk.util.Message;

@Controller
@RequestMapping("Comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @RequestMapping("getAllCommentsByNoteId")
    @ResponseBody
    public Message getAllCommentsByNoteId(@RequestParam(value = "noteId")Integer noteId){
        return Message.success().add("allComments",commentService.getCommentListByNoteId(noteId));
    }

}
