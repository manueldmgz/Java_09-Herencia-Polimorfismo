package com.generation.animales;

public class Perro extends Animal implements Mascota, Mamiferos {

    private int patas;
    private boolean cola;
    private String raza;

    public Perro (String nombre) { super(nombre); }


    @Override
    public void jugar() {
        System.out.println("Estoy jugando");
    }

    @Override
    public void dormir() {
        System.out.println("ZZZZZZ");
    }

    @Override
    public void hablar() {
        System.out.println("Guaffff");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo croquetas");
    }

    @Override
    public void respirar() {
        System.out.println("Estoy respirando por la nariz");
    }


    @Override
    public void gestar() {
        System.out.println("Tiempo de 2 meses ");
    }

    @Override
    public void ingestarLeche() {
        System.out.println("Estoy tomando leche");

    }

    @Override
    public void movilidad() {
        System.out.println("Camino en cuatro patas");
    }
}
