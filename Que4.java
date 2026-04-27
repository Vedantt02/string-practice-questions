//* Count the number of words in a String..

public class Que4 {
    public static void main(String[] args) {
        String str = "this is java programming language";
        int count = 0;
        boolean isWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
                isWord = true;
            } 
            else {
                if (isWord) {
                    count++;
                    isWord = false;
                }
            }
        }
        
        if (isWord) {
            count++;
        }
        System.out.println("Number of words: " + count);
    }
}
