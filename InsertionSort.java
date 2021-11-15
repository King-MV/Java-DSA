public class InsertionSort {
    public static void main (String[] args) {
        int[] nums = {5, 3, 4, 1, 2};
        System.out.println(java.util.Arrays.toString(InsertSort(nums)));
    }   

    static void swap (int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static int[] InsertSort(int[] nums) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j>0; j--) {
                if (nums[j] < nums[j-1]) {    
                    swap(nums,j,j-1);
                } else {
                    break;
                }
            }
        }
        return nums;
    }
}

