import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int[] intArray = new int[num];
        for (int i = 0; i < num; i++) {
            intArray[i] = scanner.nextInt();
        }
        int[] temp = new int[num];
        for (int i = 1; i < num; i++) {
            temp[i] = intArray[i-1];
        }
        temp[0] = intArray[num-1];
        for (int n:temp
             ) {
            System.out.print(n + " ");
        }
    }
}