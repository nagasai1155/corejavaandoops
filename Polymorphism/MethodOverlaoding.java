package Polymorphism;

class FamilyMembers{
    String  father(String n){
        System.out.println(n);
        return n;
    }
    void  father(String  n1,String n11){
        if(n1!=n11){
            System.out.println(n1+ " " + n11);

        }else {
            System.out.println(n11);
            System.out.println(n1);
        }

    }
}
public class MethodOverlaoding {
    public static void main(String args[]){
        FamilyMembers ada = new FamilyMembers();
        ada .father("nagasaibalam");
        ada.father("suryabalam","nagasaibalamandfromaplpuwaster");
    }
}
