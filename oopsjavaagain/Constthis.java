package oopsjavaagain;

i

class Naga{
    Naga(){
        System.out.println("HELLO THIS IS NAGASZAI");
    }
    Naga(int x){
        this();
        System.out.println(x);
    }
}
public class Constthis {
    public static void main(String args[]){
         Naga x = new Naga(5);
         
    }
}
