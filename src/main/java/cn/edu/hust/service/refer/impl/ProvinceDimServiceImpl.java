package cn.edu.hust.service.refer.impl;

import cn.edu.hust.domain.RegionPV;
import cn.edu.hust.mapper.RegionPVMapper;
import cn.edu.hust.service.refer.ProvinceDimService;
import cn.edu.hust.utils.JsonBean;
import cn.edu.hust.utils.KeyValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProvinceDimServiceImpl implements ProvinceDimService {
    @Autowired(required = false)
    private RegionPVMapper regionPVMapper;
    @Override
    public JsonBean getProvince() {
        List<RegionPV> regionPVList=this.regionPVMapper.getList();
        List<KeyValue> kvs=new ArrayList<>();
        JsonBean bean=new JsonBean();
        HashMap<String,Integer> t=new HashMap<>();
        for (RegionPV regionPV:regionPVList)
        {
            if(!regionPV.getProvince().equals("未知"))
            {
                if(t.get(regionPV.getProvince())!=null)
                {
                    t.put(regionPV.getProvince(),regionPV.getPvs()+t.get(regionPV.getProvince()));
                }
                else
                {
                    t.put(regionPV.getProvince(),regionPV.getPvs());
                }

            }
        }
        Long max=0L;
        Long min=Long.MAX_VALUE;
        for(Map.Entry<String,Integer> t1 :t.entrySet())
        {
            if(t1.getValue()>max) max=new Long(t1.getValue());
            if(t1.getValue()<min) min=new Long(t1.getValue());
            KeyValue kv=new KeyValue(t1.getKey(),new Long(t1.getValue()));
            kvs.add(kv);
        }
        bean.setKeyValues2(kvs);
        bean.setMax(max);
        bean.setMin(min);
        return bean;
    }
}
