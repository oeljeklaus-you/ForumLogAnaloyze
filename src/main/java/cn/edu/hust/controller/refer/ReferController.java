package cn.edu.hust.controller.refer;

import cn.edu.hust.service.refer.BrowserDimService;
import cn.edu.hust.service.refer.OSDimService;
import cn.edu.hust.service.refer.ProvinceDimService;
import cn.edu.hust.utils.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/refer")
public class ReferController {
    @Autowired
    private OSDimService osDimService;
    @Autowired
    private BrowserDimService browserDimService;
    @Autowired
    private ProvinceDimService provinceDimService;

    @RequestMapping("/os")
    public @ResponseBody JsonBean getOS()
    {
        return this.osDimService.getOS();
    }

    @RequestMapping("/browser")
    public @ResponseBody JsonBean getBrowser()
    {
        return this.browserDimService.getBrowser();
    }

    @RequestMapping("/province")
    public @ResponseBody JsonBean getProvince()
    {
        return this.provinceDimService.getProvince();
    }
}
