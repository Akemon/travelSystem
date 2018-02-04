package travel.yj.followlist.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import travel.yj.followlist.bean.FollowPeopleList;

/**@author 杨景 */
public interface FollowPeopleListMapper {
    /**
     * 根据followPeopleListId删除一条关注列表信息
     * @param followPeopleListId 需要删除的一条关注列表id
     * @return 删除条数
     */
    int deleteByPrimaryKey(Integer followPeopleListId);

    /**
     * 插入一条关注信息
     * @param record 关注信息Bean
     * @return 插入的条数
     */
    int insert(FollowPeopleList record);

    /**
     * 根据关注列表信息的主键followPeopleListId查找其中一条关注信息
     * @param followPeopleListId 需要查找的followPeopleListId
     * @return 需要查找的FollowPeopleList
     */
    FollowPeopleList selectByPrimaryKey(Integer followPeopleListId);

    /**
     * 获取所有的关注列表信息
     * @return 所有关注列表
     */
    List<FollowPeopleList> selectAll();

    /**
     * 更新关注列表信息
     * @param record 新的关注列表bean
     * @return 更新的条数
     */
    int updateByPrimaryKey(FollowPeopleList record);

    /**
     * 根据hostUserId和followUserId获取关注信息
     * @param hostUserId 被关注的Id
     * @param followUserId 关注被关注者的Id
     * @return 关注信息列表FollowPeopleList
     */
    @Select({"select * from tb_follow_people_list where host_user_id=#{hostUserId} and follow_user_id=#{followUserId}"})
    @ResultMap("BaseResultMap")
    FollowPeopleList selectByHostUserIdAndFollowUserId(@Param("hostUserId") String hostUserId , @Param("followUserId") String followUserId);

    /**
     * 根据hostUserId获取关注信息
     * @param hostUserId 被关注的Id
     * @return 关注信息列表FollowPeopleList
     */
    @Select({"select * from tb_follow_people_list where host_user_id=#{hostUserId}"})
    @ResultMap("BaseResultMap")
    List<FollowPeopleList> selectByHostUserId(@Param("hostUserId") String hostUserId);

    /**
     * 根据followUserId获取关注信息
     * @param followUserId 关注被关注者的Id
     * @return 关注信息列表FollowPeopleList
     */
    @Select({"select * from tb_follow_people_list where follow_user_id=#{followUserId}"})
    @ResultMap("BaseResultMap")
    List<FollowPeopleList> selectByFollowUserId(@Param("followUserId") String followUserId);

}