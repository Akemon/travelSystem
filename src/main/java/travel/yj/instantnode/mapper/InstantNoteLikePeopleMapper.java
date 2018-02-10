package travel.yj.instantnode.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNoteLikePeople;

public interface InstantNoteLikePeopleMapper {
    int deleteByPrimaryKey(@Param("instantNoteId") Integer instantNoteId, @Param("userId") String userId);

    int insert(InstantNoteLikePeople record);

    InstantNoteLikePeople selectByPrimaryKey(@Param("instantNoteId") Integer instantNoteId, @Param("userId") String userId);

    List<InstantNoteLikePeople> selectAll();

    int updateByPrimaryKey(InstantNoteLikePeople record);

    @Select("select * from tb_instant_note_like_people where instant_note_id = #{instantNoteId}")
    @ResultMap("BaseResultMap")
    List<InstantNoteLikePeople> selectByInstantNoteId(@Param("instantNoteId") Integer instantNoteId);
}