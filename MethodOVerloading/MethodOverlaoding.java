package MethodOVerloading;

class ThisIsJavaOops{
    void manWithFire(int n,String s){
        System.out.println(n+s);
    }
    int manWithFire(int x,int y,int z){

        int apple = x*y-z;
        System.out.println(apple);
        return apple;
    }
    double manWithFire(double a,int e,double f){
        double vv = a- e+f;
        System.out.println(vv);
        return vv;
    }
}
public class MethodOverlaoding {
    public static void main(String args[]){
        ThisIsJavaOops bb = new ThisIsJavaOops();
        bb.manWithFire(45,"rohitsharam");
        bb.manWithFire(4,5,6);
        bb.manWithFire(2,1,7);

    }
}
