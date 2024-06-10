package Interfaces;

interface Nagasai{
    abstract void fun();
    abstract int fun1(int n);

}
interface  Nagasai1{
    abstract void fun2();

}
class Animals implements  Nagasai,Nagasai1{
    public void fun(){
        System.out.println("fun");
    }
    public int fun1(int n){
        System.out.println("fun1:  "+n);
        return n;
    }
    public void fun2(){
        System.out.println("fun2");
    }
}
public class Practice {
    public static void main(String args[]){
        Animals t = new Animals();
        t.fun();t.fun2();
        int n= t.fun1(4);
        if(n == 4){
            System.out.println("this is number "+n);
        }else{
            System.out.println("this is not number "+n);
        }

    }
}
