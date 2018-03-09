package travel.hk.attraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travel.hk.attraction.bean.Attraction;
import travel.hk.attraction.mapper.AttractionMapper;

import java.util.List;

@Service
public class AttractionService {
    @Autowired
    AttractionMapper attractionMapper;

    /**
     * 根据主键id获取景点的详细信息
     * @param id
     * @return
     */
    public Attraction getAttractionById(int id){
        return attractionMapper.selectByPrimaryKey(id);
    }

    /**
     * 获取所有的景点信息
     * @return
     */
    public List<Attraction> getAllAttractions(){
        return attractionMapper.selectByExample(null);
    }
}
