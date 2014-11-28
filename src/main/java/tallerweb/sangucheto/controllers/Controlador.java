package tallerweb.sangucheto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public ModelAndView agregarStock(AgregarStockCommand command) {
		String mensaje;
		ModelMap miMap = new ModelMap();
		Ingrediente ingrediente = new Ingrediente();
		ingrediente.setNombre(command.getNombreIngrediente());
		Boolean resultado = Stock.getInstance().agregarStock(ingrediente, command.getCantidad());
		
		if(resultado == true) {
			Integer stock = Stock.getInstance().obtenerStockDisponible(ingrediente);
			mensaje = "Stock agregado con éxito, "+command.getNombreIngrediente()+" tiene "+stock+" unidades en stock";
		}
		else {
			mensaje = "Hubo un error al agregar el stock";
		}
		miMap.put("mensaje",mensaje);
		return new ModelAndView("/resultadoAgregarStock",miMap);
	}
	
	@RequestMapping("/irAAgregarStock")
	public ModelAndView irAAgregarStock() {
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
		ModelMap miMap = new ModelMap();
		miMap.put("command", new AgregarStockCommand());
		miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
		return new ModelAndView("agregarStock",miMap);
	}
	
	@RequestMapping("/eliminarIngrediente")
	public ModelAndView eliminarIngrediente(Ingrediente ingrediente) {
		String mensaje;
		ModelMap miMap = new ModelMap();
		Boolean resultado = Stock.getInstance().eliminarIngrediente(ingrediente);
		
		if(resultado == true) {
			mensaje = ingrediente.getNombre()+" eliminado con éxito";
		}
		else {
			mensaje = "Hubo un error al eliminar el ingrediente";
		}
		miMap.put("mensaje",mensaje);
		return new ModelAndView("/resultadoEliminarIngrediente",miMap);
	}
	
	@RequestMapping("/irAEliminarIngrediente")
	public ModelAndView irAEliminarIngrediente() {
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
    	ModelMap miMap = new ModelMap();
		miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
		miMap.put("command", new Ingrediente());
		return new ModelAndView("eliminarIngrediente",miMap);
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
