package com.example.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/3/1.
 */
@Aspect
@Component
public class MylogAspect {
    @Pointcut("@annotation(com.example.util.Mylog)")
    public  void annotationPointCut(){
        System.out.println("@Pointcut");
    };

    @Before("annotationPointCut()")
    public  void  before(JoinPoint joinPoint){
        MethodSignature sign =  (MethodSignature)joinPoint.getSignature();
        Method method = sign.getMethod();
        Mylog annotation = method.getAnnotation(Mylog.class);
        System.out.print("打印："+annotation.value()+" 前置日志");

    }

}
