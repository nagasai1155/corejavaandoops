package Inheritance;
//FIRST WE WILL SINGLY LEVEL INHERITANCE IN JAVA OOP'S
//inheritance means driving a functionalites from one class to antoher class (sub class to super class )(parent to child)
class Animalss{
    void A(){
        System.out.println("Animalss class method A():  ");
    }
}
class Dogss extends Animalss{
    void B(){
        System.out.println("Dogss class method B():   ");
    }
}
//upto here single level inheritance


//now multilevel inheritance

class Labrador extends Dogss{
    void V(){
        System.out.println("this is Labrador  method v():  ");
    }
}
public class InheritanceNagasaiPractice {

    public static void main(String args[]){
       Labrador a = new Labrador();
       a.V();
       a.A();
       a.B();
    }
}
