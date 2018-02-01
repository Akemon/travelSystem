package travel.yj.followlist.mapper;

import java.util.List;
import travel.yj.followlist.bean.FollowPeopleList;

public interface FollowPeopleListMapper {
    int deleteByPrimaryKey(Integer followPeopleListId);

    int insert(FollowPeopleList record);

    FollowPeopleList selectByPrimaryKey(Integer followPeopleListId);

    List<FollowPeopleList> selectAll();

    int updateByPrimaryKey(FollowPeopleList record);
}