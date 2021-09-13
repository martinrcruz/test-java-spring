package com.test.testjava.solution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/solution")
public class part4 {

    @GetMapping("/part4")
    public List<Integer> resolved4() { //Podria ser double


        //GENERAMOS UN LISTADO DE 20 NUMEROS ALEATORIOS DEL AL 100.
        int numero;
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {

            numero = (int) (Math.random() * 100);

            //Hacemos esto para que no se repita :D
            if (numeros.contains(numero)) {
                i--;
            } else {
                numeros.add(numero);
            }


        }

        ArrayList<Integer> numerosCuadrado = new ArrayList<>();

        //Elevar numeros al cuadrado
        for (Integer integer : numeros) {

            int numeroCuadrado = (int) Math.pow(integer, 2);
            numerosCuadrado.add(numeroCuadrado);

        }
        return numerosCuadrado;


    }

}