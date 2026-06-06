import java.util.Scanner;

public class Q9 {

    static int countUpper(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                count++;
        }
        return count;
    }

    static int countLower(String str) {
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Uppercase = " + countUpper(str));
        System.out.println("Lowercase = " + countLower(str));
    }
}