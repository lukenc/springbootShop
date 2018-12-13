package com.aotubuy.Service;

import java.util.Map;

/**
 * Created by luke on 18-6-12.
 */
public interface UserService {
    Map<String,Object> loginByNameAndPwd(String name, String pwd);
}
