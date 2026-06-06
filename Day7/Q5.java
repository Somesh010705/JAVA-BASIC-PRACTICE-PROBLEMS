import java.util.Scanner;

public class Q5 {
    static String getFirstName(String fullName) {
        String[] words = fullName.trim().split(" ");
        return words[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        System.out.println(getFirstName(fullName));
    }
}