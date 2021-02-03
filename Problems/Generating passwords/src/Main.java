import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int nUpperCase = scanner.nextInt();
        int nLowerCase = scanner.nextInt();
        int nDigit = scanner.nextInt();
        int len = scanner.nextInt();
        StringBuilder code = new StringBuilder();

        Random random = new Random(1000);
        for (int i = 0; i < nUpperCase; i++) {
            int r = random.nextInt(25) + 65; //ascii code A-Z
            code.append(String.valueOf((char)r));
        }
        for (int i = 0; i < nLowerCase; i++) {
            int r = random.nextInt(25) + 97;
            code.append(String.valueOf((char)r));
        }
        for (int i = 0; i < nDigit; i++) {
            int r = random.nextInt(9) + 48;
            code.append(String.valueOf((char)r));
        }

        if (len > nUpperCase + nLowerCase + nDigit) {

        }
        int elapse = len - nUpperCase - nLowerCase -nDigit;

        if (len - nUpperCase - nLowerCase -nDigit > 0 ) {
            if (nUpperCase > 0) {
                for (int i = 0; i < elapse; i++) {
                    int r = random.nextInt(25) + 65; //ascii code A-Z
                    code.append(String.valueOf((char) r));
                }
            } else if (nLowerCase > 0) {
                for (int i = 0; i < elapse; i++) {
                    int r = random.nextInt(25) + 97; //ascii code a-z
                    code.append(String.valueOf((char) r));
                }
            } else if (nDigit > 0) {
                for (int i = 0; i < elapse; i++) {
                    int r = random.nextInt(9) + 48; //ascii code 0-9
                    code.append(String.valueOf((char) r));
                }
            }else {
                for (int i = 0; i < elapse; i++) {
                    int r = random.nextInt(14) + 33; //
                    code.append(String.valueOf((char) r));
                }
            }
        }

        String[] codeString = code.toString().split("");
        boolean state;

        do {
            state = true;
            shuffle(codeString);
            for (int i = 1; i < codeString.length; i++) {
                if (codeString[i].equals(codeString[i - 1])) {
                    state = false;
                    break;
                }
            }
        } while (state == false );

        for (int i = 0; i < code.length(); i++) {
            System.out.print(codeString[i]);
        }
    }
    // swaps array elements i and j
    public static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // take as input an array of strings and rearrange them in random order
    public static void shuffle(String[] a) {
        int n = a.length;
        Random random = new Random();
        int lower;
        int upper = n - 1;
        for (int i = 0; i < n - 1; i++) {
            lower = i + 1;
            int r = random.nextInt(upper - lower + 1) + lower; // (upper - lower + 1) + lower generating random number >=lower and <=upper
            exchange(a, i, r);
        }
    }
}