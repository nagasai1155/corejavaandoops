package Inheritance;

//hirarical inheritance in java creating a child class from same parent/
//inherting a child classes from same parent class is known as hirarchcal inheritance

class XYZ{
    void printName(){
        System.out.println("printing name of a person from xyz class ");
    }
}
class ABC extends  XYZ{
    void showAble(){
        System.out.println("this is ABC class child class");
    }
}
class DSA extends XYZ{
    void nextAble(){
        System.out.println("this DSA class child class from xyz");
    }


}
public class HiraricalInheritance {
    public static void main(String args[]){
        DSA X = new DSA();
        X.printName();
        X.nextAble();
       ABC y = new ABC();
       y.showAble();y.printName();
    }
}
