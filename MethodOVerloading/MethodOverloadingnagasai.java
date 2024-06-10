package MethodOVerloading;

 class Hero{
    public static int h1 (int x,int y){
        System.out.println("this is h1");
        System.out.println(x +" " + y);
        return 0;
    }
    public static void h1(int x,int y,int z){
        System.out.println("this is h1");
        System.out.println(x+" "+ y+ " "+ z);

    }
}
public class MethodOverloadingnagasai {
    public static void main(String args[]){
        Hero s = new Hero();
      s.h1(3,4,7);
        System.out.println("hello world");
    }
}
