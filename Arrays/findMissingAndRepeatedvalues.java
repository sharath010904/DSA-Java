import java.util.*;
class Solution{
    public int[] findMissingAndRepeatedValues(int[][] grid ){
        HashSet<Integer> s = new HashSet<>();
        int n = grid.length;
        int a = 0 , b ;
        int expsum = 0;
        int actualsum = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                actualsum += grid[i][j];
                if(s.contains(grid[i][j])){
                    a = grid[i][j];
                }
                s.add(grid[i][j]);
            }
        }
        expsum = ( n * n)*(n * n + 1)/2;
        b = expsum + a - actualsum;
        int[] ans = new int[2];
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        Solution obj = new Solution();
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
