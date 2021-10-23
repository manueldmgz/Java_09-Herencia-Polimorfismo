package com.generation;

import com.generation.uber.UberDriver;
import com.generation.uber.UberDriverBlack;

public class Main {

    public static void main(String[] args) {

        UberDriver driver = new UberDriver();
        UberDriverBlack driverBlack = new UberDriverBlack();
        driverBlack.setMinimum(10);


        System.out.println("Precios de Uber");
        System.out.println(driver.calculatePrice(6));
        System.out.println(driverBlack.calculatePrice(6));

    }

        /*Ave ave = new Ave("pettirojo");
        System.out.println(ave.getNombre());
        Ave ave2 = new Ave();
        Ave ave3 = new Ave("piolin", 2);
        //ave.comunicarse();
        //ave.hacerNido();
        //ave.comer();

        System.out.println("-----------------");


        Perro perro = new Perro("pulgas");
        perro.jugar();
        perro.comer();


        Animal animal new Animal();
        animal.comer();
        animal.hacerNido;*/
    }
