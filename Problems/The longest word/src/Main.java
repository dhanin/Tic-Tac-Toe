import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");
        int max = 0;
        int index = -1;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > max) {
                max = strArr[i].length();
                index = i;
            }
        }
        System.out.println(strArr[index]);
    }
}