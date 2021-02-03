import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int num = scanner.nextInt();
        if (num > input.length()) {
            System.out.println(input.toString());
        } else {
            StringBuilder str = new StringBuilder(input);
            String subString = str.toString().substring(0, num);
            str.delete(0, num).append(subString);
            System.out.println(str.toString());
        }
    }
}