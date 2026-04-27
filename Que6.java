//* Fing ASCII value of each character in a string and print it..

public class Que6 {
    public static void main(String[] args) {
        String str = "Yello People";
        char [] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.println("ASCII value of '" + arr[i] + "' is: " + (int)arr[i]);
        }
    }
}
