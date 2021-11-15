public class MinimumElement {
    public static void main(String[] args) {
        int[] array = {18 , 12 , -11 , 3 , 14 , 28};

        System.out.println(min(array));
    }

    static int min(int[] array) {
        int min = array[0];
        for (int i=0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
