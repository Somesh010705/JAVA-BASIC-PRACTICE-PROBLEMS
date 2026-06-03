import java.util.*;
class loanEligibleCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int age=sc.nextInt();
        int salary=sc.nextInt();
        boolean loan=sc.nextBoolean();

        if(age>=21 && salary>=30000 && !loan)
            System.out.println("Eligible");
        else
            System.out.println("Not Eligible");
    }
}