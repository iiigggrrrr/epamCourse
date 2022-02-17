package com.iiigggrrrr.epamCourse.task_1.Output;


import com.iiigggrrrr.epamCourse.task_1.Output.Output;

public class OutputConsole implements Output {

    @Override
    public void showText(String text) {
        System.out.print(text);
    }

    @Override
    public void outTask1(int number, boolean solution) {
        if (solution) System.out.println("Sum of the first and second digits of number " + number + " equals to sum of the third and fourth digits.");
        else System.out.println("Sum of the first and second digits of number " + number + " doesn't equals to sum of the third and fourth digits.");
    }

    @Override
    public void outTask2(double a, double b, double c, double ans) {
        System.out.println("The result of calc (b + sqrt(b^2 + 4ac)) / 2a - a^3a*c - b^-2 for \na = " + a + "\nb = " + b + "\nc = " + c
                + "\nequals to " + ans);
    }

    @Override
    public void outTask3(double length, double width, double area, double perimeter) {
        System.out.println("The area is " + area + " and the perimeter is " + perimeter);
    }

}
