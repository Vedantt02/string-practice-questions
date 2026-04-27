//* Count the number of vowels and consonants in a String..

public class Que3 {
    public static void main(String[] args) {
        String str = "Hello World";
        char [] arr = str.toCharArray();

        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : arr) {
            if (Character.isLetter(c)) {
                char lowerC = Character.toLowerCase(c);
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u' || lowerC == 'A' || lowerC == 'E' || lowerC == 'I' || lowerC == 'O' || lowerC == 'U') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Number of Vowels: " + vowelCount);
        System.out.println("Number of Consonants: " + consonantCount);
    }    
}
