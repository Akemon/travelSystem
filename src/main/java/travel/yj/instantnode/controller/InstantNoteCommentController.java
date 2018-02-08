package travel.yj.instantnode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.yj.instantnode.service.InstantNoteCommentService;

/**
 * @author 杨景
 */
@Controller
@RequestMapping("instantNoteComment")
public class InstantNoteCommentController {
    @Autowired
    private InstantNoteCommentService instantNoteCommentService;

    @RequestMapping(value="addInstantNoteComment",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String addInstantNoteComment(Integer instantNoteId,String loginUserId,String replyUserId,String content){
        String result=instantNoteCommentService.addInstantNoteComment(instantNoteId,loginUserId,replyUserId,content);
        return result;
    }

    @RequestMapping(value="addInstantNoteComment",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String deleteOneInstantNoteCommentById(Integer instantNoteCommentId){
        String result=instantNoteCommentService.deleteOneInstantNoteCommentById(instantNoteCommentId);
        return result;
    }
}
