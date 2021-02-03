import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] intArray = new int[num];
        for (int i = 0; i < num; i++) {
            intArray[i] = scanner.nextInt();
        }
        int intSearch = scanner.nextInt();

        int count = 0;
        for (int n:intArray
             ) {
            if ( n == intSearch)
                count++;
        }
        System.out.println(count);
    }
}