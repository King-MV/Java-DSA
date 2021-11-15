public class MissingNum {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        misno(nums);
    }

    static void misno (int[] nums) {
        sort(nums);
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != i) {
                System.out.println(i);
            }
        }
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[correct] = nums[i];
        nums[i] = temp;
    }

    static void sort(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j>0; j--) {
                if (nums[j] > nums[j-1]) {
                    swap(nums,j,j-1);
                }
            }
        }
    }
}