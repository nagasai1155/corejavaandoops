package Encapsulation;
//encapsulation means binding data fields and methods into single unit with out accesing this unit by other classes
//if you want to access these by other classes we should use getter and setter() methods.

class E{
    private String name; //data hiding here
    private int age;//data hiding here
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;

    }
    public int getAge(){
        return age;
    }
    public void setAge(int s){
        this.age = s;
    }
}
public class EncapsulationPractise {


    public static void main(String args[]){

    }
}
