package travel.yj.instantnode.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.instantnode.bean.InstantNode;
import travel.yj.instantnode.bean.InstantNotePicture;

public interface InstantNotePictureMapper {
    int deleteByPrimaryKey(Integer instantNotePictureId);

    int insert(InstantNotePicture record);

    InstantNotePicture selectByPrimaryKey(Integer instantNotePictureId);

    List<InstantNotePicture> selectAll();

    int updateByPrimaryKey(InstantNotePicture record);

    @Select("select * from tb_instant_note_picture where instant_note_id=#{instantNodeId}")
    @ResultMap("BaseResultMap")
    List<InstantNode> selectByInstantNodeId(@Param("instantNodeId") Integer instantNodeId);
}