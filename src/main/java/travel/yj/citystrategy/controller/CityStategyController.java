package travel.yj.citystrategy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import travel.yj.citystrategy.service.CityStategyService;

@Controller
@RequestMapping("cityStategy")
public class CityStategyController {

    @Autowired
    private CityStategyService cityStategyService;

    @RequestMapping(value="selectAll",method = RequestMethod.GET,produces="text/html;charset=UTF-8")
    @ResponseBody
    public String selectAll(){
        return cityStategyService.selectAllCityStategy();
    }
}
