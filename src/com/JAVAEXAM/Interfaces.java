package com.JAVAEXAM;

interface I1{
    void show();
}
interface I2{
    void show2();
        }

class Interfaces  implements I1, I2{
    @Override
    public void show(){
        System.out.println("I am show");
    }
    public void show2(){
        System.out.println("i am show 2");
    }

    public static void main(String[] args) {
        Interfaces obj = new Interfaces();
        obj.show();
        obj.show2();

        }
}
