package cn.edu.hust.mapper;

import cn.edu.hust.domain.OSPV;

import java.util.List;

public interface OSPVMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OSPV record);

    int insertSelective(OSPV record);

    OSPV selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OSPV record);

    int updateByPrimaryKey(OSPV record);

    List<OSPV> getListByTime();
}