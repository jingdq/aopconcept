package com.jing.aop;

/**
 * Created by jdq on 10/23/15.
 */
public class AOPFactory {
    private static Object getClassInstance(String clzName){
        Object obj=null;
        try{
            Class cls=Class.forName(clzName);
            obj=(Object)cls.newInstance();
        }catch(ClassNotFoundException cnfe){
            System.out.println("ClassNotFoundException:"+cnfe.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
        return obj;
    }
    public static Object getAOPProxyedObject(String clzName){
        Object proxy=null;
        MyHandler handler=new MyHandler();
        Object obj=getClassInstance(clzName);
        if(obj!=null) {
            proxy=handler.bind(obj);
        }else{
            System.out.println("Can't get the proxyobj");
//throw
        }
        return proxy;
    }

}
