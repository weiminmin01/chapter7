package com.company.Demo01;

import com.company.Demo01.Door;

public class KeypadDoor  extends Door {
public  void open(){
    System.out.println("按键盘输入密码开门");
}

public void close(){
    System.out.println("拉上即可自动关门");
}
}
