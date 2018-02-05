package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNote;

/**
 * @author 杨景
 */
public interface InstantNoteMapper {

    /**
     * 根据朋友圈Id删除对应的朋友圈内容记录
     * @param instantNoteId 朋友圈id
     * @return 数据库删除的记录数
     */
    int deleteByPrimaryKey(Integer instantNoteId);

    /**
     * 插入新的朋友圈记录
     * @param record 新的朋友圈实体
     * @return
     */
    int insert(InstantNote record);

    /**
     * 根据朋友圈Id获取对应的朋友圈记录
     * @param instantNoteId 朋友圈Id
     * @return 对应的朋友圈实体
     */
    InstantNote selectByPrimaryKey(Integer instantNoteId);

    /**
     *
     * 筛选所有的朋友圈内容
     * @return 所有的朋友圈内容
     */
    List<InstantNote> selectAll();

    /**
     * 根据朋友圈内容更新对应的朋友圈实体
     * @param record 需要更新的朋友圈记录
     * @return 更新的数目
     */
    int updateByPrimaryKey(InstantNote record);


    /**
     * 根据用户Id获取他自己发送的朋友圈内容列表
     * @param userId 用户Id
     * @return 朋友圈内容列表
     */
    @Select({"select * from tb_instant_note where user_id =#{userId}"})
    @ResultMap("BaseResultMap")
    List<InstantNote> selectByUserId(@Param("userId") String userId);


    /**
     * 筛选出我的朋友圈列表
     * @param ids 我关注用户Id列表 如: '1','2','3'
     * @return 对应的朋友圈列表
     */
    @Select({"select * from tb_instant_note where user_id in(${ids}) order by gmt_create desc"})
    @ResultMap("BaseResultMap")
    List<InstantNote> selectMyInstantNote(@Param("ids") String ids);


}