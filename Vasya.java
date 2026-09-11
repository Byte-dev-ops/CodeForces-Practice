import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p = sc.nextInt();
        int s = 0 ;
        int d = 0 ;
        if(t<p){
            s = t;
            d = (p-s)/2;
        }
        else {
            s = p ;
            d = (t-s)/2;
        }
        System.out.println(s+"  "+d);
    }
}
