package travel.hk.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travel.hk.note.bean.Note;
import travel.hk.note.mapper.NoteMapper;

@Service
public class NoteService {
    @Autowired
    NoteMapper noteMapper;

    /**
     * 根据游记id获取游记的详细信息
     * @param id
     * @return
     */
    public Note getNoteByNoteId(int id){
        return noteMapper.selectByPrimaryKey(id);
    }
}
