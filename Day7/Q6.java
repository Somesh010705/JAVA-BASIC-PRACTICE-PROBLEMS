import java.util.Scanner;

public class Q6 {
    static String getFileName(String file) {
        int index = file.lastIndexOf('.');
        return file.substring(0, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();

        System.out.println(getFileName(file));
    }
}