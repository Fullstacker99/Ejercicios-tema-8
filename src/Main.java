package com.open_bootcamp;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Juan");
        persona1.setEdad(22);
        persona1.setNumero(235698523);

        System.out.println("Nombre:" + persona1.getNombre());
        System.out.println("Edad:" + persona1.getEdad());
        System.out.println("Numero:" + persona1.getNumero());
    }
}

class Persona{
    private String nombre;
    private int numero;
    private int edad;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }
}