import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < num-1; i++) {
            if (arr[i] == n && arr[i+1] == m) {
                found = true;
                break;
            }
        }
        for (int i = 0; i < num-1; i++) {
            if (arr[i] == m && arr[i+1] == n) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}