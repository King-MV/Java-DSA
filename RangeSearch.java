import java.util.Scanner;

public class RangeSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = { 18, 12, -7, 3, 14, 28 };

        System.out.print("Enter element to be searched: ");
        int ele = input.nextInt();

        System.out.print("Enter starting index: ");
        int start = input.nextInt();

        System.out.print("Enter ending index: ");
        int end = input.nextInt();

        searching (array , ele , start , end);
    }

    static void searching(int[] array, int ele, int start, int end) {
        for (int index = start; index < end; index++) {
            if (ele == array[index]) {
                System.out.println(ele + " found on " + index + " index between range " + start + " & " + end);
            }
        }
    }
}

