import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int m = sc.nextInt();
            int a = m/10;
            int b = m%10;
            System.out.println(a+b);
        }
    }
}
