
import java.util.Scanner;

public class getPrintChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name.charAt(7));
    }
}