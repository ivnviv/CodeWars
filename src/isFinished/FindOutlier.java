package isFinished;

public class FindOutlier {
    static int find(int[] integers) {
        int evenCounter = 0;
        int oddCounter = 0;
        int result = 0;


        for(int i = 0; i<integers.length; i++) {
            if (integers[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        for (int i = 0; i < integers.length; i++) {
            if (evenCounter > oddCounter) {
                if (integers[i] % 2 != 0) {
                    result = integers[i];
                    break;
                }
            } else {
                if (integers[i] % 2 == 0) {
                    result = integers[i];
                    break;
                }
            }
                }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {2, 6, 8, -10, 3}));
        System.out.println(find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        System.out.println(find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
}
