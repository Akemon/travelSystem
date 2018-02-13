package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNoteComment;

/**
 * @author 杨景
 */
public interface InstantNoteCommentMapper {
    /**
     * 根据评论Id删除对应的评论内容
     * @param instantNoteCommentId 需要删除的评论Id
     * @return 删除的评论条数
     */
    int deleteByPrimaryKey(Integer instantNoteCommentId);

    /**
     * 插入对应的评论内容
     * @param record 新的评论内容
     * @return 插入数据库的条数
     */
    int insert(InstantNoteComment record);

    /**
     * 根据朋友圈评论Id筛选对应的朋友圈评论
     * @param instantNoteCommentId 朋友圈评论Id
     * @return 朋友圈评论
     */
    InstantNoteComment selectByPrimaryKey(Integer instantNoteCommentId);

    /**
     * 获取所有的朋友圈评论
     * @return 所有的朋友圈评论列表
     */
    List<InstantNoteComment> selectAll();

    /**
     * 根据对应的朋友圈评论更新对应的实体
     * @param record 需要更新的朋友圈评论实体
     * @return 更新的条数
     */
    int updateByPrimaryKey(InstantNoteComment record);

    /**
     * 根据朋友圈的Id获取对应的朋友圈内容
     * @param instantNoteId 朋友圈Id
     * @return 对应的朋友圈评论
     */
    @Select("select * from tb_instant_note_comment where instant_note_id=#{instantNoteId} order by gmt_create asc")
    @ResultMap("BaseResultMap")
    List<InstantNoteComment> selectByInstantNodeId(@Param("instantNoteId") Integer instantNoteId);

    /**
     * 根据用户Id获取其发过的朋友圈评论
     * @param userId 用户Id
     * @return 用户对应的朋友圈评论
     */
    @Select("select * from tb_instant_note_comment where user_id=#{userId} order by gmt_create asc")
    @ResultMap("BaseResultMap")
    List<InstantNoteComment> selectByUserId(@Param("userId")String userId);

    /**
     * 根据回复的朋友圈评论Id获取对应的朋友圈评论实体列表
     * @param commentId 回复的朋友圈评论Id
     * @return 朋友圈评论实体列表
     */
    @Select("select * from tb_instant_note_comment where reply_comment_id=#{commentId} order by gmt_create asc")
    @ResultMap("BaseResultMap")
    List<InstantNoteComment> selectByReplyCommentId(@Param("commentId")Integer commentId);

    /**
     * 根据朋友圈id删除对应的朋友圈评论
     * @param instantNoteId 朋友圈id
     * @return 删除的朋友圈评论数目
     */
    @Delete(value = "delete  from tb_instant_note_comment where instant_note_id=#{instantNoteId}")
    int deleteListInstantNoteCommentByInstantNoteId(Integer instantNoteId);
}