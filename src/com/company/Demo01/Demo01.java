package com.company.Demo01;

public class Demo01 {
    public static void  main(String[] args) {
       KeypadDoor keypadDoor=new KeypadDoor();
        keypadDoor.open();
        keypadDoor.close();


        PowerDoor powerDoor=new PowerDoor();
        powerDoor.close();
        powerDoor.open();


        Door door=new Door() {
            @Override
            public void open(){
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
