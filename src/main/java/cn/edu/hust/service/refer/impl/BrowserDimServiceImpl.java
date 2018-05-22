package cn.edu.hust.service.refer.impl;

import cn.edu.hust.domain.BrowserPV;
import cn.edu.hust.domain.OSPV;
import cn.edu.hust.mapper.BrowserPVMapper;
import cn.edu.hust.service.refer.BrowserDimService;
import cn.edu.hust.utils.JsonBean;
import cn.edu.hust.utils.KeyVlaue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BrowserDimServiceImpl implements BrowserDimService {
    @Autowired(required = false)
    private BrowserPVMapper browserPVMapper;
    @Override
    public JsonBean getBrowser() {
        List<BrowserPV> browserPVS=this.browserPVMapper.getList();
        JsonBean json=new JsonBean();
        List<KeyVlaue> kvs=new LinkedList<>();
        for (BrowserPV o:browserPVS)
        {
            KeyVlaue kv=new KeyVlaue(new Long(o.getPvs()),o.getBrowser());
            kvs.add(kv);
        }
        json.setKeyValues(kvs);
        return json;
    }
}
