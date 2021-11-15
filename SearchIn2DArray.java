import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] array = {
            {23 , 4 , 1},
            {18 , 22 , 3 , 9},
            {78 , 99 , 34 , 56},
            {18 , 12}
        };

        int target = input.nextInt();

    }   

    static int[] search(int[][] array , int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col<array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row , col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
