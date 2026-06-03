import java.util.*;
class discount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        double amt=sc.nextDouble();
        double finalAmt;

        if(amt>5000)
            finalAmt=amt-(amt*0.20);
        else if(amt>2000)
            finalAmt=amt-(amt*0.10);
        else
            finalAmt=amt;

        System.out.println(finalAmt);
    }
}