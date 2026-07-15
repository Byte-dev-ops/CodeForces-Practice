import java.util.Scanner;

public class longWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String inp = sc.next();
            if (inp.length() <= 10) {
                System.out.println(inp);
            } else {
                System.out.println("" + inp.charAt(0) + (inp.length() - 2) + inp.charAt((inp.length()-1))+"");
            }
        }
    }
}