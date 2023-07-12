public class FindOutlier {
    static int find(int[] integers) {
        int evenCounter = 0;
        int oddCounter = 0;
        int result = 0;


        for(int i = 0; i<integers.length; i++){
            if (integers[i] % 2 ==0){
                evenCounter++;
            }else {
                oddCounter++;
            }
            if (evenCounter > oddCounter){
                while (integers[i] % 2 != 0){
                    result = integers[i];
                    return result;
                }
            } else {
                while (integers[i] % 2 == 0){
                    result = integers[i];
                    return result;
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
