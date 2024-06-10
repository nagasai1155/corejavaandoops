package Interfaces;


interface Printable{
    int a = 45;
   abstract   void print();
}
interface Showable{
    abstract void show();
}


public class TheInterface implements  Printable,Showable {
   public  void print(){
        System.out.println("this print");
    }
    public void show(){
        System.out.println("this show");
    }
    public static void main(String args[]){
      TheInterface s = new TheInterface();
      s.print();s.show();
        System.out.println(s.a);
    }
}
