import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7') {
                count++;
            }
        }

        String s = String.valueOf(count);

        boolean lucky = count > 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '4' && s.charAt(i) != '7') {
                lucky = false;
                break;
            }
        }

        System.out.println(lucky ? "YES" : "NO");
    }
}
