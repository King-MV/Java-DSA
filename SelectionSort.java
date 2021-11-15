public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {-100, -98, -1, 2, 3, 4};

        System.out.println(java.util.Arrays.toString(select(num)));
    }

    static int findMax(int[] num, int start, int last) {
        int max = start;
        for (int index=start; index<=last; index++) {
            if (num[index] > num[max]) {
                max = index;
            }
        }
        return max;
    }

    static int swap (int[] num, int mxin, int last) { 
        int temp = num[mxin];
        num[mxin] = num[last];
        num[last] = temp;
        return temp;
    }

    static int[] select(int[] num) {
        for (int i=0; i<num.length; i++) {
            int last = num.length-i-1;
            int mxin = findMax(num, 0, last);
            swap(num, mxin, last);
        }
        return num;
    }

}
