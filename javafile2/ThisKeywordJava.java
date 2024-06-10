package javafile2;

import java.util.Scanner;

public class ThisKeywordJava {
    void s(ThisKeywordJava obj){
        System.out.println("hello world");
    }
    void t(){
        s(this);
    }


    public static void main(String args[]){
  ThisKeywordJava te = new ThisKeywordJava();
 te.t();
 Scanner sc = new Scanner(System.in);

//    int x ;
//    void AB(){    //used to refer current class instance variable
//        int y = 10;
//        this.x=200;
//        System.out.println(y);
//        System.out.println(this.x);
//    }
//    String  Cd(String x){         //this used to invoke current class method
//        this.De();
//        System.out.println("hello world : "+x);
//        return x;
//    }
//    void De(){
//        System.out.println("my name is ");
//    }
//    ThisKeywordJava(){
//        System.out.println("hello");
//    }
//    void name(){
//
//        System.out.println("hello nagasai");
//    }
//    public static void main(String args[])
//    {
//        ThisKeywordJava n = new ThisKeywordJava();
////        n.Cd("nagasaibalam");
//        n.name();
    }
}
