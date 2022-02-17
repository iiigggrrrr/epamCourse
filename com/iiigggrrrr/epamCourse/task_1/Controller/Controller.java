package com.iiigggrrrr.epamCourse.task_1.Controller;

import com.iiigggrrrr.epamCourse.task_1.Input.Input;
import com.iiigggrrrr.epamCourse.task_1.Logic.Tasks;
import com.iiigggrrrr.epamCourse.task_1.Output.Output;

public abstract class Controller {
    protected Input input;
    protected Output output;
    protected Tasks solutions;


    protected Controller(Input input, Output output, Tasks solutions) {
        this.input = input;
        this.output = output;
        this.solutions = solutions;
    }

    public abstract void doTask();
}
