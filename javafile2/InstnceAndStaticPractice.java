package javafile2;


class Naga{
   static  String n="balam nagasai";//instance variable
    static void seva(){
        System.out.println(n);
        if(n == "surya"){
            System.out.println("it's surya is correct");
        }
        else{
            System.out.println("it's nagasaibalam");
        }
    }
//    Naga(){
//        System.out.println("my name is :"+n);
//    }
    //


//    Naga(String h){
//        this.n = h;
//        System.out.println(n);
//    }

//    void balu (String n){  //local variable
//        String a = n;
//        System.out.println(a);
//
//    }
    int man(int n){
        if(n>0){
            System.out.println("my number is "+ n);

        }else{
            System.out.println("not belongs to positive numbers");
        }

    return n;}

}
public class InstnceAndStaticPractice {
    public static void main(String args[]){
        Naga sd= new Naga();
//        sd.balu("nagasai");
//        sd.balu("hello");
//        sd.seva();
//        System.out.println(Naga.sai);
    sd.man(343);
  Naga.seva();



    }
}
