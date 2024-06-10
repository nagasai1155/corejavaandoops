package MethodOVerloading;

public class MethodOverloading {
    static int addition(int x ,int y){

        return x+y;
    }
    static double addition(int x,double y,double z){
        return x+y+z;
    }
    static int addition(int x,int y,int z){
        return x+y+z;
    }
    public static void main(String args[]){

        System.out.println(addition(3,4));
        System.out.println(addition(3,4.2,4.2));
        System.out.println(addition(3,4,5));

    }
}
