//* Check if the String is Palindrome or not..

public class Que2 {
    public static void main(String[] args) {
        String str = "aabaa";
        char [] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;
        
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.print("Palindrome String");
        } 
        else {
            System.out.print("Not a Palindrome String");
        }
    }
}
