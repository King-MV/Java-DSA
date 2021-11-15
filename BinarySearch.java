import java.util.Scanner;

public class BinarySearch {
        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);

            int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
            int target = input.nextInt();

            System.out.println(binarysearch(array,target));
        }

    static int binarysearch(int[] array , int target) {
        int start = 0;
        int end = array.length - 1;
        
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target < array[mid]) {
                end = mid-1;
            } else if (target > array[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
