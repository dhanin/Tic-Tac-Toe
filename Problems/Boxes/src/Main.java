import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = scanner.nextInt();
        a[1] = scanner.nextInt();
        a[2] = scanner.nextInt();
        b[0] = scanner.nextInt();
        b[1] = scanner.nextInt();
        b[2] = scanner.nextInt();

        if (canPutIn(a, b)) {
            System.out.println("Box 1 < Box 2");
        } else if (canPutIn(b, a)) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }


    }
    public static boolean canPutIn(int[] a, int[] b) {
        int countA = 0;
        int[] count = new int[3];

        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                if (a[i] < b[k]) {
                    count[i]++;
                }
            }

        }
        /////////////////

        for (int i = 0; i < 3; i++) {
            if ( count[i] >= 2) {
                countA++;
            }
        }
        /////////////////////////

        switch (countA) {
            case 3:
                return true;
            case 2:
                int minA = a[findIndexOfA(count)];
                int maxB = findMaxB(b);
                if (minA < maxB) {
                    return true;
                } else {
                    return false;
                }
            case 1:
            default:
                return false;
        }
    }
    public static int findIndexOfA(int[] count) {
       int min = 0;
       min = count[0] >= count[1] ? 1 : count[0] >= count[2] ? 2 : 0;
       return min;
    }
    public static int findMaxB(int[] b) {
        int max = 0;
        max = Math.max(b[0],b[1]);
        max = Math.max(max,b[2]);
        return max;
    }
}