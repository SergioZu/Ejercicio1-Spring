/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.consultaDatos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // es el estereotipo principal, indica que la clase anotada es un component
public class ConsultaDatos implements IconsultaDatos{//implementamos la interfaz
	
    List<String> listadoCoches;
   
    public ConsultaDatos() {
        listadoCoches = new ArrayList<>();
    }

    public void consultaFichero(String nombre) throws FileNotFoundException, IOException {
        String linea;

        File fichero = new File("C://Users//20201//Desktop//Coches.txt");

        BufferedReader lector = new BufferedReader(new FileReader(fichero));

        while ((linea = lector.readLine()) != null) {
            if (linea.contains(nombre)) {
                descomponerCoches(linea);
            }
        }
    }

    public void descomponerCoches(String linea) {
        String[] arrayPersona = linea.split("-");
        listadoCoches.add(arrayPersona[1]);
    }

    public List<String> getListadoCoches() {
        return listadoCoches;
    }

}
