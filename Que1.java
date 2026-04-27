//* Reverse a String without using inbuild function..

public class Que1 {
    public static void main(String[] args) {
        String str = "Programming";
        char [] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed String:" + new String(arr));
    }
}