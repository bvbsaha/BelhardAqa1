package org.tolkachev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] options = {
                "1 - Winter",
                "2 - Spring",
                "3 - Summer",
                "4 - Autumn",
                "5 - Exit",
        };

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            printMenu(options);
            input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            var option = Integer.parseInt(input);
            switch (option) {
                case 1:
                    System.out.println("Winter");
                    break;
                case 2:
                    System.out.println("Spting");
                    break;
                case 3:
                    System.out.println("Summer");
                    break;
                case 4:
                    System.out.println("Autumn");
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
        scanner.close();
    }
    public static void printMenu(String[] options){
        for (String option:options) {
            System.out.println(option);
        }
        System.out.println("Choose your option : ");
    }
}
