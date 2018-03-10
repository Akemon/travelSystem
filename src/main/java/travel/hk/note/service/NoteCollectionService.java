package travel.hk.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travel.hk.note.bean.NoteCollection;
import travel.hk.note.bean.NoteCollectionExample;
import travel.hk.note.mapper.NoteCollectionMapper;

import java.util.Date;
import java.util.List;

@Service
public class NoteCollectionService {
    @Autowired
    NoteCollectionMapper noteCollectionMapper;

    /**
     * 根据用户id获取该用户的所有收藏
     * @param userId
     * @return
     */
    public List<NoteCollection> getAllCollectionByUserId(String userId){
        return noteCollectionMapper.selectAllCollectionByUserId(userId);
    }

    /**
     * 取消收藏
     * @param userId
     * @param noteId
     */
    public void cancelCollection(String userId,int noteId){
        noteCollectionMapper.cancelCollection(userId,noteId);
    }

    /**
     * 收藏游记
     * @param userId
     * @param noteId
     */
    public boolean collectSomeNote(String userId,int noteId){
        //判断用户是否已收藏
        NoteCollectionExample noteCollectionExample = new NoteCollectionExample();
        NoteCollectionExample.Criteria criteria =noteCollectionExample.createCriteria();
        criteria.andCollectUserIdEqualTo(userId);
        criteria.andTravelNoteIdEqualTo(noteId);
        List<NoteCollection> noteCollections =noteCollectionMapper.selectByExample(noteCollectionExample);
       // System.out.println(noteCollections);
        if(noteCollections.size()==0){
            //用户收藏过程
            NoteCollection noteCollection =new NoteCollection();
            noteCollection.setCollectUserId(userId);
            noteCollection.setTravelNoteId(noteId);
            noteCollection.setGmtCreate(new Date());
            noteCollection.setGmtModifited(new Date());
            noteCollectionMapper.insertSelective(noteCollection);
            return true;
        }
        //用户已收藏的情况
        else{
            return false;
        }



    }


}
