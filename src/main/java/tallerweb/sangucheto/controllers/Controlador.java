package tallerweb.sangucheto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;
import tallerweb.sangucheto.utils.Stock;

@Controller
public class Controlador {
	
	
	@RequestMapping("/stock")
	public ModelAndView obtenerStock() {
		// BORRAR LO COMENTADO
//		//-------------------------------------
//		Ingrediente mayonesa = new Ingrediente();
//    	mayonesa.setNombre("Mayonesa");
//    	mayonesa.setPrecio(0.50);
//    	mayonesa.setTipo(TipoIngrediente.CONDIMENTO);
//    	
//    	Ingrediente tomate = new Ingrediente();
//    	tomate.setNombre("Tomate");
//    	tomate.setPrecio(2.50);
//    	tomate.setTipo(TipoIngrediente.INGREDIENTE);
//    	
//    	Ingrediente jamon = new Ingrediente();
//    	jamon.setNombre("Jamon");
//    	jamon.setPrecio(2.00);
//    	jamon.setTipo(TipoIngrediente.INGREDIENTE);
//    	
//    	Stock.getInstance().agregarIngrediente(mayonesa);
//    	Stock.getInstance().agregarIngrediente(tomate);
//    	Stock.getInstance().agregarIngrediente(jamon);
//    	//-------------------------------------
		ModelAndView stock = new ModelAndView("stock");
		stock.addObject("stock",Stock.getInstance().obtenerStock());		
		return stock;
	}
	
	@RequestMapping("/agregarStock")
	public ModelAndView agregarStock() {
		// BORRAR LO COMENTADO
//		//-------------------------------------
		Ingrediente mayonesa = new Ingrediente();
    	mayonesa.setNombre("Mayonesa");
    	mayonesa.setPrecio(0.50);
    	mayonesa.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente tomate = new Ingrediente();
    	tomate.setNombre("Tomate");
    	tomate.setPrecio(2.50);
    	tomate.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente jamon = new Ingrediente();
    	jamon.setNombre("Jamon");
    	jamon.setPrecio(2.00);
    	jamon.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Stock.getInstance().agregarIngrediente(mayonesa);
    	Stock.getInstance().agregarIngrediente(tomate);
    	Stock.getInstance().agregarIngrediente(jamon);
//    	//-------------------------------------
		ModelAndView stock = new ModelAndView("agregarStock");
		stock.addObject("listaDeIngrediente",Stock.getInstance().listarIngredientesDisponibles());
		return stock;
	}
	
	@RequestMapping(value="/agregarStock",method=RequestMethod.POST)
	public ModelAndView agregarCantidadStock(@RequestParam String ingredienteKey, @RequestParam Integer cantidad) {
		//todavia no se que hacer aca ¬¬
	}
	
	@RequestMapping(value="/formDarDeAltaIngrediente")
	public ModelAndView formDarDeAltaIngrediente() {
		ModelMap modelMap = new ModelMap();
		modelMap.put("ingrediente", new Ingrediente());
		return new ModelAndView("formDarDeAltaIngrediente",modelMap);
	}
	
	@RequestMapping(value="/darDeAltaIngrediente",method=RequestMethod.POST)
	public ModelAndView darDeAltaIngrediente(@ModelAttribute("ingrediente") Ingrediente ingrediente) {
		Stock.getInstance().agregarIngrediente(ingrediente);
		return new ModelAndView("/darDeAltaIngrediente");
	}
}
