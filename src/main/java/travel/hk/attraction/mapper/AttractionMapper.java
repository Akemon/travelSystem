package travel.hk.attraction.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import travel.hk.attraction.bean.Attraction;
import travel.hk.attraction.bean.AttractionExample;

public interface AttractionMapper {
    long countByExample(AttractionExample example);

    int deleteByExample(AttractionExample example);

    int deleteByPrimaryKey(Integer touristAttractionId);

    int insert(Attraction record);

    int insertSelective(Attraction record);

    List<Attraction> selectByExample(AttractionExample example);

    Attraction selectByPrimaryKey(Integer touristAttractionId);

    int updateByExampleSelective(@Param("record") Attraction record, @Param("example") AttractionExample example);

    int updateByExample(@Param("record") Attraction record, @Param("example") AttractionExample example);

    int updateByPrimaryKeySelective(Attraction record);

    int updateByPrimaryKey(Attraction record);
}