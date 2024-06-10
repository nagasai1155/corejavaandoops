package Polymorphism;

class Nagasai34{

    static void b(){
        System.out.println("this static -method hiding");
    }
    void b1(){
        System.out.println("this is non-static -method overriding");
    }
}
class Son5 extends  Nagasai34{
    static void b(){
        System.out.println("this is static subclass -method hiding");
    }

    void b1(){
        System.out.println("this is non -static  of subclass-method overriding");
    }
}
public class PolymorphismPractice {
    public static void main(String args[]){

        Nagasai34 s = new Son5();
        s.b();
        s.b1();


    }
}
