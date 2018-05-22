package cn.edu.hust.controller.time;

import cn.edu.hust.service.time.PVTimeDivService;
import cn.edu.hust.utils.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/time")
public class PVTimeDivController {

    @Autowired
    private PVTimeDivService pvTimeDivService;

    @RequestMapping("/hour")
    public @ResponseBody JsonBean getPVPerHour()
    {
        return this.pvTimeDivService.getPVPerHour();
    }
}
