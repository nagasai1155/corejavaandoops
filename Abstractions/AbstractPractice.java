package Abstractions;
//absracctionmeans hiding complex implemnetation from the user and showing only required funalities to user
abstract class Balam{
    static String n;
    static int m;
    Balam(String n,int m){
        this.n= n;
        this.m = m;
    }
    abstract void amma();
    static void nanna(){
        System.out.println(n);
    }
    static void bro(){
        System.out.println(m);
    }

}
class Babu extends Balam{
    int m;
    Babu(String n,int m){
        super(n,m);


    }
    void amma(){
        System.out.println("this is amma method");
    }
}
public class AbstractPractice {
    public static void main(String args[]){
    Babu ns = new Babu("hello ap bye bye ycp",343);
    ns.amma();ns.nanna();ns.bro();
    }
}