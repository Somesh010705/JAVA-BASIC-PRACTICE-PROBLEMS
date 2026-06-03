public class strXpattern {
    public static void main(String[] args) {

        String name = "MADONNA";
        int n = name.length();

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                if(i == j)
                    System.out.print(name.charAt(i));

                else if(i + j == n - 1)
                    System.out.print(name.charAt(i));

                else
                    System.out.print(" ");

            }

            System.out.println();
        }
    }
}