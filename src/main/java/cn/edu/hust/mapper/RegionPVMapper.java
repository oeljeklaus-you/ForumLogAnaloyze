package cn.edu.hust.mapper;

import cn.edu.hust.domain.RegionPV;

import java.util.List;

public interface RegionPVMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegionPV record);

    int insertSelective(RegionPV record);

    RegionPV selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegionPV record);

    int updateByPrimaryKey(RegionPV record);

    List<RegionPV> getList();
}