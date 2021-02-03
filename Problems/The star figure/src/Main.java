import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[][] arr = new String[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ". ";
            }
        }

        for (int i = 0; i < n; i++) {
            arr[n/2][i] = "* ";
        }

        for (int i = 0; i < n; i++) {
            arr[i][n/2] = "* ";
        }

        for (int i = 0; i < n; i++) {
            arr[i][i] = "* ";
        }
        for (int i = 0; i < n; i++) {
            arr[i][n - 1 - i] = "* ";
        }

        /////////////////////////////////
        // print output
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
