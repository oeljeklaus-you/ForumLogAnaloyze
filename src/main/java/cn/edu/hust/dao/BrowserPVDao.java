package cn.edu.hust.dao;

import cn.edu.hust.domain.BrowserPV;
import cn.edu.hust.mapper.BrowserPVMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BrowserPVDao implements BrowserPVMapper{
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(BrowserPV record) {
        return 0;
    }

    @Override
    public int insertSelective(BrowserPV record) {
        return 0;
    }

    @Override
    public BrowserPV selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BrowserPV record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(BrowserPV record) {
        return 0;
    }

    @Override
    public List<BrowserPV> getList() {
        String sql="cn.edu.hust.mapper.BrowserPVMapper.getList";
        return this.sqlSessionFactory.openSession().selectList(sql);
    }
}
