public class FindOdd {
    public static int findIt(int[] a) {
        int num;
        int count;
        int max;
        num = count = max = 0;
        if (a.length == 1){
            return a[0];
        }
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (count > max && count%2 !=0){
                max = count;
                num = a[i];
            }
        }

        return num;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}) + " and the result is 5");
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}) + " and the result is -1");
        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}) + " and the result is 5");
        System.out.println(findIt(new int[]{10}) + " and the result is 10");
        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}) + " and the result is 10");
        System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}) + " and the result is 1");

    }
}
