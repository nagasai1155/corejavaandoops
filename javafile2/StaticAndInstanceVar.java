package javafile2;

public class StaticAndInstanceVar {
    static int childrens = 2;//static variable->when we need to pass same value to all objects (it will be used)
    String  characters = " "; //instance variable  ->when we need to pass differnt value to all objects (it will be used)
    public static void main(String args[]){
        StaticAndInstanceVar helloName = new StaticAndInstanceVar();
        StaticAndInstanceVar helloName1= new StaticAndInstanceVar();
        StaticAndInstanceVar helloName2 = new StaticAndInstanceVar();

        //accesing a static variables
        System.out.println(" " + helloName.childrens);
        System.out.println(" " + helloName1.childrens);
        System.out.println(" " + helloName2.childrens);

        //accesing instance variable or non-static variable
        helloName.characters="nagasaibalam";
        helloName1.characters="sai";
        helloName2.characters="naga";
        System.out.println(helloName.characters);
        System.out.println(helloName1.characters);
        System.out.println(helloName2.characters);


    }

}
