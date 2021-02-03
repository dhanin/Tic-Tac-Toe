import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("\\s+");
        int num = scanner.nextInt();
        String[] temp = new String[str.length];

        for (int i = 0; i < str.length; i++ ) {
            temp[(i + num) % str.length] = str[i];
        }
        for (String ch:temp
             ) {
            System.out.print(ch + " ");
        }
    }
}