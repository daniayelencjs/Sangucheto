package tallerweb.sangucheto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tallerweb.sangucheto.utils.Stock;

@Controller
public class Controlador {
	
	
	@RequestMapping("/stock")
	public ModelAndView obtenerStock() {
		Stock.getInstance().obtenerStock();
		
		ModelAndView stock = new ModelAndView("stock");
		stock.addObject("stock",Stock.getInstance().obtenerStock());

		
		return stock;
	}
}
