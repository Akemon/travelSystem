package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNode;

public interface InstantNodeMapper {
    int deleteByPrimaryKey(Integer instantNoteId);

    int insert(InstantNode record);

    InstantNode selectByPrimaryKey(Integer instantNoteId);

    List<InstantNode> selectAll();

    int updateByPrimaryKey(InstantNode record);

    @Select({"select * from tb_instant_note where user_id =#{userId}"})
    @ResultMap("BaseResultMap")
    List<InstantNode> selectByUserId(@Param("userId") String userId);


}