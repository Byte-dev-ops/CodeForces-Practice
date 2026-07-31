import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        while (true) {
            y++;
            HashSet<Integer> set = new HashSet<>();

            String year = String.valueOf(y);

            for (char ch : year.toCharArray()) {
                set.add(Character.getNumericValue(ch));
            }

            if (year.length() == set.size()) {
                System.out.println(y);
                break;
            }
        }
    }
}
