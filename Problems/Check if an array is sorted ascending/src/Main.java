import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < len; i++) {
            int num = scanner.nextInt();
            if (num >= max) {
                max = num;
            } else {
                System.out.println(false);
                return;
            }

        }
        System.out.println(true);

    }
}