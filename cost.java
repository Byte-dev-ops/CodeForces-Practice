import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int dollar = 0 ;
        for(int i = 1 ; i<= w ; i++){
            dollar += i*k;
        }
        int cost = n - dollar ;
        if(cost >= 0  ) {
            System.out.println(0);
        }
        if(cost<0){
            System.out.println(Math.abs(cost));
        }
    }
}
