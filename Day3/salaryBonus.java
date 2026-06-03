import java.util.*;
class salaryBonus {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        double salary=sc.nextDouble();
        int exp=sc.nextInt();

        double bonus;

        if(exp>5)
            bonus=salary*0.20;
        else
            bonus=salary*0.10;

        System.out.println(salary+bonus);
    }
}