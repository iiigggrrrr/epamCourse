package com.iiigggrrrr.epamCourse.task_1.Controller;

import com.iiigggrrrr.epamCourse.task_1.Input.Input;
import com.iiigggrrrr.epamCourse.task_1.Logic.Tasks;
import com.iiigggrrrr.epamCourse.task_1.Output.Output;

public class Task1 extends Controller {
    public Task1(Input input, Output output, Tasks solutions) {
        super(input, output, solutions);
    }

    @Override
    public void doTask() {
        output.showText("\n\t\tTASK 1\n");

        int a = input.readInt("Enter the number with 4 digits: ", (x) -> x > 999 && x <= 9999);

        boolean b = solutions.f1(a);

        output.outTask1(a, b);
    }


}
