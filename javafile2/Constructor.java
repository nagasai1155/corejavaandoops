package javafile2;

public class Constructor {

    int a ;
    int b;
    String c;
    Constructor(){
     //default constructor

    }
    Constructor(int d,int e,String q){
        a = d;   //parametrized constructor
        b = e;
        c = q;
    }
    public static void main(String args[]){


        Constructor c1 = new Constructor(3,4,"rohitsharma");
       System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);

    }
}
