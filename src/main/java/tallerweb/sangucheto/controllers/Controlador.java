package tallerweb.sangucheto.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;
import tallerweb.sangucheto.utils.Sanguchetto;
import tallerweb.sangucheto.utils.Stock;

@Controller
public class Controlador {
	
	@RequestMapping("/stock")
	public ModelAndView obtenerStock() {
		ModelAndView stock = new ModelAndView("stock");
		stock.addObject("stock",Stock.getInstance().obtenerStock());
		return stock;
	}
	
	@RequestMapping("/irAAgregarStock")
	public ModelAndView irAAgregarStock() {
		ModelMap miMap = new ModelMap();
		miMap.put("command", new AgregarStockCommand());
		miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
		return new ModelAndView("agregarStock",miMap);
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
			mensaje = "Stock agregado con exito, "+command.getNombreIngrediente()+" tiene "+stock+" unidades en stock";
		}
		else {
			mensaje = "Hubo un error al agregar el stock";
		}
		miMap.put("mensaje",mensaje);
		return new ModelAndView("resultadoAgregarStock",miMap);
	}
	
	@RequestMapping("/irAEliminarIngrediente")
	public ModelAndView irAEliminarIngrediente() {
    	ModelMap miMap = new ModelMap();
		miMap.put("listaDeIngredientes",Stock.getInstance().listarIngredientesDisponibles());
		miMap.put("command", new Ingrediente());
		return new ModelAndView("eliminarIngrediente",miMap);
	}
	
	@RequestMapping("/eliminarIngrediente")
	public ModelAndView eliminarIngrediente(Ingrediente ingrediente) {
		String mensaje;
		ModelMap miMap = new ModelMap();
		Boolean resultado = Stock.getInstance().eliminarIngrediente(ingrediente);
		
		if(resultado == true) {
			mensaje = ingrediente.getNombre()+" eliminado con exito";
		}
		else {
			mensaje = "Hubo un error al eliminar el ingrediente";
		}
		miMap.put("mensaje",mensaje);
		return new ModelAndView("resultadoEliminarIngrediente",miMap);
	}
	
	@RequestMapping(value="/formDarDeAltaIngrediente")
	public ModelAndView formDarDeAltaIngrediente() {
		ModelMap modelMap = new ModelMap();
		
		ArrayList<String> tipos = new ArrayList<String>();
		tipos.add(TipoIngrediente.CONDIMENTO.name());
		tipos.add(TipoIngrediente.INGREDIENTE.name());
		
		modelMap.put("tipos",tipos);
		
		modelMap.put("ingrediente", new IngredienteModel()); 
		
		return new ModelAndView("formDarDeAltaIngrediente",modelMap);
	}
	
	@RequestMapping(value="/darDeAltaIngrediente",method=RequestMethod.POST)
	public ModelAndView darDeAltaIngrediente(@ModelAttribute("ingrediente") IngredienteModel ingrediente) {
		Ingrediente ingredienteNuevo = new Ingrediente();
		
		ingredienteNuevo.setNombre(ingrediente.getNombre());
		ingredienteNuevo.setPrecio(ingrediente.getPrecio());
		
		if(ingrediente.getTipo() == "INGREDIENTE"){
			ingredienteNuevo.setTipo(TipoIngrediente.INGREDIENTE);
		} else {
			ingredienteNuevo.setTipo(TipoIngrediente.CONDIMENTO);
		}
			
		Stock.getInstance().agregarIngrediente(ingredienteNuevo);
		
		return new ModelAndView("darDeAltaIngrediente");
	}
	
	@RequestMapping("/sangucheto")
	public ModelAndView irASangucheto() {
		ModelMap miMap = new ModelMap();
		miMap.put("ingredientesSangucheto", Sanguchetto.getInstance().verIngredientes());
		miMap.put("condimentosSangucheto", Sanguchetto.getInstance().verCondimentos());
		miMap.put("precio", Sanguchetto.getInstance().getPrecio());
		miMap.put("ingredientesStock", Stock.getInstance().listarIngredientesEnStock());
		miMap.put("condimentosStock", Stock.getInstance().listarCondimentosEnStock());	
		miMap.put("ingredienteAgregar", new Ingrediente());
		miMap.put("condimentoAgregar", new Ingrediente());
		
		return new ModelAndView("sangucheto",miMap);
	}
	
	@RequestMapping(value="/agregarIngredienteASangucheto",method=RequestMethod.POST)
	public void agregarIngredienteASangucheto(@ModelAttribute("ingredienteAgregar") Ingrediente ingrediente) {
		agregarASangucheto(ingrediente);
	}
	
	@RequestMapping(value="/agregarCondimentoASangucheto",method=RequestMethod.POST)
	public void agregarCondimentoASangucheto(@ModelAttribute("condimentoAgregar") Ingrediente ingrediente) {
		agregarASangucheto(ingrediente);
	}
	
	public ModelAndView agregarASangucheto(Ingrediente ingrediente) {
		Sanguchetto.getInstance().agregarIngrediente(ingrediente);
		//Falta ver como hacemos para agregarle el ingrediente completo con su precio y tipo
		//Pense en hacer un metodo en Stock que recorra la lista de ingredientes buscando el que necesitamos y lo devuelva completo
		//Hay que ver
		return null;
	}
}
