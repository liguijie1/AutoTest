package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 在我们期望结果为某一个异常的时候会使用
     * 比如我们传入了某些不合法的参数，程序跑出异常
     */
    //这是一个结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionFailed(){
        System.out.println("这是一个失败的异常测试");

    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExcetionSecces(){

        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();


    }
}
