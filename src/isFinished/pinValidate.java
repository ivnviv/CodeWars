package isFinished;/*
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.
 */

public class pinValidate {

    public static boolean validatePin(String pin) {
        char[] pinArray = pin.toCharArray();
        if(pin.length() == 4 || pin.length() == 6 ){
            for(char c: pinArray){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            return true;
        }

       return false;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("12344"));
    }
}