package com.iiigggrrrr.epamCourse.task_1.Controller;

import com.iiigggrrrr.epamCourse.task_1.Input.Input;
import com.iiigggrrrr.epamCourse.task_1.Logic.Tasks;
import com.iiigggrrrr.epamCourse.task_1.Output.Output;

public class Task3 extends Controller{
    public Task3(Input input, Output output, Tasks solutions) {
        super(input, output, solutions);
    }

    @Override
    public void doTask() {
        output.showText("\n\t\tTASK 3\n");

        double length = input.readDouble("Enter the length : ", (x) -> x >= 0);
        double width = input.readDouble("Enter the width : ", (x) -> x >= 0);

        double[] perimeterAndArea = solutions.f3(length, width);

        output.outTask3(length, width, perimeterAndArea[1], perimeterAndArea[0]);
    }
}
