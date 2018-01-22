package travel.yj.instantnode.mapper;

import java.util.List;
import travel.yj.instantnode.bean.InstantNode;

public interface InstantNodeMapper {
    int deleteByPrimaryKey(Integer instantNoteId);

    int insert(InstantNode record);

    InstantNode selectByPrimaryKey(Integer instantNoteId);

    List<InstantNode> selectAll();

    int updateByPrimaryKey(InstantNode record);
}