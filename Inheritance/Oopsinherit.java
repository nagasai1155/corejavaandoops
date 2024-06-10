package Inheritance;
 //single level inheritance in java programming
class Animal{
    void nenu(int a){
        System.out.println("i am animal class or super clASS  "+a);
    }
}
class Dog extends Animal{
    void nuvvu(String name){
        System.out.println("i am  dog clas "+name);

    }
}
//now multilevel inheritance with single level inheritance
class Labradors extends Dog{
    void pillalu(String color){
        System.out.println("labs are barking with dogs "+color);
    }
}
public class Oopsinherit {
    //inheritance ->which inherits a features from parent class by using "extends" keyword ->it helps to create a new subclass or child class or derived class

    public static void main(String args[]){
       Labradors l = new Labradors();
        l.nuvvu("jonny");
        l.nenu( 3);
        l.pillalu("brown ");

    }
}
