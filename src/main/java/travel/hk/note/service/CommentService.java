package travel.hk.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.common.util.CheckUtil;
import travel.common.util.DateUtil;
import travel.hk.note.bean.Comment;
import travel.hk.note.bean.CommentExample;
import travel.hk.note.mapper.CommentMapper;
import travel.hk.util.ChectUtil;

import java.util.*;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class CommentService {
    @Autowired
    CommentMapper commentMapper;


    /**
     * 回复某条游记的评论，即创建的第一条评论
     * @param noteId 游记id
     * @param userId 用户id
     * @param content 评论的内容
     * @return
     */
    public void commentToSomeNote(int noteId,String userId,String content){
            if(checkParams(noteId,userId,content)){
                Comment comment =new Comment();
                comment.setFollowTravelNoteId(noteId);
                comment.setCreateId(userId);
                comment.setContent(content);
                comment.setGmtCreate(new Date());
                comment.setGmtModifited(new Date());
                commentMapper.insertSelective(comment);
            }

    }


    /**
     * 对某人的评论
     * @param noteId 游记Id
     * @param userId 用户Id
     * @param replyUserId 回复的用户Id
     * @param signReplyCommentId 标记创建此条评论的用户所在的评论Id
     * @param content 评论的内容
     */
    public void commentToSomeone(int noteId,String userId,String replyUserId,int signReplyCommentId,String content) {
        if (checkParams(noteId, userId, replyUserId,signReplyCommentId,content)) {
            Comment comment = new Comment();
            comment.setFollowTravelNoteId(noteId);
            comment.setCreateId(userId);
            comment.setReplyCommentId(replyUserId);
            comment.setContent(content);
            comment.setSignReplyCommentId(signReplyCommentId);
            comment.setGmtCreate(new Date());
            comment.setGmtModifited(new Date());
            commentMapper.insertSelective(comment);
        }
    }

//    /**
//     * 列出一篇游记的所有评论
//     * @param noteId
//     * @return
//     */
//    public HashMap<Comment,List<Comment>> getCommentListByNoteId(int noteId){
//        Iterator iterator =getFirstCreateCommentListByNoteId(noteId).iterator();
//        HashMap<Comment,List<Comment>> commentListHashMap =new HashMap<>();
//        while (iterator.hasNext()){
//            Comment comment = (Comment) iterator.next();
//       //     System.out.println("评论内容："+comment.getContent());
//            List<Comment> commentList =getAllReplyCommentListByNoteIdAndCommentId(comment.getTravelNoteCommentId(),comment.getFollowTravelNoteId());
//            commentListHashMap.put(comment,commentList);
//        }
//        return commentListHashMap;
//    }

    /**
     * 列出一篇游记的所有评论
     * @param noteId
     * @return
     */
    public List<List<Comment>> getCommentListByNoteId(int noteId){
        List<List<Comment>> commentLists =new ArrayList<>();
        Iterator iterator =getFirstCreateCommentListByNoteId(noteId).iterator();
        while(iterator.hasNext()){
            List<Comment> commentList=new ArrayList<>();
            Comment  comment =(Comment) iterator.next();
            commentList.add(comment);
            List<Comment> tempCommentList =getAllReplyCommentListByNoteIdAndCommentId(comment.getTravelNoteCommentId(),comment.getFollowTravelNoteId());
            if(tempCommentList!=null)
            commentList.addAll(tempCommentList);
            commentLists.add(commentList);
        }
        return commentLists;
    }

    /**
     * 根据游记Id获取所有用户创建的第一条评论
     * @param noteId
     * @return
     */
    public List<Comment> getFirstCreateCommentListByNoteId(int noteId){
        CommentExample commentExample =new CommentExample();
        CommentExample.Criteria criteria =commentExample.createCriteria();
        criteria.andSignReplyCommentIdEqualTo(0);
        criteria.andFollowTravelNoteIdEqualTo(noteId);
        return commentMapper.selectByExample(commentExample);
    }

    /**
     * 根据游记id和评论id获取此条评论的所有回复
     * @param commentId
     * @param noteId
     * @return
     */
    public List<Comment> getAllReplyCommentListByNoteIdAndCommentId(int commentId,int noteId){
        CommentExample commentExample =new CommentExample();
        CommentExample.Criteria criteria =commentExample.createCriteria();
        criteria.andSignReplyCommentIdEqualTo(commentId);
        criteria.andFollowTravelNoteIdEqualTo(noteId);
        return commentMapper.selectByExample(commentExample);
    }

    /**
     * 删除评论
     * @param commentId 评论Id
     * @param noteId 游记Id
     * @param userId 用户Id
     * @return 返回是否删除成功
     */
    public boolean deleteCommentByNoteIdAndCommentIdAndUserId(int commentId,int noteId,String userId){
        //两种可能
        //1、这条评论是本人创建的第一条评论
        //2、这条评论是回复某人的评论
        Comment comment =commentMapper.selectByPrimaryKey(commentId);
        int signReplyCommentId =comment.getSignReplyCommentId();
        String tempUserId =comment.getCreateId();
        //不是本人在删除
        if(!tempUserId.equals(userId)) return false;
        //回复某人的情况，直接删除一条
        if(signReplyCommentId!=0){
            commentMapper.deleteByPrimaryKey(commentId);
        }
        //自己创建的第一条评论，需要删除回复的所有评论
        else{
            CommentExample commentExample =new CommentExample();
            CommentExample.Criteria criteria =commentExample.createCriteria();
            criteria.andSignReplyCommentIdEqualTo(commentId);
            //删除所有回复
            commentMapper.deleteByExample(commentExample);
            //删除创建的第一条评论
            commentMapper.deleteByPrimaryKey(commentId);
        }
        return true;
    }

    private boolean checkParams(int noteId, String userId, String replyUserId, int signReplyCommentId, String content) {
        return !CheckUtil.isStringNull(userId)&&!CheckUtil.isStringNull(replyUserId)&&!CheckUtil.isIntegerNull(signReplyCommentId)
                &&!CheckUtil.isStringNull(content)&&!CheckUtil.isIntegerNull(noteId);
    }

    private boolean checkParams(int noteId, String userId, String content) {
        return !CheckUtil.isStringNull(userId)&&!CheckUtil.isStringNull(content)&&!CheckUtil.isIntegerNull(noteId);
    }
}
