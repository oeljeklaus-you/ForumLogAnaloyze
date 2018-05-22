package cn.edu.hust.dao;

import cn.edu.hust.domain.HourPV;
import cn.edu.hust.mapper.HourPVMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HourPVDao implements HourPVMapper {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(HourPV record) {
        return 0;
    }

    @Override
    public int insertSelective(HourPV record) {
        return 0;
    }

    @Override
    public HourPV selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(HourPV record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(HourPV record) {
        return 0;
    }

    @Override
    public List<HourPV> selectList() {
        String sql="cn.edu.hust.mapper.HourPVMapper.selectList";
        return this.sqlSessionFactory.openSession().selectList(sql);
    }
}
