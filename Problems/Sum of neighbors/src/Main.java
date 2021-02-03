import java.util.Scanner;


class Main {
    static int row;
    static int col;
    public static void main(String[] args) {
        // put your code here
        int[][] matrixInt = getMatrix();
        int[][] outMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                outMatrix[i][j] = findUp(i,j,matrixInt) + findDown(i,j,matrixInt)
                        + findLeft(i,j,matrixInt) + findRight(i,j,matrixInt);
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(outMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);

        StringBuilder matrixString = new StringBuilder();
        String string;
        row = 0;
        while (scanner.hasNextLine()) {
            string = scanner.nextLine();
            if (string.toString().equals("end")) {
                break;
            } else {
                row++;
                String[] temp = string.split("\\s+");
                for (String s:temp
                ) {
                    matrixString.append(s + " ");
                }

            }
        }
        String[] mat = matrixString.toString().split(" ");
        col = mat.length / row;
        int[][] matrixInt = new int[row][col];
        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixInt[i][j] = Integer.parseInt(mat[k++]);
            }
        }
        return matrixInt;
    }
    public static int findUp(int i, int j, int[][] matrixInt) {
        switch (i) {
            case 0:
                return matrixInt[row-1][j];
            default:
                return matrixInt[i-1][j];
        }
    }
    public static int findDown(int i, int j, int[][] matrixInt) {
        if (i == row - 1) {
            return matrixInt[0][j];
        } else {
            return matrixInt[i+1][j];
        }
    }
    public static int findLeft(int i, int j, int[][] matrixInt) {
        switch (j) {
            case 0:
                return matrixInt[i][col-1];
            default:
                return matrixInt[i][j-1];
        }
    }
    public static int findRight(int i, int j, int[][] matrixInt) {
        if (j == col-1) {
            return matrixInt[i][0];
        } else {
            return matrixInt[i][j+1];
        }
    }
}