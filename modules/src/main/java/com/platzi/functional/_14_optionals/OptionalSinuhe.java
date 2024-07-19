package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalSinuhe {

    public static void main(String[] args) {
        List<String> names = getNames();

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()){
            //do something
        }

        optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println));

//        optionalNames.flatMap()

        Optional<String> valuablePlayer = optionalValPlayer();

        String ValuablePlayerName = valuablePlayer.orElseGet(() -> "Nombre por defecto");

    }
    static List<String> getNames(){
     List<String> list = new LinkedList<>();

     return Collections.emptyList();
    }

    static String mostValuablePlayer(){
        //return ""
        return null;
    }

    static int mostExpensiveItem(){
        return -1;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        //obtencion de nombres
        return Optional.of(namesList);
    }

    static Optional<String> optionalValPlayer(){
        //search in DB + not found --> return null
//        return Optional.ofNullable();
        try {
            //acceder a la dB
            //ver si encontramos alguna info
        } catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
