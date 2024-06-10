package Inheritance;
class Animals{  //hierarical inheritance
    void nenu(){
        System.out.println("i am animal class or super clASS  ");
    }
}
class Dogs extends Animals{
    void nuvvu(){
        System.out.println("i am  dog clas ");

    }
}
class Cats extends Animals{
    void pillalu(){
        System.out.println("labs are barking with dogs ");
    }
}
public class Hierarical{
    public static void main(String args[]){
        Dogs d=new Dogs();
        Cats c = new Cats();
        d.nuvvu();
        d.nenu();
        //now cat object with using reference variable c
        c.nenu();
        c.pillalu();

    }
}
