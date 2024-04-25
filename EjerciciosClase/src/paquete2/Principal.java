/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

public class Principal {
    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/
        
        InstitucionEducativa i1 = new InstitucionEducativa();
        String nombre = "Daniel Alvarez Burneo";
        String tipoInstitucion = "Fiscomisional";
        int numeroAlumnos = 5000;
        int numeroDocentes = 200;
        int numeroSedes = 5;
        
        i1.establecerNombre(nombre);
        i1.establcerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establcerNumeroSedes(numeroSedes);
        
        System.out.printf("Nombre de la Institucion Educativa: %s\n"
                + "Tipo de Institucion: %s\nNumero de Alumnos: %d\n"
                + "Numero de Docentes: %d\nNumero de Sedes: %d\n"
                , i1.obtenerNombre(), i1.obtenerTipoInstitucion(), 
                i1.obtenerNumeroAlumnos(), i1.obtenerNumeroDocentes()
                ,i1.obtenerNumeroSedes());
    }
}
