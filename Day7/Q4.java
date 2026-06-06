import java.util.Scanner;

public class Q4 {
    static String cleanPhone(String phone) {
        return phone.replace(" ", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();

        System.out.println(cleanPhone(phone));
    }
}