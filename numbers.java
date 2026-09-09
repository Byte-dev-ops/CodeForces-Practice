import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int s = arr[3];

        int a = s - arr[0];
        int b = s - arr[1];
        int c = s - arr[2];

        System.out.println(a + " " + b + " " + c);
    }
}
