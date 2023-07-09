import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class findEvenIndex {
    public static int findEvenIndex(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sumBefore = 0;
            int sumAfter = 0;

            for (int j = 0; j < i; j++) {
                sumBefore += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++) {
                sumAfter += arr[k];
            }
            if (sumBefore == sumAfter) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}) + " expected 3");
        System.out.println(findEvenIndex(new int[]{1, 100, 50, -51, 1, 1}) + " expected 1");
        System.out.println(findEvenIndex(new int[]{1, 2, 3, 4, 5, 6}) + " expected -1");
        System.out.println(findEvenIndex(new int[]{20, 10, 30, 10, 10, 15, 35}) + " expected 3");
        System.out.println(findEvenIndex(new int[]{-8505, -5130, 1926, -9026}) + " expected -1");
        System.out.println(findEvenIndex(new int[]{2824, 1774, -1490, -9084, -9696, 23094}) + " expected 1");
        System.out.println(findEvenIndex(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}) + " expected 6");

    }

}
