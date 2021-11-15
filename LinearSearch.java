import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no. of elements: ");
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i=0; i<array.length; i++) {
            System.out.print("Enter element: ");
            array[i] = input.nextInt();
        }


        System.out.print("Enter element to be searched: ");
        int ele = input.nextInt();

        search(array , ele);
    }

    static void search (int[] array , int ele) {
        for (int i=0; i< array.length; i++) {
            if (ele == array[i]) {
                System.out.println("Found on " + i + " index.");
                break;
            }
        }
    }
}
