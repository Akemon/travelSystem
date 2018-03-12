package travel.hk.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.hk.note.bean.Comment;
import travel.hk.note.service.CommentService;
import travel.hk.util.Message;

@Controller
@RequestMapping("Comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    /**
     * 获取一篇游记的所有评论
     * @param noteId
     * @return
     */
    @RequestMapping("getAllCommentsByNoteId")
    @ResponseBody
    public Message getAllCommentsByNoteId(@RequestParam(value = "noteId")Integer noteId){
        return Message.success().add("allComments",commentService.getCommentListByNoteId(noteId));
    }

    /**
     * 回复某人
     * @param comment
     * @return
     */
    @RequestMapping("commentToSomeone")
    @ResponseBody
    public Message commentToSomeone(Comment comment){
        commentService.commentToSomeone(comment.getFollowTravelNoteId(),comment.getCreateId(),comment.getReplyCommentId(),comment.getSignReplyCommentId(),comment.getContent());
        return Message.success();
    }

    /**
     * 回复某篇游记
     * @param comment
     * @return
     */
    @RequestMapping("commentToSomeNote")
    @ResponseBody
    public Message commentToSomeNote(Comment comment){
        commentService.commentToSomeNote(comment.getFollowTravelNoteId(),comment.getCreateId(),comment.getContent());
        return Message.success();
    }

    /**
     * 删除评论
     * @param comment
     * @return
     */
    @RequestMapping("deleteMyComment")
    @ResponseBody
    public Message deleteMyComment(Comment comment){
        if(commentService.deleteCommentByNoteIdAndCommentIdAndUserId(comment.getTravelNoteCommentId(),comment.getFollowTravelNoteId(),comment.getCreateId()))
        return  Message.success();
        return Message.fail();
    }



}
