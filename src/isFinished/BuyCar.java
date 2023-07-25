package isFinished;
/*
У мужчины довольно старая машина стоимостью 2000 долларов.
Он увидел подержанную машину стоимостью 8000 долларов. Он хочет сохранить свою старую машину до тех пор, пока не сможет купить подержанную.
Он думает, что сможет экономить 1000 долларов каждый месяц, но цены на его старую машину и на новую снижаются на 1,5 процента в месяц.
Кроме того, этот процент потерь увеличивается на 0,5 процента в конце каждых двух месяцев.
Нашему человеку трудно производить все эти расчеты.

Сколько месяцев ему потребуется, чтобы накопить достаточно денег на покупку машины, которую он хочет, и сколько денег у него останется?

 */

import java.util.Arrays;

public class BuyCar {
    static int[] nbMonths(double priceOld, double priceNew, int savingsPerMonth, double lossByMonth) {
        int savings = 0, months = 0;
        while (priceNew - priceOld > savings) {
            if (++months % 2 == 0) {
                lossByMonth += .5;
            }
            priceOld -= priceOld * lossByMonth / 100;
            priceNew -= priceNew * lossByMonth / 100;
            savings += savingsPerMonth;
        }
        return new int[] {months, (int) Math.round(priceOld - priceNew + savings)};
    }

    public static void main(String[] args) {
        int[] result = nbMonths(2000, 8000, 1000, 1.5);
        System.out.println(Arrays.toString(result));

        int[] result1 = BuyCar.nbMonths(2000, 8000, 1000, 1.5);
        System.out.println(Arrays.toString(result1)); // Output: [6, 686]

        int[] result2 = BuyCar.nbMonths(2000, 8000, 1000, 1.0);
        System.out.println(Arrays.toString(result2)); // Output: [6, 772]

        int[] result3 = BuyCar.nbMonths(12000, 8000, 1000, 1.5);
        System.out.println(Arrays.toString(result3)); // Output: [0, 4000]
    }

}
