package com.jing.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.apache.log4j.Logger;

import java.lang.reflect.Method;

/**
 * Created by jdq on 10/23/15.
 */
public class AOPInstrumenter implements MethodInterceptor {
    private Logger log = Logger.getLogger(AOPInstrumenter.class);
    private Enhancer enhancer = new Enhancer();

    public Object getInstrumentedClass(Class clz) {
        enhancer.setSuperclass(clz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("调用日志方法" + method.getName());
        Object result = proxy.invokeSuper(o, args);
        return result;
    }
}