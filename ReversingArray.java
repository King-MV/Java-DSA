import java.util.Scanner;

public class ReversingArray { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] array = {1,5,7,2,9,3};
        reverse(array);
        System.out.println(java.util.Arrays.toString(array));
    }   

    static void reverse (int[] array) {
        int start = 0;
        int end = array.length-1;

        while (start > end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    static void swap (int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
