import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.next();
        String reversed = new StringBuilder(s).reverse().toString();
        if(t.equals(reversed)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
