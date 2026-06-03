import java.util.*;
class electricBill {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int unit=sc.nextInt();
        int bill;

        if(unit<=100)
            bill=unit*2;
        else if(unit<=300)
            bill=(100*2)+((unit-100)*3);
        else
            bill=(100*2)+(200*3)+((unit-300)*5);

        System.out.println(bill);
    }
}