package Abstractions;

abstract  class Animal {  //the abstract classes are declared by using abstract non access specifier
    //we cannot create an objects for abstract classes
    // we can achieve abstraction by abstract classes 0 to 100%;
    abstract void Cat();
    String n;
    Animal(String n){
        this.n = n;
    }
    void fun(){
        System.out.println(n);
    }






}
     class Hourse extends Animal {
    Hourse(String n){
        super(n);
    }

    //in this child class Hourse we are overriding the abstract method in parent class

        void Cat(){
            System.out.println("hourse runs very fast");
        }
    }
    class Hourse1 extends Animal{
    Hourse1(String n){
        super(n);

    }
    void Cat(){
        System.out.println("hourse1 runns very fast");

    }
    }
    class Hourse3 extends  Animal{
    String n;

    Hourse3(String n){
        super(n);
    }
    void Cat(){
        System.out.println("hourse3 runns very fast");
    }
    }

public class AbstractClassesAndMethods {
    public static void main(String args[]){
        Hourse nm= new Hourse("stopped");nm.Cat();nm.fun();
        Hourse1 nm1 = new Hourse1("stopped");nm1.Cat();nm1.fun();
        Hourse3 nm2 = new Hourse3("stopped");nm2.Cat();nm2.fun();


          }
    }
