import java.util.Scanner;

public class Q1 {
    static String cleanName(String name) {
        return name.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.println(cleanName(name));
    }
}