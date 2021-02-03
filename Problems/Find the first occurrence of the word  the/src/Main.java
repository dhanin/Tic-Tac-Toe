import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int idx1 = input.indexOf("the");
        int idx2 = input.indexOf("The");

        if (idx1 == -1 && idx2 == -1) {
            System.out.println(-1);
        } else if (idx1 == -1 && idx2 != -1) {
            System.out.println(idx2);
        } else if (idx1 != -1 && idx2 == -1) {
            System.out.println(idx1);
        } else {
            System.out.println(idx1 = idx1 < idx2 ? idx1 : idx2);
        }


    }
}