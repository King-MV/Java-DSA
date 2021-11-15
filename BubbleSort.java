public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 7, 2 ,9, 3, 8, 8, 5, 2, 2};

        System.out.println(java.util.Arrays.toString(srt(arr)));
    }

static int swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return temp;
}

static int[] srt(int[] arr) {
    for (int i=0; i<arr.length; i++) {
        for (int j=0; j<=arr.length-1; j++) {
            if (arr[i] < arr[j]) {
                swap(arr, i, j);
            }
        }
    }
    return arr;
}
}