import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Step 1: Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Step 2: Find first non-repeating character
        char result = '-';
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                result = str.charAt(i);
                break;
            }
        }
        
        // Output result
        if (result == '-') {
            System.out.println("No non-repeating character found (-1)");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
        
        sc.close();
    }
}
