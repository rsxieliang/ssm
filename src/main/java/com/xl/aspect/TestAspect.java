package com.xl.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;

/**
 * @author xieliang
 * @Description
 * @Date Create in 下午 2:39 2018-03-23
 * Modified By:
 */
@Slf4j
public class TestAspect {

    public void beforeSayHelloWorld(JoinPoint joinPoint) {
        System.out.println("执行方法前运行，参数为:" + joinPoint.getSignature().getName());
    }

    public void afterSayHelloWorld(JoinPoint joinPoint) {
        System.out.println("执行方法后运行，参数为:" + joinPoint.getSignature().getName());
    }
}
