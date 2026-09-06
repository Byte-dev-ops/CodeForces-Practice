import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        int ans = burle(k, r);
        System.out.println(ans);
    }

    public static int burle(int k, int r) {
        int i = 1;

        while (true) {
            int total = k * i;

            if (total % 10 == 0 || total % 10 == r) {
                return i;
            }

            i++;
        }
    }
}
