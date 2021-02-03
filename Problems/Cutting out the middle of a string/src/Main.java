import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.next());
        int len = input.toString().length();
        if (len % 2 == 1) {
            deleteMiddle(input,len);
        }
        else {
            input.delete(len/2, len/2 +1);
            deleteMiddle(input,len-1);
        }

        System.out.println(input.toString());
    }
    public static void deleteMiddle(StringBuilder input, int len) {
        input.delete(len/2,len/2+1);
    }
}