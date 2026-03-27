import java.util.*;

public class Main {

    public static int maxSubArray(int[] arr) {

        int maxSum = arr[0];     
        int currentSum = arr[0]; 

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = maxSubArray(arr);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
