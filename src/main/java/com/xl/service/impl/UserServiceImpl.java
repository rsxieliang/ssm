package com.xl.service.impl;

import com.xl.entity.User;
import com.xl.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author xieliang
 * @Description
 * @Date Create in 上午 11:16 2018-03-23
 * Modified By:
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {


    private int counts;

    @Override
    public User getUser(String language){
        log.error(language);
        System.out.println("我是统计的："+counts);
        counts++;
        User user = new User();
        user.setName("王五");
        user.setPassword("123456");
        return user;
    }
}
