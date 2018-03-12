package travel.hk.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.hk.note.bean.CommentExample;
import travel.hk.note.bean.ContentExample;
import travel.hk.note.bean.Note;
import travel.hk.note.bean.NoteCollectionExample;
import travel.hk.note.mapper.CommentMapper;
import travel.hk.note.mapper.ContentMapper;
import travel.hk.note.mapper.NoteCollectionMapper;
import travel.hk.note.mapper.NoteMapper;

import java.util.Date;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class NoteService {
    @Autowired
    NoteMapper noteMapper;

    @Autowired
    NoteCollectionMapper noteCollectionMapper;

    @Autowired
    ContentMapper contentMapper;

    @Autowired
    CommentMapper commentMapper;
    /**
     * 根据游记id获取游记的详细信息
     * @param id
     * @return
     */
    public Note getNoteByNoteId(int id){
        return noteMapper.selectByPrimaryKey(id);
    }

    /**
     * 插入一篇游记
     * @param note
     */
    public void insertNewNote(Note  note){
        note.setGmtCreate(new Date());
        note.setGmtModifited(new Date());
        noteMapper.insertSelective(note);
    }

    /**
     * 删除一篇游记
     * @param note
     * @return
     */
    public boolean deleteOneNote(Note note){
        //判断是否本人
        Note tempNote =noteMapper.selectByPrimaryKey(note.getTravelNoteId());
        if(!note.getUserId().equals(tempNote.getUserId())) return false;

        //1、删除游记的收藏关联
        NoteCollectionExample noteCollectionExample =new NoteCollectionExample();
        NoteCollectionExample.Criteria criteria =noteCollectionExample.createCriteria();
        criteria.andTravelNoteIdEqualTo(note.getTravelNoteId());
        noteCollectionMapper.deleteByExample(noteCollectionExample);

        //2、删除游记的内容
        ContentExample contentExample =new ContentExample();
        ContentExample.Criteria criteria1 =contentExample.createCriteria();
        criteria1.andTravelNoteIdEqualTo(note.getTravelNoteId());
        contentMapper.deleteByExample(contentExample);

        //3、删除游记的评论信息
        CommentExample commentExample =new CommentExample();
        CommentExample.Criteria criteria2 =commentExample.createCriteria();
        criteria2.andFollowTravelNoteIdEqualTo(note.getTravelNoteId());
        commentMapper.deleteByExample(commentExample);

        //4、删除游记
        noteMapper.deleteByPrimaryKey(note.getTravelNoteId());

        return true;
    }
}
