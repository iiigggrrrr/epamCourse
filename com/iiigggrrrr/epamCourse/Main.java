package com.iiigggrrrr.epamCourse;

import com.iiigggrrrr.epamCourse.task_1.Controller.*;
import com.iiigggrrrr.epamCourse.task_1.Input.InputConsole;
import com.iiigggrrrr.epamCourse.task_1.Logic.MySolutions;
import com.iiigggrrrr.epamCourse.task_1.Output.OutputConsole;

import java.util.Arrays;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        Task1 task1 = new Task1(new InputConsole(new OutputConsole()), new OutputConsole(), new MySolutions());
        Task2 task2 = new Task2(new InputConsole(new OutputConsole()), new OutputConsole(), new MySolutions());
        Task3 task3 = new Task3(new InputConsole(new OutputConsole()), new OutputConsole(), new MySolutions());

        task1.doTask();
        task2.doTask();
        task3.doTask();
    }
}
