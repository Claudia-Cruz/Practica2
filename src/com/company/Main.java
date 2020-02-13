package com.company;


import com.company.Persona;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona alumno = new Persona("Claudia",1254176);
        System.out.println("Nombre: "+alumno.GetNombre());
        System.out.println("Matricula: "+alumno.GetMatricula());
    }
}
