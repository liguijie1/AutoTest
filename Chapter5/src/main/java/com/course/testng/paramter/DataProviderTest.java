package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name ="+name+"age ="+age);

    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"liguijie",30},
                {"zhangsan",40},
                {"wangwu",35}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("方法1 name ="+name+"age="+age);

    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("方法2 name ="+name+"age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhansgan",30}

            };

        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"lisi",90}
            };

        }return result;



    }
}
