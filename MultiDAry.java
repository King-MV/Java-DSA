import java.util.Scanner;

public class MultiDAry {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arry = new int[3][3];

        for (int row = 0; row<arry.length; row++) {
            
            for (int column = 0; column<arry[row].length; column++) {
                arry[row][column] = input.nextInt();
                System.out.print(arry[row][column] + " ");
            } 
        }
        
    }
}
