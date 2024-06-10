package Interfaces;

interface Dog{
    static int x = 4545;
     void   f();
}





public class InterfaceAgain3 implements Dog{
    public  void  f(){
        System.out.println("this is my favourite number"+x);

    }
    public static void main(String args[]){
        InterfaceAgain3 N = new InterfaceAgain3();
        N.f();


    }


}
