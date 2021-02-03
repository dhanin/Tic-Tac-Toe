import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[] temp = new int[row];
        for (int i = 0; i < row; i++) {
            temp [i] = arr[i][m];
        }
        for (int i = 0; i < row; i++) {
            arr[i][m] = arr[i][n];
        }
        for (int i = 0; i < row; i++) {
            arr[i][n] = temp[i];
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}