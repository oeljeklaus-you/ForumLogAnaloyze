package cn.edu.hust.mapper;

import cn.edu.hust.domain.UVVisit;

public interface UVVisitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UVVisit record);

    int insertSelective(UVVisit record);

    UVVisit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UVVisit record);

    int updateByPrimaryKey(UVVisit record);
}