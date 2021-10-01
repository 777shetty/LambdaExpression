package com.bridgelabz.lamdaexpression;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
    static void printResult(int a,int b,String functionName,IMathFunction functionObj) {
        System.out.println(functionName+" is  "+functionObj.calculate(a, b));
    }
}

public class MathOperationApp {
    public static void main(String[] args) {
    	IMathFunction add = Integer::sum;
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction divide = (int a, int b) -> a / b;
        IMathFunction subtract = (int a, int b) -> a - b;
        System.out.println("addition " + add.calculate(2, 3));
        System.out.println("multiplication " + multiply.calculate(2, 3));
        System.out.println("subtraction " + subtract.calculate(2, 3));
        System.out.println("division " + divide.calculate(4, 2));
        IMathFunction.printResult(2, 3, "addition", add);
        IMathFunction.printResult(3, 2, "multiply", multiply);
        IMathFunction.printResult(5, 3, "subtract", subtract);
        IMathFunction.printResult(4, 2, "division", divide);
    }
}

