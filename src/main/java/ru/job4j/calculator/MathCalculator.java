package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumOfMinusAndDivision(double first, double second) {
        return sum(minus(first, second), division(first, second));
    }

    public static double sumOfSumAndMultiplyAndMinusAndDivision(double first, double second) {
        return sum(sum(sum(first, second), minus(first, second)), sum(multiply(first, second), division(first, second)));
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfMinusAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumOfSumAndMultiplyAndMinusAndDivision(10, 20));
    }
}