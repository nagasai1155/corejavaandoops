
package javafile2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Balam1{
    void inputs(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name :");
        String name= sc.nextLine();
        System.out.println(name);
        int n;
        for(n=0;n<10;n++){
            for(int i=2;i<10;i++){
                System.out.println("*");
            }
        }
    }
    public static void main(String args[]){
        Balam1 A = new Balam1();
        A.inputs();
        System.out.println();
        String myName = "nagasaibalam";
        String _myName2 = "nagasaibalam";
        String myName1 = "nagasaibalam";
        System.out.println(myName1+" " +myName+" " +_myName2);
        final String _first_name ="hello raja";
        System.out.println(_first_name);
    }
}