import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();   // Read the string directly

        int D_Count = 0;
        int A_Count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                D_Count++;
            } else if (s.charAt(i) == 'A') {
                A_Count++;
            }
        }

        if (A_Count > D_Count) {
            System.out.println("Anton");
        } else if (D_Count > A_Count) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
