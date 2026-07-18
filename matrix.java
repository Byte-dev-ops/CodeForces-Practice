import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int row = 0;
        int column = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    row = i;
                    column = j;
                }
            }
        }
        int rowMoves = Math.abs(row - 2);
        int colMoves = Math.abs(column - 2);
        int answer = rowMoves + colMoves;

        System.out.println(answer);
    }
}
