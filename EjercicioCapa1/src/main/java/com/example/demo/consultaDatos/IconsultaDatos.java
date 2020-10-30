package com.example.demo.consultaDatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IconsultaDatos {
	void consultaFichero(String nombre) throws FileNotFoundException, IOException;
	List<String> getListadoCoches();
}
