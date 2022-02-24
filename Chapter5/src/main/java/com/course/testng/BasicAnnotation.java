package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){

        System.out.println("Test这是测试testng用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test这是测试testng用例2");
    }

    @Test
    public void test1(){
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    //可以将一些变量，静态变量值，常量值设置在一开始这种，供后面使用
    @BeforeClass
    public void beforeClass(){
        System.out.println("AfterClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }

    //可以包含多个类
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }


}
