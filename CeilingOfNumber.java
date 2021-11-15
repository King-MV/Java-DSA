import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };

        int start = 0;
        int end = arr.length;
        int mid = start + (end - start) / 2;

        System.out.print("Enter element to be searched: ");
        int target = input.nextInt();

        searching(arr, mid, start, end, target);
    }

    static void searching(int[] arr, int mid, int start, int end, int target) {
        if (arr[mid] == target) {
            System.out.println(mid);
        }

        else if (arr[mid] < target) {
            for (int i = mid; i < arr.length; i++) {
                if (arr[i] == target) {
                    System.out.println(i);
                    break;
                }

                if (arr[i] != target) {
                    if (target > arr[mid] && target <= arr[mid + 1]) {
                        System.out.println(arr[mid + 1]);
                        break;
                    }
                    mid++;
                }

            }
        }

        for (int index = mid; index >= start; index--) {
            if (arr[index] == target) {
                System.out.println(index);
                break;
            }

            if (arr[index] != target) {
                if (target < arr[mid] && target >= arr[mid - 1]) {
                    System.out.println(arr[mid]);
                    break;
                }
                mid--;
            }
        }
    }
}
