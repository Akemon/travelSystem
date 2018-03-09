package travel.hk.note.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.hk.note.bean.NoteCollection;
import travel.hk.note.bean.NoteCollectionExample;

public interface NoteCollectionMapper {
    long countByExample(NoteCollectionExample example);

    int deleteByExample(NoteCollectionExample example);

    int deleteByPrimaryKey(Integer travelNoteCollectionId);

    int insert(NoteCollection record);

    int insertSelective(NoteCollection record);

    List<NoteCollection> selectByExample(NoteCollectionExample example);

    NoteCollection selectByPrimaryKey(Integer travelNoteCollectionId);

    int updateByExampleSelective(@Param("record") NoteCollection record, @Param("example") NoteCollectionExample example);

    int updateByExample(@Param("record") NoteCollection record, @Param("example") NoteCollectionExample example);

    int updateByPrimaryKeySelective(NoteCollection record);

    int updateByPrimaryKey(NoteCollection record);

    //根据用户id获取收藏信息
    @Select("select * from tb_travel_note_collection where collect_user_id =#{userId}")
    @ResultMap("BaseResultMap")
    List<NoteCollection> selectAllCollectionByUserId(@Param("userId")String userID);

    //取消收藏
    @Delete("delete from tb_travel_note_collection where collect_user_id =#{userId} and travel_note_id =#{noteId}")
    void cancelCollection(@Param("userId")String userID,@Param("noteId")int noteId);

}