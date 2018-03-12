package travel.hk.note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.hk.note.bean.NoteCollection;
import travel.hk.note.mapper.NoteCollectionMapper;
import travel.hk.note.service.NoteCollectionService;
import travel.hk.util.Message;

@Controller
@RequestMapping("NoteCollection")
public class NoteCollectionController {
    @Autowired
    NoteCollectionService noteCollectionService;

    /**
     * 根据用户Id获取所有收藏信息
     * @param userId 用户Id
     * @return
     */
    @RequestMapping("getAllCollectionByUserId")
    @ResponseBody
    public Message getAllCollectionByUserId(@RequestParam(value = "userId")String userId){
        return Message.success().add("result",noteCollectionService.getAllCollectionByUserId(userId));
    }

    /**
     * 取消收藏
     * @param userId 用户Id
     * @param noteId 游记Id
     * @return
     */
    @RequestMapping("cancelCollection")
    @ResponseBody
    public Message cancelCollection(@RequestParam(value = "userId")String userId,@RequestParam(value = "noteId")int noteId){
        noteCollectionService.cancelCollection(userId,noteId);
        return Message.success();
    }

    /**
     * 收藏游记
     * @param userId 用户Id
     * @param noteId 游记Id
     * @return
     */
    @RequestMapping("collectSomeNote")
    @ResponseBody
    public Message collectSomeNote(@RequestParam(value = "userId")String userId,@RequestParam(value = "noteId")int noteId){
        if(noteCollectionService.collectSomeNote(userId,noteId))
            return Message.success();
        return Message.fail();
    }

}
