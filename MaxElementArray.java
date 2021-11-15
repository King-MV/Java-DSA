import java.util.Scanner;

public class MaxElementArray {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        for (int i=0; i<5; i++) {
            array[i] = input.nextInt();
        }

        max(array);
        System.out.println(max(array));
    }    

    static int max(int[] array) {
        int max = array[0];
        for (int i=0; i< array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        return max;
    }

}
