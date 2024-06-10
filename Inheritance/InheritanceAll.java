package Inheritance;
class Animal12{
    void s (){
        System.out.println("hi nagasai");
    }
}
class Dag extends Animal12{
    void s12(){
        System.out.println("nagasaibalam and we can access ");
    }
}
class puppy extends Dag{
    void t3(){
        System.out.println("puppy is the name in the join");
    }
}
public class InheritanceAll {




    public static void main(String args[]){
//        Dag g3 = new Dag();         //single level inheritance
//        g3.s12();
//       g3.s();
        puppy a = new puppy();
        a.t3();
        a.s12();             //multilevel  inheritance   acquring parent classes using child class by creating an object for child class

        a.s();

    }
}
