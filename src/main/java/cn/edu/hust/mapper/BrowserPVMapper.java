package cn.edu.hust.mapper;

import cn.edu.hust.domain.BrowserPV;

import java.util.List;

public interface BrowserPVMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BrowserPV record);

    int insertSelective(BrowserPV record);

    BrowserPV selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BrowserPV record);

    int updateByPrimaryKey(BrowserPV record);

    List<BrowserPV> getList();
}