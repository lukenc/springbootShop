package com.aotubuy.Service;

import com.aotubuy.Model.DollConfig;
import com.aotubuy.Model.DollNavigation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by luke on 18-4-25.
 */

public interface HeaderDataService {
   List<DollConfig> getHeaderData();
    Map<String,String> getShopInfo();
    String[] getShopHotKeyWords();
    List<DollNavigation> getNavigations();
    Map<String,String>  getSmsConfigs();
}
