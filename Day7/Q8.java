import java.util.Scanner;

public class Q8 {
    static String removeHyphen(String code) {
        return code.replace("-", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        System.out.println(removeHyphen(code));
    }
}