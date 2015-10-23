package com.jing.aop;

/**
 * Created by jdq on 10/23/15.
 */
public class StudentInfoServiceImpl implements StudentInfoService {

    @Override
    public void findInfo(String studentName) {
        System.out.println("input name : "+studentName);
    }
}
