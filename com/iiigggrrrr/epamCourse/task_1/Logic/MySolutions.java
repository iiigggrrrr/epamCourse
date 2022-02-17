package com.iiigggrrrr.epamCourse.task_1.Logic;

import java.util.Arrays;
import java.util.function.Function;

public class MySolutions implements Tasks{

    @Override
    public boolean f1(int a) {
        return a / 1000 + a / 100 % 10 == a / 10 % 10 + a % 10;
    }

    @Override
    public double f2(double a, double b, double c) {
        return (b + Math.sqrt(b*b + 4*a*c)) / (2*a) - Math.pow(a, 3)*c - Math.pow(b, -2);
    }

    @Override
    public double[] f3(double length, double width) {
        return new double[]{(length + width) * 2, length * width};
    }

    @Override
    public boolean f4(double x, double y) {
        return ((Math.abs(x) <= 2) && (Math.abs(y-2) <= 2))
                || ((Math.abs(x) <= 4) && (Math.abs(y+1.5) <= 1.5));
    }

    @Override
    public double[] f5(double a, double b, double c) {
        return new double[] {func(a), func(b), func(c)};
    }
    private double func(double a) {
        if (a >= 0) return Math.pow(a, 2);
        else return Math.pow(a, 4);
    }

    @Override
    public double f6(double a, double b, double c) {
        if (isNumberBetweenOthers(a, b, c)) {
            return b + c;
        } else if (isNumberBetweenOthers(b, c, a)) {
            return c + a;
        } else {
            return a + b;
        }
    }
    private boolean isNumberBetweenOthers(double a, double b, double c) {
        if (b > c) {
            return ((c < a) && (a < b));
        } else {
            return ((b < a) && (a < c));
        }
    }

    @Override
    public double[][] f7(double a, double b, double h) {
        Function<Double, Double> func = (x) -> Math.pow(Math.sin(x), 2) - Math.cos(2*x);
        int length = (int) Math.ceil((b - a) / h) + 1;
        double[][] res = new double[length][2];

        double x = a;
        for (int i = 0; i < length-1; i++) {
            res[i] = new double[] {x, func.apply(x)};
            x += h;
        }
        res[length-1] = new double[] {b, func.apply(b)};

        return res;
    }

    @Override
    public int f8(int[] numbers, int k) {
        return Arrays.stream(numbers).filter((x) -> x % k == 0)
                .reduce(0, Integer::sum);
    }

    @Override
    public double[] f9(double[] a, double[] b, int k) {
        double[] res = new double[a.length + b.length];

        int i = 0;
        while (i <= k) {
            res[i] = a[i];
            i++;
        }
        while (i <= k + b.length) {
            res[i] = b[i-k-1];
            i++;
        }
        while (i < a.length + b.length) {
            res[i] = a[i - b.length];
            i++;
        }
        return res;
    }

    @Override
    public int[][] f10(int n) {
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i += 2)
            for (int j = 0; j < n; j++){
                res[i][j] = j + 1;
                res[i+1][j] = n - j;
            }
        return res;
    }
}
