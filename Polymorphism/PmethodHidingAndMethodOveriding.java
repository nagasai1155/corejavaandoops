package Polymorphism;


class Cars2{
    static void benz(){//method hiding ->static polymorphism /compile time polymorphism/early binding polymorphism
        System.out.println("this is benz casr:  method hiding concept here");
    }
    void benz1(){//method overriding ->dynamic /runtime /late binding polymorphism
        System.out.println("this is benz1 car : method overriding concept is here");
    }
}
class Car2 extends  Cars2{
    static void benz(){
        System.out.println("this is benz car: method overhiding concept here'");
    }
    void benz1(){
        System.out.println("this is benz1 car : method overriding concept is here");
    }
}
public class PmethodHidingAndMethodOveriding {
    public static void main(String args[]){

        Cars2 nsa = new Car2();
        nsa.benz();
        nsa.benz1();

    }
}
