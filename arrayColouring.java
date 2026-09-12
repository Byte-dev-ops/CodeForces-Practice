import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int count_odd = 0;
            int count_even = 0;
            for(int i = 0 ; i< n ; i++) {
                if(sc.nextInt() % 2 == 0 ){
                    count_even++;
                } else {
                    count_odd++;
                }
            }
            if(count_odd % 2 == 0 ) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
