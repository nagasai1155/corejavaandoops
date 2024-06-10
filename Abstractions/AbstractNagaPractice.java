package Abstractions;
abstract class School{
    String n;
    School(String n){
        this.n = n;
    }
    void fun(){
        System.out.println(n);
    }
    abstract void function();//there will be no implementation of code in this methodor function


}
class Bus extends  School{
    String n;
    Bus(String n){
       super(n);
    }
    void function(){
        System.out.println("this only for daysscholars students");
    }
}

class Rooms extends School{

    Rooms(String n){
        super(n);
    }
    void function(){
        System.out.println("for all students rooms are accessible");
    }
}
public class AbstractNagaPractice {
    public static void main(String args[]){

        Bus b = new Bus("days-scholars");
        b.function();b.fun();
        Rooms r = new Rooms("students");
        r.function();r.fun();

    }
}
