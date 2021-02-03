import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] strArray = scanner.nextLine().split("\\s+");
        boolean state = true;
        for (int i = 1; i < strArray.length; i++) {
            int n = strArray[i].compareTo(strArray[i-1]);
            if (n < 0) {
             state = false;
             break;
            }
        }
        System.out.println(state);
    }
}