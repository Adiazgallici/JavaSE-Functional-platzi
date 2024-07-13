package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class Mathfunctions {
    public static void main(String[] args) {
        Function<Integer,Integer> squareFunction =
                new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };

//        System.out.println(squareFunction.apply(5));
//        System.out.println(squareFunction.apply(25));
//        System.out.println(square(5));

        Function<Integer,Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0; //una function que testea si algo es valido

        isEven.test(4); //true

        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student agus = new Student(5.9);
        System.out.println("El estudiante is approved: " + isApproved.test(agus));

    }

    static class Student{
        private double calificacion;

        public Student(double calificacion){
            this.calificacion = calificacion;
        }
        public double getCalificacion() {
            return calificacion;
        }
    }

    static int square(int x) {

        return x*x;
    }

}