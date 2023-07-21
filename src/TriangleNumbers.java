public class TriangleNumbers {
    public static Boolean isTriangleNumber(long number) {
        if (number == 0 || number == 1) {
            return true;
        }

        int[] test = new int[(int) number + 1];

        for (int i = 1; i <= number; i++) {
            test[i] = (i * (i + 1)) / 2;
        }
        for (int i = 0; i < test.length; i++){
            if (test[i] == number){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isTriangleNumber(125250) + " and should be true");
        System.out.println(isTriangleNumber(3126250) + " and should be true");
        System.out.println(isTriangleNumber(6) + " and should be true");
        System.out.println(isTriangleNumber(8) + " and should be false");
    }
}
