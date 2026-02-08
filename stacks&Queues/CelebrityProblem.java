import java.util.Scanner;
import java.util.Stack;
public class CelebrityProblem{
  public static int findCelebrity(int[][] matrix, int n){
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < n; i++){
      stack.push(i);
    }
    while(int i = 0; i < n; i++){
      stack.push(i);
    }
    while(stack.size() > 1){
      int a = stack.pop();
      int b = stack.pop();
      if(matrix[a][b] == 1){
        stack.push(b);
      }else{
        stack.push(a);
      }
    }
    int candidate = stack.pop();
    for(int i = 0; i < n; i++){
      if(i != candidate){
        if(matrix[candidate][i] == 1 || matrix[i][candidate] == 0){
          return -1;
        }
      }
    }
    return candidate;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] matrix = new int[n][n];
    for(int i = 0; i < n; i++){
      for(int j = 0 ; j < n ; j++){
        matrix[i][j] = scanner.nextInt();
      }
    }
    int result = findCelebrity(matrix, n);
    if(result == -1){
      System.out.println("No Celebrity");
    }else{
      System.out.println("Celebrity ID : " + result);
    }
    sc.close();
  }
}
