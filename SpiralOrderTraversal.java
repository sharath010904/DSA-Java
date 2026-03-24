import java.util.*;

public class Main {

    public static void spiralPrint(int[][] matrix, int m, int n) {

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {

            // ➤ Left → Right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // ➤ Top → Bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // ➤ Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // ➤ Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        spiralPrint(matrix, m, n);
    }
}
