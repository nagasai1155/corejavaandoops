package Interfaces;

interface  Animal{//interface block of code
    int n45=90;



    abstract  int   animalNames(int n);// abstract method
}
interface Birds{
  abstract   int   birdsNames(int n);
}
 class Nagasai234 implements Animal,Birds{
    public int  animalNames(int n2){
        System.out.println(n2);
        return n2;
    }
    public int   birdsNames(int n){
        System.out.println(n);
        return n;
    }
}
public class InterfacePractice {
    public static void main(String args[]){

        Nagasai234 jdj= new Nagasai234();
        jdj.animalNames(6);
        jdj.birdsNames(121);

    }
}
