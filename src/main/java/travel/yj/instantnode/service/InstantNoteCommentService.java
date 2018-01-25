package travel.yj.instantnode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import travel.yj.instantnode.mapper.InstantNoteCommentMapper;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNoteCommentService {

    @Autowired
    private InstantNoteService instantNoteService;
    @Autowired
    private InstantNoteCommentMapper instantNoteCommentMapper;

    public String addInstantNoteComment(){
        return null;
    }

    /**
     * 根据instantNoteId 删除对应的所有留言
     * @param instantNoteId 需要删除的instantNoteId
     * @return 删除结果
     */
    public String deleteListInstantNoteComment(Integer instantNoteId){
        //1.删除instantNoteId 对应的所有留言
        instantNoteCommentMapper.deleteListInstantNoteCommentByInstantNoteId(instantNoteId);
        return "删除成功!";
    }

}
