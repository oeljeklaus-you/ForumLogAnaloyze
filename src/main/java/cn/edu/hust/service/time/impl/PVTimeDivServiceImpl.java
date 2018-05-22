package cn.edu.hust.service.time.impl;

import cn.edu.hust.domain.HourPV;
import cn.edu.hust.mapper.HourPVMapper;
import cn.edu.hust.service.time.PVTimeDivService;
import cn.edu.hust.utils.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@Service
public class PVTimeDivServiceImpl implements PVTimeDivService {

    @Autowired(required = false)
    private HourPVMapper hourPVMapper;

    @Override
    public JsonBean getPVPerHour()
    {
        JsonBean json=new JsonBean();
        List<HourPV> hourPvs=this.hourPVMapper.selectList();
        Collections.sort(hourPvs, new Comparator<HourPV>() {
            @Override
            public int compare(HourPV o1, HourPV o2) {
                Integer t1=Integer.parseInt(o1.getHour());
                Integer t2=Integer.parseInt(o2.getHour());
                if(t1==t2)
                    return 0;
                if(t1>t2)
                    return 1;
                else return -1;
            }
        });
        List<String> categories=new ArrayList<>();
        List<Integer> datas=new ArrayList<>();
        for (HourPV bean:
                hourPvs) {
            categories.add(bean.getHour());
            datas.add(bean.getPvs());
        }
        json.setCategories(categories);
        json.setDatas(datas);
        return json;
    }


}
