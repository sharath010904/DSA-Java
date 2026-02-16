import java.util.Scanner;
class Solution {
    public boolean isAlphaNum(char ch) {

        if ((ch >= '0' && ch <= '9') ||
            (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z')) {
            return true;
        }

        return false;
    }
    public boolean isPalindrome(String s) {

        int st = 0;
        int end = s.length() - 1;

        while (st < end) {

            if (!isAlphaNum(s.charAt(st))) {
                st++;
                continue;
            }

            if (!isAlphaNum(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(st)) != 
                Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            st++;
            end--;
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        Solution obj = new Solution();

        boolean result = obj.isPalindrome(input);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
