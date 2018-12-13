package com.aotubuy.Service.impl;

import com.aotubuy.Dao.DollAdMapper;
import com.aotubuy.Model.DollAd;
import com.aotubuy.Service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luke on 18-5-8.
 */


@Service
public class AdServiceImpl implements AdService {
    @Autowired
    DollAdMapper dollAdMapper;
    @Override
    public DollAd getIndexTopBannerAd() {
        return dollAdMapper.selectIndexTopBannerAd();
    }
}
