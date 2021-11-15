public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        System.out.println(java.util.Arrays.toString(cycle(nums)));
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static int[] cycle(int[] nums){
        int i = 0;
        while (i<nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums,i,correct);
            } else {
            i++;
            }
        }
        return nums;
    }
}
