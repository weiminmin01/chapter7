package com.company.Demo02;

public class PowerDoor implements Door{

    @Override
    public void open() {
        System.out.println("按遥控开门");
        System.out.println(des);
    }

    @Override
    public void close() {
      System.out.println("按遥控关门");
    }
}
