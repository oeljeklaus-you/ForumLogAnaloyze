package cn.edu.hust.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
    @RequestMapping("/os")
    public String getOS()
    {
        return "os";
    }

    @RequestMapping("/browser")
    public String getBrowser()
    {
        return "browser";
    }

    @RequestMapping("/province")
    public String getProvince()
    {
        return "province";
    }

    @RequestMapping("/map")
    public String getMap()
    {
        return "map";
    }
}
