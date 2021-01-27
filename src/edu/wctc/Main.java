package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Preference Quiz - Assignment

        Scanner keyboard = new Scanner(System.in);
        int userInput, response, count = 0;

        String[] questions = {"Do you prefer mild(0) or spicy(1)? ", "Do you prefer tea(0) or coffee(1)? ", "Do you prefer breakfast(0) or brunch(1)? ", "Do you prefer summer(0) or winter(1)? ", "Do you prefer paper(0) or plastic(1)? "};
        int[] answers = new int[questions.length];

        do {

            for (int i = 0; i < questions.length; i++) {
                System.out.print(questions[i]);
                userInput = Integer.parseInt(keyboard.nextLine());

                if (userInput == 1) {
                    count += 1;
                }
            }


            if (count < 3) {
                System.out.println("You prefer life to be calm and organized");
            } else if (count == 3) {
                System.out.println("You prefer a good balanced life");
            } else if (count > 3) {
                System.out.println("You prefer life to be spontaneous and active");
            }

            System.out.println("Do you want to take the quiz again? (0 for no, 1 for yes) ");
            response = Integer.parseInt(keyboard.nextLine());

            count = 0;
        } while (response == 1);


    }


}
