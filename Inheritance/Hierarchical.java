package Inheritance;


import org.w3c.dom.ls.LSOutput;

class Animal45{
    String  r4(String n){
        System.out.println("my name is: "+n);
        return n;
    }
}
class Dog3 extends  Animal45{
         int e3(int y){
             System.out.println("the no.of apples "+y);
             return y;
         }
}

class cat21 extends Animal45{
    void w3(){
        System.out.println("this is cat21 subclass");
    }
}
public class Hierarchical {
    public static void main(String args[]){
        Dog3 v = new Dog3();
        v.e3(3);           //hierarchical inheritance ->from main class two subclasses are created . To access them we need
        //create 2 objects for both subclasses
        v.r4("nagasaibalam");

        cat21 s = new cat21();
        s.w3();
        s.r4("surya");
    }
}
