package com.test.testjava.solution;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

@RestController
@RequestMapping("/solution")
public class part2 {

    @GetMapping("/part2")
    public Integer resolved2() {

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



        int max = (int) Collections.max(numeros);
        return max;




    }
}
