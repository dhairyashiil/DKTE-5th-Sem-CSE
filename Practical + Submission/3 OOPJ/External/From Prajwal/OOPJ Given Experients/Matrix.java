import java.util.Scanner;

class Matrix {
    private int rows;
    private int col;
    private int[][] matrix;
    public Scanner Input = new Scanner(System.in);

    Matrix() {
        this.rows = 0;
        this.col = 0;
        this.matrix = new int[this.rows][this.col];
    }

    // take matrix from user
    public void getMatrix() {
        System.out.println("Enter number of Rows");
        this.rows = Input.nextInt();
        System.out.println("Enter number of columns");
        this.col = Input.nextInt();
        this.matrix = new int[this.rows][this.col];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.col; j++) {
                this.matrix[i][j] = Input.nextInt();
            }
        }
    }

    // print matrix
    public void printMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // addition of matrix
    public Matrix additionOfMatrix(Matrix M2) {
        Matrix M3 = new Matrix();
        if (M2.rows == this.rows && M2.col == this.col) {
            M3.rows = this.rows;
            M3.col = this.col;
            M3.matrix = new int[M3.rows][M3.col];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.col; j++) {
                    M3.matrix[i][j] = this.matrix[i][j] + M2.matrix[i][j];
                }
            }
            return M3;
        } else {
            System.out.println("Column and rows are different cannot add them");
            return M3;
        }
    }

    // Substraction of matrix
    public Matrix substractionOfMatrix(Matrix M2) {
        Matrix M3 = new Matrix();
        if (M2.rows == this.rows && M2.col == this.col) {
            M3.rows = this.rows;
            M3.col = this.col;
            M3.matrix = new int[M3.rows][M3.col];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.col; j++) {
                    M3.matrix[i][j] = this.matrix[i][j] - M2.matrix[i][j];
                }
            }
            return M3;
        } else {
            System.out.println("Column and rows are different cannot Substract them");
            return M3;
        }
    }

    // transpose of Matrix;
    public Matrix transposeOfMatrix() {
        Matrix M = new Matrix();
        M.rows = this.col;
        M.col = this.rows;
        M.matrix = new int[M.rows][M.col];
        for (int i = 0; i < M.rows; i++) {
            for (int j = 0; j < M.col; j++) {
                M.matrix[i][j] = this.matrix[j][i];
            }
        }

        return M;
    }

    // scaler Multiplication of matrix
    public Matrix scalerMultiplicationOfMatrix(int scale) {
        Matrix M3 = new Matrix();
        M3.rows = this.rows;
        M3.col = this.col;
        M3.matrix = new int[M3.rows][M3.col];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.col; j++) {
                M3.matrix[i][j] = scale * this.matrix[i][j];
            }
        }
        return M3;
    }

    // multiplication of two matrices
    public Matrix multiplicationOfMatrix(Matrix M2) {
        Matrix M3 = new Matrix();
        if (this.rows == M2.col && this.col == M2.rows) {
            M3.rows = this.rows;
            M3.col = M2.col;
            M3.matrix = new int[M3.rows][M3.col];
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < M2.col; j++) {
                    for (int k = 0; k < this.col; k++) {
                        M3.matrix[i][j] += this.matrix[i][k] * M2.matrix[k][j];
                    }
                }
            }
        } else {
            System.out.println("Multiplication not possible");
        }
        return M3;
    }

}

public class MatrixTest {

    public static void main(String[] args) {
        Matrix M1 = new Matrix();
        Matrix M2 = new Matrix();
        System.out.println("Enter Matrix M1");
        M1.getMatrix();
        System.out.println("Enter Matrix M2");
        M2.getMatrix();
        System.out.println("Given Matrix M1");
        M1.printMatrix();
        System.out.println("Given Matrix M2");
        M2.printMatrix();
        int op;
        Scanner Input = new Scanner(System.in);
        do {
            System.out.println("Enter a option to perform Addition");
            System.out.println("1. Transpose of Matrix 1");
            System.out.println("2. Transpose of Matrix 2");
            System.out.println("3. Addition  of Matrix 1 and 2");
            System.out.println("4. Substraction of Matrix 1 and 2");
            System.out.println("5. Scalar Multiplication of Matrix 1");
            System.out.println("6. Scalar Multiplication of Matrix 2");

            op = Input.nextInt();

            switch (op) {
            case 1:
                System.out.println("Transpose of Matrix M1");
                Matrix M3 = M1.transposeOfMatrix();
                M3.printMatrix();
                break;

            case 2:
                System.out.println("Transpose of Matrix M2");
                Matrix M4 = M1.transposeOfMatrix();
                M4.printMatrix();
                break;

            case 3:
                System.out.println("Addition of Matrix M1 and M2");
                M3 = M1.additionOfMatrix(M2);
                M3.printMatrix();
                break;

            case 4:
                System.out.println("Substraction of Matrix M1 and M2");
                M3 = M1.substractionOfMatrix(M2);
                M3.printMatrix();
                break;

            case 5:
                System.out.println("Multiplication of Matrix M1 and M2");
                M3 = M1.multiplicationOfMatrix(M2);
                M3.printMatrix();
                break;

            case 6:
                System.out.println("Scalar Multiplication of Matrix M1 and M2");
                M3 = M1.scalerMultiplicationOfMatrix(3);
                M3.printMatrix();
                break;
            }

        } while (op != 0);
        Input.close();
    }

}
