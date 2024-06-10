package javafile2;
public class NagaSai {   //method overloading in java
                           //1.with same method name with differnt parameters with also different datatypes
    static int addition(int a,int b){
        System.out.println("-----------");
        return a+b;
    }
    static double addition(int a,double b,int c){
        System.out.println("++==+++++++++");
        return a+b+c;
    }
    public static void main(String args[]){

        NagaSai obj = new NagaSai();
       
        System.out.println(obj.addition(21,21));
        System.out.println(obj.addition(2,1.2,8));


    }
}
