package com.iiigggrrrr.epamCourse.task_1.Input;

import com.iiigggrrrr.epamCourse.task_1.Output.Output;

import java.util.Scanner;
import java.util.function.Predicate;

public class InputConsole extends Input {

    public InputConsole(Output output) {
        super(output);
    }

    public double readDouble(String text, Predicate<Double> condition) {
        Scanner scanner = new Scanner(System.in);
        double number;


        while (true) {
            dialog.showText(text);
            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                if (condition.test(number)) {
                    return number;
                }
            }
            scanner.nextLine();
            dialog.showText("Incorrect number. Try one more time. ");
        }
    }

    @Override
    public int readInt(String text, Predicate<Integer> condition) {
        Scanner scanner = new Scanner(System.in);
        int number;


        while (true) {
            dialog.showText(text);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (condition.test(number)) {
                    return number;
                }
            }
            scanner.nextLine();
            dialog.showText("Incorrect number. Try one more time. ");
        }

    }


}

