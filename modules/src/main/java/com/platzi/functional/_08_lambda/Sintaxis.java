package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.println(curso));

        BiFunction<Integer,Integer,Integer> s = (x,y) -> x * y;

        usarZero(() -> 2); //metodo vacio y java INFIERE que el return es lo que va desp del ->

        usarPredicado(text -> text.isEmpty()); //porque PREDICATE VALIDA + devuelve un boolean
        usarPredicado(String::isEmpty); //usando referencia de metodo


        usarBiFunction((x,y) -> x * y); //entre () van los argumentos porque son mas de 1

        usarBiFunction((x,y) -> {
            System.out.println("X: " + x + ",Y: " + y);
            return x - y; //ACA SE ESPECIFICA EL RETURN para que java entienda donde vamos a devolver
        });

        usarNada(() -> {}); //no recibo ningun dato + no genero ningun resultado

        usarNada(() -> {
            System.out.println("Le agrego cuerpo al resultado pero NO devuelvo ningun dato");
        });
    }

    static void usarZero(ZeroArgumentos zeroArgumentos){

    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarBiFunction(BiFunction<Integer,Integer,Integer> calculo){

    }

    static void usarNada (OperarNada operarNada){

    }

    @FunctionalInterface
    interface ZeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
