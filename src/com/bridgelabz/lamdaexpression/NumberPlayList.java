package com.bridgelabz.lamdaexpression;


import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class NumberPlayList {
    public static void main(String[] args) {
        ArrayList<Integer> myNumberList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)
            myNumberList.add(i);
        for (int i : myNumberList)
            System.out.println("numbers are " + i);
        // explicit lambda function
        Consumer<Integer> myListAction = n -> System.out.println("lambda impl foreach value :" + n);
        myNumberList.forEach(myListAction);
        // implicit lambda function
        myNumberList.forEach(n -> System.out.println("values are: " + n));
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer t) {
                System.out.println("values of list using class: " + t);
            }
        }
        MyConsumer action = new MyConsumer();
        myNumberList.forEach(action);

        // using Anonymous class
        myNumberList.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("values of list using Anonymous class: " + t);
            }
        });
      //implicit lambda function to print double values of integer array list
      		Function<Integer, Double> toDoubleFunction=Integer::doubleValue;
      		myNumberList.forEach(n->System.out.println("foreach lambda function to double value "+toDoubleFunction.apply(n)));
      		Predicate<Integer> isEvenFunction = n -> n > 0 && n % 2 == 0;
            myNumberList.forEach(n -> System.out
                    .println((isEvenFunction.test(n) == true) ? +n + " is even number" : +n + " is a odd number"));
    }
} 