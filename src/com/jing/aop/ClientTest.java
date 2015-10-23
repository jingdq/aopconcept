package com.jing.aop;

/**
 * Created by jdq on 10/23/15.
 */
public class ClientTest {

    public static void main(String[] args){

        StudentInfoService studentInfo= (StudentInfoService)AOPFactory.getAOPProxyedObject("com.jing.aop.StudentInfoServiceImpl");
        studentInfo.findInfo("阿飞");

//
//        AOPInstrumenter instrumenter=new AOPInstrumenter();
//        StudentInfoServiceImpl studentInfo=(StudentInfoServiceImpl)instrumenter.getInstrumentedClass( StudentInfoServiceImpl.class);
//        studentInfo.findInfo("阿飞");



    }

}
