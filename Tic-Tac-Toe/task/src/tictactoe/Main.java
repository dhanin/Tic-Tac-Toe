package tictactoe;

import javax.lang.model.util.SimpleElementVisitor6;
import java.util.Scanner;

public class Main {
    static char[] xoArray;
    static char[][] matrix;
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = "_________";
        xoArray = input.toCharArray();
        printGrid();
        mapToMatrix();
        for (int i = 0; i < 9; i++) {
            char ch = i % 2 == 0 ? 'X' : 'O';
            moveOX(ch);
            if (checkResult(ch)) {
                return;
            }
        }
    }
    public static boolean checkResult(char ch) {
        if (isWin(ch, matrix)) {
            System.out.printf("%c wins", ch);
            return true;

        } else if(isDraw(matrix)) {
            System.out.println("Draw");
        } else {
            //System.out.println("Game not finished");
        }
        return false;
    }
    public static void moveOX(char ch)
    {
        Scanner scanner = new Scanner(System.in);
        boolean state = false;
        int i=0;
        int j=0;
        boolean isInvalidDigit = false;
        do {
            System.out.print("Enter the coordinates: ");
            String[] str = scanner.nextLine().split("\\s+");

            for (int n = 0; n < str[0].length(); n++) {
                if (str[0].charAt(n) < '0' || str[0].charAt(n) > '9') {
                    isInvalidDigit = true;
                    state = false;
                }
            }
            for (int n = 0; n < str[1].length(); n++) {
                if (str[1].charAt(n) < '0' || str[1].charAt(n) > '9') {
                    isInvalidDigit = true;
                    state = false;
                }
            }
            if (isInvalidDigit) {
                System.out.println("You should enter numbers!");
            } else {
                state = true;
                i = Integer.parseInt(str[0]);
                j = Integer.parseInt(str[1]);
            }


            if (i > 3 || j > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
                state = false;
            }

            else if (matrix[i-1][j-1] == '_') {
                matrix[i-1][j-1] = ch;
                System.out.println("---------");
                for (int z = 0; z < 3; z++) {
                    System.out.printf("| %c %c %c |\n",matrix[z][0], matrix[z][1],matrix[z][2]);
                }
                System.out.println("---------");
            }
            else {
                System.out.println("This cell is occupied! Choose another one!");
                state = false;
            }

        } while (state == false);
    }

    public static void printGrid() {
        System.out.println("---------");
        for (int i = 0; i < 9; i = i + 3)
        {
            System.out.printf("| %c %c %c |\n",xoArray[i+0],xoArray[i+1],xoArray[i+2]);
        }
        System.out.println("---------");
    }
    public static void mapToMatrix() {
        matrix = new char[3][3];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = xoArray[k++];
            }
        }
    }
    public static boolean isWin(char ch, char[][] matrix) {

        boolean state = false;
        //check each row
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == ch) {
                    count++;
                }
            }
            if (count == 3)
                return true;
        }

        // check each column

        for (int j = 0; j < 3; j++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (matrix[i][j] == ch) {
                    count++;
                }
            }
            if (count == 3)
                return true;
        }

        // check diagonal
        if ( matrix[0][0] == ch && matrix[1][1] == ch && matrix[2][2] == ch) {
            state = true;
        }
        if (matrix[2][0] == ch && matrix[1][1] == ch && matrix[0][2] == ch) {
            state = true;
        }
        return state;
    }
    public static boolean isImpossible(char[] xoArray) {
        int countX = 0;
        int countO = 0;

        for (int i = 0; i < 9; i++) {
            if (xoArray[i] == 'X') {
                countX++;
            } else if (xoArray[i] == 'O') {
                countO++;
            }
        }
        if (Math.abs(countO - countX) > 1) {
            return true;
        } else if(isWin('X',matrix) && isWin('O',matrix)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isDraw(char[][] matrix) {
        if (!isWin('X', matrix) || !isWin('O', matrix)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j] == '_')
                        return false;
                }
            }
        }
        return true;
    }
}
