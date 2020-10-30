package  com.example.demo.Controladores;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Negocio.ILogica;



@Controller
public class Controlador {
	@Autowired
	ILogica iLogica;
	
	@RequestMapping("Coches")
	
	public String calcularCohe(@RequestParam("nombre") String n,ModelMap model) throws IOException {
		
		iLogica.DatoCoche(n);
		Integer cantidadInteger=iLogica.incrementarContador();
		model.addAttribute("d", cantidadInteger);
		
		return "Coches";
		
	}

}
