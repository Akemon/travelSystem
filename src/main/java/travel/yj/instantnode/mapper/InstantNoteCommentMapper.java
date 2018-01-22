package travel.yj.instantnode.mapper;

import java.util.List;
import travel.yj.instantnode.bean.InstantNoteComment;

public interface InstantNoteCommentMapper {
    int deleteByPrimaryKey(Integer instantNoteCommentId);

    int insert(InstantNoteComment record);

    InstantNoteComment selectByPrimaryKey(Integer instantNoteCommentId);

    List<InstantNoteComment> selectAll();

    int updateByPrimaryKey(InstantNoteComment record);
}