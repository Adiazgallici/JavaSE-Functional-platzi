package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply("Hola loko como va"));

        System.out.println(addMark.apply("Hola flaco"));

        BiFunction<Integer,Integer,Integer> multiplicacion =
                (x,y) -> x * y;
        multiplicacion.apply(5,4);

        BinaryOperator<Integer> multiplicacion2 =
                (x,y) -> x * y; //es lo mismo pero maneja siempre el mismo tipo de dato para los dos argumentos + el resultado


        BiFunction<String, Integer, String> leftPad =
                (text, spaceNumbers) -> String.format("%" + spaceNumbers + "s" , text); //cant de espacios "s" en el text recibido

        System.out.println(leftPad.apply("Java", 10));

        List<BiFunction<String, Integer,String>> formateador; //para tener una lista que reciba texto
        // y lo vaya formateando con respecto al formato que le pasemos en distintas funciones
    }
}
