package com.aotubuy.Service.impl;

import com.aotubuy.Dao.DollConfigMapper;
import com.aotubuy.Dao.DollNavigationMapper;
import com.aotubuy.Dao.DollUsersMapper;
import com.aotubuy.Model.DollConfig;
import com.aotubuy.Model.DollGoodsCategory;
import com.aotubuy.Model.DollNavigation;
import com.aotubuy.Model.DollUsers;
import com.aotubuy.Service.HeaderDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luke on 18-4-25.
 */
@Service
public class headerDataServiceImpl implements HeaderDataService {

    @Autowired
    DollConfigMapper dollConfigMapper;
    @Autowired
    DollNavigationMapper navigationMapper;

    @Override
    public List<DollConfig> getHeaderData() {
        List<DollConfig> dollConfigs=dollConfigMapper.selectAll();
        return dollConfigs;
    }

    @Override
    public Map<String, String> getShopInfo() {
        List<DollConfig> dollConfigShopInfos=dollConfigMapper.getShopInfos();
        Map<String,String> shopInfos=new HashMap<String, String>();
        for(DollConfig dollConfig:dollConfigShopInfos){
            shopInfos.put(dollConfig.getName(),dollConfig.getValue());
        }
        return shopInfos;
    }

    @Override
    public String[] getShopHotKeyWords() {
        DollConfig keywords=dollConfigMapper.getShopHotKeyWords();
        return keywords.getValue().split("\\|");
    }

    @Override
    public List<DollNavigation> getNavigations() {
        return navigationMapper.selectAllInUse();
    }

    @Override
    public Map<String, String> getSmsConfigs() {
        List<DollConfig> dollConfigSmss=  dollConfigMapper.getSmsConfigs();
        Map<String,String> SmsConfigs=new HashMap<String, String>();
        for(DollConfig dollConfig:dollConfigSmss){
            SmsConfigs.put(dollConfig.getName(),dollConfig.getValue());
        }
        return SmsConfigs;
    }


}
