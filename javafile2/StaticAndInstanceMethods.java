package javafile2;

public class StaticAndInstanceMethods {
    static void dea (){         //static method
        System.out.println("it is static method ");
    }
    void dea1 (int s){    //non static methods
        System.out.println("dea1 : "+s);
    }
    public static void main(String args[]){
        StaticAndInstanceMethods d = new StaticAndInstanceMethods();
        StaticAndInstanceMethods d1 = new StaticAndInstanceMethods();
        StaticAndInstanceMethods d2 = new StaticAndInstanceMethods();

        dea();
        dea();  //calling static methods without involving the objects in it
        dea();


        //now calling instance methods with involving objects
        d.dea1(4);
        d1.dea1(41232);
        d2.dea1(412);
    }
}
