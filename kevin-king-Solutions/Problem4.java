package projecteuler;

public class Problem4 {

    static boolean isPalindrome(int value) {
        char[] palindrome = String.valueOf(value).toCharArray();
        
        int left = 0;
        int right = palindrome.length-1;
        
        
        while (left < right) {
            if (palindrome[left] == palindrome[right]) {   
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    static int findHighestPalindrome() {
        int min = 900;

        for (int i = 999; i >= min; i--) {
            for (int j = 999; j >= min; j--) {

                if (isPalindrome(i * j)) {
                    return i*j;
                }
   
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(findHighestPalindrome());
    }
}