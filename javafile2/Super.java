package javafile2;


// super keyword is reference variable for parent class or super class
//1.it used to call instance variables->parent class
//             call methods ->parent class in child or sub class .
//              call construtors ->of parent class

/*class Animals1{  //super keyword using in instance variables java
    String n = "ballon";

}
class Dog1 extends  Animals1{
    String n = "joker";
    void naga(){
        System.out.println(super.n);
        System.out.println(n);
    }
}*/


//super key word  used for method invoking ->when both methods are same
//in this situation we use super keyword to call methods
/*class Amma{
    void amma1(){
        System.out.println("amma class here");
    }
}
class Mom extends Amma{
    void amma1(){
        System.out.println("mom class is here");
        super.amma1();
    }
}*/

//super keyword is also used for  invoking the constructors '
class Device{
    Device()
    {
        System.out.println("i am a device");
    }
}
class Tv1 extends  Device{
    Tv1(){
        super();
        System.out.println("i am tv");
    }
}
public class Super {
    public static void main(String args[]){
//      Mom m = new Mom();
//      m.amma1();
        Tv1 c = new Tv1();


    }
}
