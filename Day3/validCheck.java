import java.util.*;
class validCheck {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String pass=sc.nextLine();

        boolean upper=false,digit=false;

        for(char c:pass.toCharArray()){
            if(Character.isUpperCase(c))
                upper=true;
            if(Character.isDigit(c))
                digit=true;
        }

        if(pass.length()>=8 && upper && digit)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}