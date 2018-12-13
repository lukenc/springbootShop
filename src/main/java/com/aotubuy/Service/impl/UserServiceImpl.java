package com.aotubuy.Service.impl;

import com.aotubuy.Dao.DollUsersMapper;
import com.aotubuy.Model.DollUsers;
import com.aotubuy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 * Created by luke on 18-6-12.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    DollUsersMapper dollUsersMapper;


    @Override
    public Map<String,Object> loginByNameAndPwd(String name, String pwd) {
        Map<String,Object> res=new HashMap<>();
        if(name==""||name==null||pwd==""||pwd==null){
            res.put("status",0);
            res.put("msg","账号密码不能为空,请填写账号密码");
            return res;
        }
        DollUsers dollUser=dollUsersMapper.selectByUserNameOrEmail(name);
        if(dollUser==null){
            res.put("status",-1);
            res.put("msg","账号不存在,请尝试其他账号！");
            return res;
        }else if(dollUser.getIsLock()==true)
        {
            res.put("status",-3);
            res.put("msg","账号异常被锁定！请联系客服人员！");
            return res;
        }


        return res;
    }
}
