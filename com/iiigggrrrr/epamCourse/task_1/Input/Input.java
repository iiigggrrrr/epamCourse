package com.iiigggrrrr.epamCourse.task_1.Input;

import com.iiigggrrrr.epamCourse.task_1.Output.Output;

import java.util.Random;
import java.util.function.Predicate;

abstract public class Input {
    protected Output dialog;

    protected Input(Output output) {
        Input.dialog = output;
    }

    public static double randomDouble(double from, double to, String text) {
        dialog.showText(text);
        Random random = new Random();
        double number = random.nextDouble() * (to - from) + from;
        return number;
    }

    public static double randomDouble(double from, double to) {
        Random random = new Random();
        double number = random.nextDouble() * (to - from) + from;
        return number;
    }


    public double readDouble(String text) {
        return readDouble(text, (x) -> true);
    };
    public abstract double readDouble(String text, Predicate<Double> condition);

    public int readInt(String text) {
        return readInt(text, (x) -> true);
    };
    public abstract int readInt(String text, Predicate<Integer> condition);
}
