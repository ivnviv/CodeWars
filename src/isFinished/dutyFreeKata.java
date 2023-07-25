package isFinished;

public class dutyFreeKata {
    public static int dutyFree(int normPrice, int discount, int hol) {
        double answer = 0;
        double discountPrice = 0;
            discountPrice = ((double)normPrice*(double)discount)/100;
            answer = hol/discountPrice;

        return (int)answer;
    }

    public static void main(String[] args) {
        System.out.println(dutyFree(12,50,1000) + " answer = 166");
        System.out.println(dutyFree(17,10,500) + " answer = 294");
        System.out.println(dutyFree(24,35,3000) + " answer = 357");
        System.out.println(dutyFree(1400,35,10000) + " answer = 20");
        System.out.println(dutyFree(700,26,7000) + " answer = 38");
    }

}
