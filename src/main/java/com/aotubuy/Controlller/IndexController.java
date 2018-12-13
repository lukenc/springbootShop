package com.aotubuy.Controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by luke on 18-4-25.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String Index(){
        return "index";
    }


}
