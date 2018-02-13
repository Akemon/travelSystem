package travel.yj.instantnode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.yj.instantnode.service.InstantNoteLikePeopleService;

/**
 * @author 杨景
 */
@Controller
@RequestMapping("InstantNoteLike")
public class InstantNoteLikePeopleController {

    @Autowired
    private InstantNoteLikePeopleService instantNoteLikePeopleService;

    @RequestMapping(value="addInstantNoteLike",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String addInstantNoteLike(Integer instantNoteId,String creatorId){

        return instantNoteLikePeopleService.addInstantNoteLikePeople(instantNoteId,creatorId);
    }

    @RequestMapping(value="cancelLikeInstantNote",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String  cancelLikeInstantNote(Integer instantNoteId,String creatorId){
        return instantNoteLikePeopleService.cancelLikeInstantNote(instantNoteId,creatorId);
    }


}
