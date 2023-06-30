public class leapYears {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020) + " должно быть true");
        System.out.println(isLeapYear(2015) + " должно быть true");
        System.out.println(isLeapYear(2020) + " должно быть false");
        System.out.println(isLeapYear(2100) + " должно быть false");

    }

}
