package com.iiigggrrrr.epamCourse.task_1.Controller;

import com.iiigggrrrr.epamCourse.task_1.Input.Input;
import com.iiigggrrrr.epamCourse.task_1.Logic.Tasks;
import com.iiigggrrrr.epamCourse.task_1.Output.Output;

import javax.sql.rowset.Predicate;

public class Task2 extends Controller{
    public Task2(Input input, Output output, Tasks solutions) {
        super(input, output, solutions);
    }

    @Override
    public void doTask() {
        output.showText("\n\t\tTASK 2\n");

        double a = input.readDouble("a = ");
        double b = input.readDouble("b = ");
        double c = input.readDouble("c = ");

        double ans = solutions.f2(a, b, c);

        output.outTask2(a, b, c, ans);
    }
}
