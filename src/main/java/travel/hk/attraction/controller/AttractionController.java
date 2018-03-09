package travel.hk.attraction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/getAttractionById")
    @ResponseBody
    public Message getAttractionById(@RequestParam(value = "attractionID")Integer attractionID){
        if(!ChectUtil.isIntegerNull(attractionID)){
            Attraction attraction =attractionService.getAttractionById(attractionID);
            if(attraction!=null) return Message.success().add("extend",attraction);
        }
        return Message.fail();

    }

    @RequestMapping("/getAllAttractions")
    @ResponseBody
    public Message getAllAttractions(){
        return Message.success().add("extend",attractionService.getAllAttractions());
    }
}
