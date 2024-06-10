package javafile2;
public class Balam{
    String n;
    Balam(String n){  //this keyword alloactes memory during run time only so we cannot use static to this keyword and static allocates memory during compile time
        this.n=n;  //this refers to instance variable using this keyword
    }
    void display(){
        System.out.println("about this keyword"+n);
    }
    void nagasai(){
        this.nagasai1();   //this refers to invoking a method inside a  method using this keyword;(implicitly")
        System.out.println("first method");
    }
    void nagasai1(){
        System.out.println("second method for this keyword");
    }


    //invoking constructor using this keyword
    Balam (){

        System.out.println("hi ");
    }
    Balam(int x){
        this();
        System.out.println(x);
    }
    public static void main(String args[]){
//        Balam j = new Balam("nagasaibalam");
//        j.display();
//        Balam n= new Balam("suryabalam");
//        n.nagasai();
//
        Balam t = new Balam(4);//invoking cosntructor using this keyword


    }
}