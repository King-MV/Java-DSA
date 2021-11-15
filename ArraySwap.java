import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arry = {1,3,10,44,55,11};
        System.out.println(java.util.Arrays.toString(arry));

        swap(arry , 0 , 2);
        System.out.println(java.util.Arrays.toString(arry));
    }

    static void swap(int[] arry , int index1 , int index2) {
        int temp = arry[index1];
        arry[index1] = arry[index2];
        arry[index2] = temp;
    }
}


/* temp is now equals to 1 bcz index 0 has value 1.
1 is now equal to 10 bcz index 2 has value 10.
10 now equals to temp.

temp = 1;
1/temp = 10;
10 = temp;

*/