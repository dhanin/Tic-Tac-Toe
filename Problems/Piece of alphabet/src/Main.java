import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean state = true;
        for (int i = 1; i < input.length(); i++) {
            if ( input.charAt(i) != input.charAt(i-1)+1) {
                state = false;
                break;
            }
        }
        System.out.println(state);
    }
}