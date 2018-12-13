package com.aotubuy.Controlller;

import com.aotubuy.Model.DollAd;
import com.aotubuy.Model.DollConfig;
import com.aotubuy.Model.DollNavigation;
import com.aotubuy.Service.AdService;
import com.aotubuy.Service.CategoryServive;
import com.aotubuy.Service.HeaderDataService;
import com.aotubuy.Utils.CatTreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by luke on 18-4-19.
 */
@Controller
public class HelloController{
    @Autowired
    HeaderDataService headerDataService;
    @Autowired
    AdService adService;
    @Autowired
    CategoryServive categoryServive;


@RequestMapping("/index")
    public String hello(Map<String,Object> map){
    Map<String,String> configs=headerDataService.getShopInfo();
    DollAd topBannerAd=adService.getIndexTopBannerAd();
    String[] keywords=headerDataService.getShopHotKeyWords();
//    System.out.println(topBannerAd.getAdPosition().getIsOpen());
    List<CatTreeNode> catRoot=categoryServive.getCateTree();
    List<DollNavigation> navigationList=headerDataService.getNavigations();
    map.put("cats",catRoot);
    map.putAll(configs);
    map.put("topBannerAd",topBannerAd);
    map.put("keywords",keywords);
    map.put("navs",navigationList);
    return "hello";
}
}
