package com.company.Demo02;

public class KeypadDoor implements Door {
    @Override
    public  void open(){
        System.out.println("按键盘输入密码开门");
    }
    @Override
    public  void  close(){
       System.out.println("拉上即可自动关门");
    }
}
