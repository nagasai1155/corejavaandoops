package javafile2;




class Ab{
    Ab(){
        System.out.println("nagasaiabalam");
        int x = 0;
        switch (x ){
            case 2:
                System.out.println("hello");
                break;
            case 0:
                System.out.println("csendidi");
                break;
            default:
                System.out.println("none");
        }
    }

//    String n = "sai";
//    void a(){
////        System.out.println("hello world");//super or parent class
//        System.out.println("name: " + n);
//    }
}
class Bc extends  Ab{
Bc(){
    super();
    System.out.println("managing the super keyword in the classes ");
}
//    String n = "balam";
//    void b(){
//
//        super.a();
////        System.out.println("hello bye bye ");//sub-class or child class
//        System.out.println(n);
//        System.out.println(super.n);//invoking instacne variabloe of parent class using super key word
//    }
}
public class NewSuperKeyword {
    public static void main(String args[]){

             Bc s = new Bc();


    }
}
