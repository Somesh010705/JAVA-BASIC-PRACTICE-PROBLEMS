import java.util.Scanner;

public class Q2 {
    static String convertEmail(String email) {
        return email.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        System.out.println(convertEmail(email));
    }
}