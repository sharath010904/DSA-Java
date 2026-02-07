import java.util.Scanner;
class Solution{
    public int majorityElement(int[] arr){
        int count = 0;
        int element = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if(count == 0){
                element = arr[i];
            }
            if(arr[i] == element ){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.majorityElement(arr);
        System.out.println(result);
        sc.close(); 
    }
}
