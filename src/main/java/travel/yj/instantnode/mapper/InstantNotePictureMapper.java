package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNote;
import travel.yj.instantnode.bean.InstantNotePicture;

/**
 * @author 杨景
 */
public interface InstantNotePictureMapper {
    /**
     * 根据朋友圈图片Id(主键)删除对应的朋友圈图片
     * @param instantNotePictureId
     * @return 删除的记录数
     */
    int deleteByPrimaryKey(Integer instantNotePictureId);

    /**
     * 插入一条朋友圈图片
     * @param record 被插入的朋友圈实体
     * @return 插入的记录数
     */
    int insert(InstantNotePicture record);

    /**
     * 根据朋友圈图片Id筛选出对应的实体
     * @param instantNotePictureId 需要筛选的朋友圈Id
     * @return 对应的实体 InstantNotePicture
     */
    InstantNotePicture selectByPrimaryKey(Integer instantNotePictureId);

    /**
     * 筛选所有的朋友圈图片信息
     * @return 所有的朋友圈图片
     */
    List<InstantNotePicture> selectAll();

    /**
     * 根据传入的InstantNotePicture实体类Id更新对应的InstantNotePicture
     * @param record 更新的InstantNotePicture
     * @return 更新的条数
     */
    int updateByPrimaryKey(InstantNotePicture record);

    /**
     * 根据朋友圈的id获取对应的朋友圈图片列表
     * @param instantNodeId 朋友圈id
     * @return 对应的朋友圈的Id
     */
    @Select("select * from tb_instant_note_picture where instant_note_id=#{instantNodeId} ")
    @ResultMap("BaseResultMap")
    List<InstantNote> selectByInstantNodeId(@Param("instantNodeId") Integer instantNodeId);
}