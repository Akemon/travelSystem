package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNoteComment;

public interface InstantNoteCommentMapper {
    int deleteByPrimaryKey(Integer instantNoteCommentId);

    int insert(InstantNoteComment record);

    InstantNoteComment selectByPrimaryKey(Integer instantNoteCommentId);

    List<InstantNoteComment> selectAll();

    int updateByPrimaryKey(InstantNoteComment record);

    @Select("select * from tb_instant_note_comment where instant_note_id=#{instantNodeId}")
    @ResultMap("BaseResultMap")
    List<InstantNoteComment> selectByInstantNodeId(@Param("instantNodeId") Integer instantNodeId);

    @Select("select * from tb_instant_note_comment where user_id=#{userId}")
    @ResultMap("BaseResultMap")
    List<InstantNoteComment> selectByUserId(@Param("userId")String userId);

    @Select("select * from tb_instant_note_comment where reply_comment_id=#{commentId}")
    @ResultMap("BaseResultMap")
    List<InstantNoteComment> selectByReplyCommentId(@Param("commentId")Integer commentId);
}