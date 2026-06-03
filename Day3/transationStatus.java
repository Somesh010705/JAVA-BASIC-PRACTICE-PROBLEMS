import java.util.*;
class transactionStatus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int balance=sc.nextInt();
        int amount=sc.nextInt();

        if(amount%100==0 && balance-amount>=1000)
            System.out.println("Success");
        else
            System.out.println("Failed");
    }
}