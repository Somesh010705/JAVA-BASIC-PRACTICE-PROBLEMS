
public class threeDditer {
    public static void main(String[] args) {
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

int det =
a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
+a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);

System.out.println(det);
}}