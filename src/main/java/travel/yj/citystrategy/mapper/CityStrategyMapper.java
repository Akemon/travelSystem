package travel.yj.citystrategy.mapper;

import java.util.List;
import travel.yj.citystrategy.bean.CityStrategy;

public interface CityStrategyMapper {
    int deleteByPrimaryKey(Integer cityStrategyId);

    int insert(CityStrategy record);

    CityStrategy selectByPrimaryKey(Integer cityStrategyId);

    List<CityStrategy> selectAll();

    int updateByPrimaryKey(CityStrategy record);
}