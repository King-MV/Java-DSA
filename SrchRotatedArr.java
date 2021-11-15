public class SrchRotatedArr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7};

        System.out.println(FindMax(arr));
    }

    static int FindMax(int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
