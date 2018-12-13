package com.aotubuy.Service.impl;

import com.aotubuy.Dao.DollSmsLogMapper;
import com.aotubuy.Model.DollSmsLog;
import com.aotubuy.Service.HeaderDataService;
import com.aotubuy.Service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luke on 18-6-7.
 */
@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    DollSmsLogMapper smsLogMapper;
    @Autowired
    HeaderDataService headerDataService;

    @Override
    public Map<String, String> doSmsLog(DollSmsLog smsLog) {
        Map<String ,String > res=new HashMap<>();
//        $data = M('sms_log')->where(array('mobile'=>$mobile,'session_id'=>$session_id))->order('id DESC')->find();
//        //获取时间配置
//        $sms_time_out = tpCache('sms.sms_time_out');
//        $sms_time_out = $sms_time_out ? $sms_time_out : 120;
//        //120秒以内不可重复发送
//        if($data && (time() - $data['add_time']) < $sms_time_out)
//            return array('status'=>-1,'msg'=>$sms_time_out.'秒内不允许重复发送');
//        $row = M('sms_log')->add(array('mobile'=>$mobile,'code'=>$code,'add_time'=>time(),'session_id'=>$session_id));
//        if(!$row)
//            return array('status'=>-1,'msg'=>'发送失败');
//        //$send = sendSMS($mobile,'您好，你的验证码是：'.$code);
//        $send = sendSMS($mobile,$code);
//        if(!$send)
//            return array('status'=>-1,'msg'=>'发送失败');
//        return array('status'=>1,'msg'=>'发送成功');
        List<DollSmsLog> smsLogs=smsLogMapper.selectByMobileAndSession(smsLog.getMobile(),smsLog.getSessionId());
        if(smsLogs!=null&&!smsLogs.isEmpty()) {
            DollSmsLog smsLog1 = smsLogs.get(0);
            Date date = new Date();
            Integer timeOut = Integer.valueOf(headerDataService.getSmsConfigs().get("sms_time_out"));
            System.out.println(date.getTime());
            if(date.getTime()-smsLog1.getAddTime()<timeOut*1000){ /**毫秒级所以 x1000*/
                res.put("status","-1");
                res.put("msg",timeOut+"秒内不允许重复发送");
                return res;
            }
        }
        int resault=smsLogMapper.insert(smsLog);
        if(resault<=0){
            res.put("status","-1");
            res.put("msg","发送失败");
            return res;
        }else {
            /**未完成*/
            res.put("status","1");
            res.put("msg","发送成功");
        }

        return res;
    }
}
