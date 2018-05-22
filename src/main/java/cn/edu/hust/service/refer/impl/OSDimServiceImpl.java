package cn.edu.hust.service.refer.impl;

import cn.edu.hust.domain.OSPV;
import cn.edu.hust.mapper.OSPVMapper;
import cn.edu.hust.service.refer.OSDimService;
import cn.edu.hust.utils.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.hust.utils.KeyVlaue;
import java.util.LinkedList;
import java.util.List;

@Service
public class OSDimServiceImpl implements OSDimService{

    @Autowired(required = false)
    private OSPVMapper ospvMapper;

    @Override
    public JsonBean getOS() {
        List<OSPV> lists=this.ospvMapper.getListByTime();
        JsonBean json=new JsonBean();
        List<KeyVlaue> kvs=new LinkedList<>();

        for (OSPV o:lists)
        {
            KeyVlaue kv=new KeyVlaue(o.getPvs(),o.getOs());
            kvs.add(kv);
        }
        json.setKeyValues(kvs);
        return json;
    }
}
