package isFinished;

import java.util.Scanner;
import java.io.IOException;

public class stepikStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numberAndNames = input.split(" ");
        int number = Integer.parseInt(numberAndNames[0]);



        if (number == 0) {
            System.out.println("Оу... Похоже здесь никого...");
        } else if (number < 0){
            System.out.println("Серьезно? А что так негативно?");
        } else {
            for (int i = 1; i < numberAndNames.length; i++) {
                String name = numberAndNames[i];
                System.out.println("Привет, " + name);
            }
        }
    }
}

