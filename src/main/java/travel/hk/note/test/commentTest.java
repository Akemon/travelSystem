package travel.hk.note.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import travel.hk.note.bean.Comment;
import travel.hk.note.mapper.CommentMapper;
import travel.hk.note.service.CommentService;
import travel.hk.userinfo.bean.UserInfo;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class commentTest {
    @Autowired
    CommentMapper commentMapper;

    @Autowired
    CommentService commentService;

    @Test
    public void testOneComment(){
        Comment comment =commentMapper.selectByPrimaryKey(3);
        UserInfo createUser =comment.getCreateUserInfo();
        UserInfo replyUser =comment.getReplyUserInfo();

        System.out.println("评论者姓名 ："+createUser.getName());
        System.out.println("回复者姓名 ："+replyUser.getName());
        System.out.println("创建评论的ID ："+comment.getSignReplyCommentId());
    }

    /**
     * 测试回复游记
     */
     @Test
    public void testCommentToNote(){
         commentService.commentToSomeNote(1,"1","哈哈哈，第一条评论老子创建的");
     }

    /**
     * 测试回复某人的评论
     */
    @Test
    public void testCommentToSomeOne(){ //commentService.commentToSomeone(1,"1","2");
        commentService.commentToSomeone(1,"2","1",4,"傻狗");
    }

    /**
     * 测试评论的遍历
     */
    @Test
    public void testGetAllComments(){
        commentService.getCommentListByNoteId(1);
    }

    /**
     * 测试删除评论
     */
    @Test
    public void deleteComments(){
        System.out.println(commentService.deleteCommentByNoteIdAndCommentIdAndUserId(4,1,"1"));
    }
}
