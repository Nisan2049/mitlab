//21. Write a program to print Matrix of array elements.
import java.util.Scanner;

public class MatOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = s.nextInt();
        System.out.print("Enter number of columns: ");
        int coloumns = s.nextInt();
        int[][] matrix = new int[rows][coloumns];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
