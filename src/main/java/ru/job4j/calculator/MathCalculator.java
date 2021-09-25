package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultipli(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double diffAndShare(double first, double second) {
        return diff(first, second)
                + share(first, second);
    }

    public static double totalVal(double first, double second) {
        return diff(first, second)
                + share(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultipli(10, 20));
        System.out.println("Результат расчета равен: " + diffAndShare(10, 20));
        System.out.println("Результат расчета равен: " + totalVal(10, 20));

    }
}
