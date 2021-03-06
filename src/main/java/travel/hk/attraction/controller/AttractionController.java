package travel.hk.attraction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.hk.attraction.bean.Attraction;
import travel.hk.attraction.service.AttractionService;
import travel.hk.util.ChectUtil;
import travel.hk.util.Message;


@Controller
@RequestMapping("Attraction")
public class AttractionController {
    @Autowired
    AttractionService attractionService;

    /**
     * 根据景点Id获取详细信息
     * @param attractionID
     * @return
     */
    @RequestMapping("/getAttractionById")
    @ResponseBody
    public Message getAttractionById(@RequestParam(value = "attractionID")Integer attractionID){
        if(!ChectUtil.isIntegerNull(attractionID)){
            Attraction attraction =attractionService.getAttractionById(attractionID);
            if(attraction!=null) return Message.success().add("extend",attraction);
        }
        return Message.fail();

    }

    /**
     * 获取所有景点的信息
     * @return
     */
    @RequestMapping("/getAllAttractions")
    @ResponseBody
    public Message getAllAttractions(){
        return Message.success().add("extend",attractionService.getAllAttractions());
    }

    /**
     * 下载图片
     * @param picturePath
     * @return
     */
    @RequestMapping(value="downloadPicture",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public ResponseEntity<byte[]> downloadPicture(String picturePath){
        return attractionService.downloadPicture(picturePath);
    }


}
