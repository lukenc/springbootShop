package com.aotubuy.Controlller;

import com.aotubuy.Model.DollSmsLog;
import com.aotubuy.Model.DollUsers;
import com.aotubuy.Service.HeaderDataService;
import com.aotubuy.Service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by luke on 18-6-4.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    HeaderDataService headerDataService;
    @Autowired
    SmsService smsService;


    public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }


    @RequestMapping("/reg")
    public String reg(Map<String, Object> map) {
        Map<String, String> configs = headerDataService.getSmsConfigs();
        configs.putAll(headerDataService.getShopInfo());
        String regis_sms_enable = configs.get("regis_sms_enable");
        String regis_smtp_enable = configs.get("regis_smtp_enable");
        regis_smtp_enable=regis_smtp_enable != null &&regis_smtp_enable!=""?regis_smtp_enable:"120";
        map.putAll(configs);
        map.put("regis_smtp_enable", regis_smtp_enable);
        map.put("regis_sms_enable", regis_sms_enable);
        return "reg";
    }

    @RequestMapping("/send_sms_reg_code")
    @ResponseBody
    private Map<String,String> sendSmsRegCode(HttpServletRequest request) {
        Map<String,String> map=new HashMap<>();
        String response = "";
        String mobileNum=request.getParameter("mobile");
        if(mobileNum!=""&&mobileNum!=null){
            if(!isMobile(mobileNum)){
                map.put("status","-1");
                map.put("msg","手机格式有误！");
            }else{
                Random num=new Random();
                Integer sendnum=num.nextInt()%1000;
                DollSmsLog smsLog=new DollSmsLog();
                Date date=new Date();
                Long addTime=date.getTime();
                smsLog.setCode(sendnum.toString());
                smsLog.setMobile(mobileNum);
                smsLog.setAddTime(addTime);
                smsLog.setSessionId(request.getSession().getId());
                map.putAll(smsService.doSmsLog(smsLog));
            }

        }else {
            map.put("status","-1");
            map.put("msg","手机格式有误！");
        }



        return map;
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map) {
        String refererUrl = request.getHeader("referer");
        if (refererUrl == null) {
            refererUrl = "";
        }
        Map<String, String> configs = headerDataService.getShopInfo();
        map.putAll(configs);
        map.put("referurl", refererUrl);
        return "login";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    public Map<String,Object> doLogin(HttpServletRequest request){
        Map<String,Object> res=new HashMap<>();
        String verificationCode=request.getParameter("verify_code");
        String trueVerify= request.getSession().getAttribute("verifyCode").toString();
        System.out.println(trueVerify);

        if(verificationCode.equals(trueVerify)){
            DollUsers dollUser=null;


        }else {
            res.put("status",0);
            res.put("msg","验证码错误");
            return res;
        }
//        $username = I('post.username');
//        $password = I('post.password');
//        $username = trim($username);
//        $password = trim($password);
//        $verify_code = I('post.verify_code');
//
//        $verify = new Verify();
//        if (!$verify->check($verify_code,'user_login'))
//        {
//            $res = array('status'=>0,'msg'=>'验证码错误');
//            exit(json_encode($res));
//        }
//
//        $logic = new UsersLogic();
//        $res = $logic->login($username,$password);
//
//        if($res['status'] == 1){
//            $res['url'] =  urldecode(I('post.referurl'));
//            session('user',$res['result']);
//            setcookie('user_id',$res['result']['user_id'],null,'/');
//            setcookie('is_distribut',$res['result']['is_distribut'],null,'/');
//            $nickname = empty($res['result']['nickname']) ? $username : $res['result']['nickname'];
//            setcookie('uname',urlencode($nickname),null,'/');
//            setcookie('cn',0,time()-3600,'/');
//            $cartLogic = new \Home\Logic\CartLogic();
//            $cartLogic->login_cart_handle($this->session_id,$res['result']['user_id']);  //用户登录后 需要对购物车 一些操作
//        }
//        exit(json_encode($res));


        return res;


    }


}
