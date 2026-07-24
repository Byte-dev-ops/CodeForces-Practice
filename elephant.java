import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = n / 5;
        if (n % 5 != 0) {
            count++;
        }

        System.out.println(count);
    }
}
