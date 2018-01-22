package travel.yj.instantnode.mapper;

import java.util.List;
import travel.yj.instantnode.bean.InstantNotePicture;

public interface InstantNotePictureMapper {
    int deleteByPrimaryKey(Integer instantNotePictureId);

    int insert(InstantNotePicture record);

    InstantNotePicture selectByPrimaryKey(Integer instantNotePictureId);

    List<InstantNotePicture> selectAll();

    int updateByPrimaryKey(InstantNotePicture record);
}