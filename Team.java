import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while (n --> 0) {
            int v = sc.nextInt();
            int p = sc.nextInt();
            int t = sc.nextInt();
            int res = v + p + t ;

            if (res>=2){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}