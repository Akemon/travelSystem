package travel.hk.note.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import travel.common.util.CheckUtil;
import travel.common.util.DateUtil;
import travel.hk.note.bean.Comment;
import travel.hk.note.bean.CommentExample;
import travel.hk.note.mapper.CommentMapper;
import travel.hk.util.ChectUtil;

import java.util.*;

@Service
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

    /**
     * 列出一篇游记的所有评论
     * @param noteId
     * @return
     */
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

    private boolean checkParams(int noteId, String userId, String replyUserId, int signReplyCommentId, String content) {
        return !CheckUtil.isStringNull(userId)&&!CheckUtil.isStringNull(replyUserId)&&!CheckUtil.isIntegerNull(signReplyCommentId)
                &&!CheckUtil.isStringNull(content)&&!CheckUtil.isIntegerNull(noteId);
    }

    private boolean checkParams(int noteId, String userId, String content) {
        return !CheckUtil.isStringNull(userId)&&!CheckUtil.isStringNull(content)&&!CheckUtil.isIntegerNull(noteId);
    }
}
