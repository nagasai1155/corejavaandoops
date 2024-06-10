package Abstractions;


import java.sql.SQLOutput;

abstract  class Car{
    String n;
    Car(String n){
        this.n = n;

    }

    abstract void function();
    void fun(){
        System.out.println(n);
    }
}
class Breaks extends Car {
    Breaks (String n){
        super(n);
    }

    void function(){
        System.out.println("car should be halted");
    }

}
class Light extends Car{
    Light(String n){
        super(n);
    }
   void function(){
       System.out.println("lights are blinking of car");
   }
}
class Accelarator extends  Car{
    Accelarator(String n){
        super(n);
    }
    void function(){
        System.out.println("CAR IS ACCELRATING ");
    }
}

public class Abstraction {
    public static void main(String args[]){
        Breaks b = new Breaks("breaks");b.function();
        b.fun();
        Light l = new Light("on");l.function();
        l.fun();
        Accelarator a = new Accelarator("accelarating ");a.function();
        a.fun();

    }
}
