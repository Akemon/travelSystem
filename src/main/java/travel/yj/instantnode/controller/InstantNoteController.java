package travel.yj.instantnode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import travel.yj.instantnode.service.InstantNoteService;

import java.util.List;

/**
 * @author 杨景
 */
@Controller
@RequestMapping("instantNote")
public class InstantNoteController {

    @Autowired
    private InstantNoteService instantNoteService;

    @RequestMapping(value="addInstantNote",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String addInstantNote(String loginUserId, String content, String location, List<MultipartFile> listPicture) {
        String result=instantNoteService.addOneInstantNote(loginUserId,content,location,listPicture);
        return result;
    }

    @RequestMapping(value="deleteInstantNote",method = RequestMethod.POST,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String deleteInstantNote(Integer instantNoteId){
        String result=instantNoteService.deleteOneInstantNote(instantNoteId);
        return result;
    }

    @RequestMapping(value="selectMyCreateInstantNote",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String selectMyCreateInstantNote(String loginUserId){
        String result=instantNoteService.selectMyInstantNote(loginUserId);
        return result;
    }

    @RequestMapping(value="selectMyInstantNote",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String selectMyInstantNote(String loginUserId){
        String result=instantNoteService.selectMyInstantNote(loginUserId);
        return result;
    }

}
