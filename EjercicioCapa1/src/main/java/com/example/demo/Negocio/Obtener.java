/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Negocio;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.consultaDatos.IconsultaDatos;

/**
 *
 * @author serzu
 */
@Component
public class Obtener implements ILogica{

	@Autowired
	IconsultaDatos iconsultaDatos;
	
  

    public Obtener() {

    }

    public void DatoCoche(String nombre) throws IOException {
     
    	iconsultaDatos.consultaFichero(nombre);

    }

    public int incrementarContador() {

        return iconsultaDatos.getListadoCoches().size();
    }

}
