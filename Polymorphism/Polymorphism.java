package Polymorphism;

//polymorphism means ->performing a task of action in different ways is knows as polymorphism in java oop's concept

//here now we can see the difference between method hiding in static polymorphism and method overriding in polymorphism

//create static  and non static methods in in class using inheritance concept
class Family{
    static void nuclear(){     //this is static polymorphism
                               //and this is method hiding using static keyword
        System.out.println("this is static nuclear -method hiding ");
    }
    void nuclear1(){   //this is dynamic polymorphism
                      // and this is method overriding using non - static keyword
        System.out.println("this is non - static nuclear of Family class - method overrding");
    }
}
class Naga extends  Family{
    static void nuclear(){           //method hiding using static keyword
        System.out.println("this is joint method of static -method hiding");
    }
    void nuclear1(){   //method overriding using non- static keyword

        System.out.println("this is joining method of -  overriding");
    }
}
public class Polymorphism {
    public  static void main(String args[]){

        Family s = new Naga();   //Family ->compilation reference type and
                                 //Naga() ->runtime object
        s.nuclear1();
       s.nuclear();


    }
}
