package travel.yj.citystrategy.service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.yj.citystrategy.bean.CityStrategy;
import travel.yj.citystrategy.mapper.CityStrategyMapper;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class CityStategyService {

    @Autowired
    private CityStrategyMapper cityStrategyMapper;

    public String selectAllCityStategy(){
        List<CityStrategy> listAll=cityStrategyMapper.selectAll();
        return parseListCityStategy(listAll).toString();
    }

    private JsonArray parseListCityStategy(List<CityStrategy> listCityStrategy){
        JsonArray jsonArray=new JsonArray();
        for(CityStrategy cityStrategy:listCityStrategy){
                JsonObject jsonObject=parseCityStategy(cityStrategy);
                jsonArray.add(jsonObject);
        }
        return jsonArray;
    }

    private JsonObject parseCityStategy(CityStrategy cityStrategy){
        JsonObject jsonObject=new JsonObject();
        String cityName=cityStrategy.getCityname();
        String content=cityStrategy.getContent();
        jsonObject.addProperty("cityName",cityName);
        jsonObject.addProperty("content",content);
        return jsonObject;
    }
}
