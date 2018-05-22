package cn.edu.hust.mapper;

import cn.edu.hust.domain.UserAvgPV;

public interface UserAvgPVMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAvgPV record);

    int insertSelective(UserAvgPV record);

    UserAvgPV selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAvgPV record);

    int updateByPrimaryKey(UserAvgPV record);
}