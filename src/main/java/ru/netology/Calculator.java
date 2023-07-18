package ru.netology;

import java.util.function.*;

public class Calculator implements Supplier {
    static Supplier<Calculator> instance = Calculator::new;

    Calculator() { };

    @Override
    public Object get() {
        return null;
    }

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Ошибка была в devide, она возникала из-за того, что Y при делении был равен 0.
    BinaryOperator<Integer> devide = (x, y) -> {
        if(y == 0) {
            System.out.println("Ошибка! На 0 делить нельзя!");
            return Integer.MIN_VALUE;
        }
        return x / y;

    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}