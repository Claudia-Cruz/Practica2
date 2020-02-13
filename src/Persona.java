package com.company;

public class Persona {
    private String nombre;
    private int matricula;

    Persona(String nnombre,int nmatricula){
        nombre=nnombre;
        matricula=nmatricula;
    }

    String GetNombre(){
        return nombre;
    }
    int GetMatricula(){
        return matricula;
    }
}
