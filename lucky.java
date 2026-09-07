import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();

            int t1 = (str.charAt(0) - '0')
                   + (str.charAt(1) - '0')
                   + (str.charAt(2) - '0');

            int t2 = (str.charAt(3) - '0')
                   + (str.charAt(4) - '0')
                   + (str.charAt(5) - '0');

            if (t1 == t2) {
                System.out.println("YES");
            } else {
                 System.out.println("NO");
            }
        }
    }
}
