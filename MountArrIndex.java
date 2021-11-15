public class MountArrIndex {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 6, 7, 6, 5, 3};

        int target = 3;
        System.out.println(finding(arr,target));
    }    

    static int peakelement(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return arr[start];
    }

    static int finding(int[] arr, int target) {
        int peak = peakelement(arr);

        for (int i=0; i<arr.length-1; i++) {
            if (target == arr[i]) {
                return i;
            }
    }
    return -1;
}
}
