package travel.yj.instantnode.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
public class InstantNoteCommentService {

    public String addInstantNoteComment(){
        return null;
    }

    public String deleteInstantNoteComment(){
        return null;
    }

}
