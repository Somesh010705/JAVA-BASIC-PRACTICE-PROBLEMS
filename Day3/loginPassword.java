import java.util.*;
class loginPassword {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String correct="admin123";

        for(int i=1;i<=3;i++){
            String pass=sc.nextLine();

            if(pass.equals(correct)){
                System.out.println("Login Success");
                return;
            }
        }

        System.out.println("Account Locked");
    }
}