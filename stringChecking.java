import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            char c = sc.next().charAt(0);

            if (c == 'c' || c == 'o' || c == 'd' || c == 'e' ||
                c == 'f' || c == 'r' || c == 's') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
