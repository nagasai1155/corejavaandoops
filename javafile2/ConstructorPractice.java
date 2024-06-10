package javafile2;

public class ConstructorPractice {
    ConstructorPractice(){  //default constructor
        System.out.println("nagasai");
    }
    String name;
    int lastName;

    ConstructorPractice(String n,int sa){
        this.name = n;
        this.lastName= sa;
        System.out.println(lastName);

        System.out.println(name);
    }
    public static void main(String args[]){
        ConstructorPractice sd = new ConstructorPractice();
        ConstructorPractice n = new ConstructorPractice("java is great programming language",3434);
    }
}
