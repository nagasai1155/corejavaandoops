package Encapsulation;

//binding the data fields and public methodsd into a single unit .here other classes should not be access those fields and methods

class Gh{
    private int n ;
    private  String name;

    public String  getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getn(){
        return n;
    }
    public void set(int n){
        this.n = n;
    }
}
public class EncapsulationAgain {

    public static void main(String args[]){

    }
}
