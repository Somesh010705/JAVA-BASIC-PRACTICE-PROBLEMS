import java.util.Scanner;

public class Q3 {
    static int countChars(String str) {
        str = str.replace(" ", "");
        return str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(countChars(str));
    }
}