package  javafile2;
public class CalByValue {
    int a ;
    int b;

    void multiple(int s ,int r){
        s = 201;
        System.out.println("In method:"+(s+r));//23
    }



    public static void main(String args[]){
        CalByValue n = new CalByValue();

        n.a=6;
        n.b= 13;
        System.out.println("before executing "+(n.a+n.b));//5

        n.multiple(n.a,n.b);

        System.out.println("after executing "+(n.a+n.b));//5

    }
}
