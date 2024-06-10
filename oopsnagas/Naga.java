package oopsnagas;

public class Naga {
    int i = 123;
    static int s = 233456;
    public static void main(String args[]){
        //instance and static variables
        Naga a = new Naga();
        Naga a1 = new Naga();
        System.out.println(a.i);
        System.out.println(a.s);

     a1.i = 321;a1.s=6543;
        System.out.println(a1.i);
        System.out.println(a.i);
        System.out.println(a1.s);
        System.out.println(a.s);
    }
}
