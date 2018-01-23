package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNote;

public interface InstantNoteMapper {
    int deleteByPrimaryKey(Integer instantNoteId);

    int insert(InstantNote record);

    InstantNote selectByPrimaryKey(Integer instantNoteId);

    List<InstantNote> selectAll();

    int updateByPrimaryKey(InstantNote record);

    @Select({"select * from tb_instant_note where user_id =#{userId}"})
    @ResultMap("BaseResultMap")
    List<InstantNote> selectByUserId(@Param("userId") String userId);


}