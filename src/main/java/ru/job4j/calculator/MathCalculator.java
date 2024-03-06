package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double sumOfTwoOperations(double first, double second) {
        return MathFunction.minus(first, second)
                + MathFunction.division(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return MathFunction.minus(first, second)
               + MathFunction.division(first, second)
               + MathFunction.sum(first, second)
               + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разницы и деления равна: " + sumOfTwoOperations(10, 20));
        System.out.println("Сумма всех операций будет равна: " + sumOfAllOperations(10, 20));
    }
}