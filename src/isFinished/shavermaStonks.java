package isFinished;

public class shavermaStonks {
    public static void main(String[] args) {
        float baseMoney = 70000F;
        float pointMoney = 500000F;
        float stonksPercent = 14.3F;

        int monthCounter = 0;

        while (baseMoney < pointMoney) {
            baseMoney += ((baseMoney*stonksPercent)/100);
            monthCounter++;

        }
        System.out.println("Для похода за шавермой понадобится " + monthCounter + " месяцев");
    }
}