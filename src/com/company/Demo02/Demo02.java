package com.company.Demo02;


import com.company.Demo01.Door;

public class Demo02 {
    public static void  main(String[] args) {
        KeypadDoor keypadDoor = new KeypadDoor();
        keypadDoor.open();
        keypadDoor.close();


        keypadDoor.test01();
      //  keypadDoor.teat02();
        com.company.Demo02.Door.test02();
       // com.company.Demo02.Door.test01();


        PowerDoor powerDoor = new PowerDoor();
        powerDoor.close();
        powerDoor.open();


        com.company.Demo01.Door door = new Door() {
            @Override
            public void open() {
                System.out.println("临时实现的开门方法");
            }

            @Override
            public void close() {
                System.out.println("临时实现的关门方法");
            }
        };
        door.close();
        door.open();
    }
}
