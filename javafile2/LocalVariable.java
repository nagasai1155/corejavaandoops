package javafile2;

public class LocalVariable {

    //instance variable or non -static variable
    String n1 = "balamn";

    //static variable
    static String n2 = "rohit ";

    //methods non-static and static

   static  void   megaStar(int x,int y){           //non -static method
        if(x>y){
            System.out.println("x is max "+x);
        }
        else {
            System.out.println("y is max "+y);
        }

    }
//    static void hourseAnimal(){
//        String na = "nagasaibalam";//local variable
//        System.out.println("my name is "+na);
//    }
    public static void main(String args[]){
        LocalVariable n3 = new LocalVariable();
        n3.megaStar(3,4);
//        hourseAnimal();
//        LocalVariable g = new LocalVariable();
//        LocalVariable g1 = new LocalVariable();
//
//        g.n1 = "sai";g.n2 ="sharma";
//        System.out.println(g.n1); //sai
//        System.out.println(g1.n1);//balam
//
//
//        System.out.println(g.n2);//sharma
//        System.out.println(g1.n2);//sharma


        System.out.println(" -----------");

    }
}
