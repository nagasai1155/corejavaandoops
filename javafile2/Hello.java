package javafile2;
class Cars{
    void s(){
        System.out.println("cars company ");
    }
}
class Audi extends Cars{                            //hierarical inheritance in java
    void power(){
        System.out.println("audii cars ");
    }
}
class Benz extends Cars{
    void fastName(){
        System.out.println("benz is very classic car in any where");
    }
}
//multi level inheritance
//class Horse extends Audi{
//    void running(){
//        System.out.println("hourse runs very fast than any animal");
//    }
//}
public class Hello{
    public static void main(String args[]){

  Audi a = new Audi();
  Benz b = new Benz();
  a.power();
  a.s();

  //accessing methods from benz class using reference variable
        b.fastName();
        b.s();
        


    }
}