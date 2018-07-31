package com.xl.controller;

import com.xl.entity.User;
import com.xl.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author xieliang
 * @Description
 * @Date Create in 下午 2:14 2018-03-23
 * Modified By:
 */
@Slf4j
@Controller
@RequestMapping("/test")
public class UserController {


    @Autowired
    private UserService userService;

    @Resource(name = "redisTemplate")
    private StringRedisTemplate redisTemplate;

    private int count;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public User test(HttpServletRequest request){
        HttpSession session = request.getSession();
        Object object= session.getAttribute("sessionUser");
        System.out.println( object.toString());
        log.error("我错了！");
            User user =new User();
            user.setName("张三");
            user.setPassword("54s6f4sd6f4ds6f4");
        System.out.println(count);
        count++;
        return user;
    }

    @RequestMapping("/tojsp")
    public String toJsp(){
        System.out.println(count);
        count++;
        return "/index";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(){
        System.out.println(count);
        count++;
        return userService.getUser("");
    }

    /**
     * redis测试
     * @return
     */

    @RequestMapping(value = "/getRedis",method = RequestMethod.GET)
    @ResponseBody
    public String getRedis(){
        redisTemplate.opsForValue().set("key","张三");
        return redisTemplate.opsForValue().get("key");
    }

}
