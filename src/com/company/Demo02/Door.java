package com.company.Demo02;

public interface Door {
    //静态常量
    String  des="是个门，注意安全";

    //方法的声明 (签名)
    public  void open();

    public  void close();

    public default void test01(){
        System.out.println("接口默认测试方法");
    }

    public  static  void  test02(){
        System.out.println("接口中静态方法");
    }
}
