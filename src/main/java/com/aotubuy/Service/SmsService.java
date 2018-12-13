package com.aotubuy.Service;

import com.aotubuy.Model.DollSmsLog;

import java.util.Map;

/**
 * Created by luke on 18-6-7.
 */
public interface SmsService {
    Map<String,String> doSmsLog(DollSmsLog smsLog);
}
