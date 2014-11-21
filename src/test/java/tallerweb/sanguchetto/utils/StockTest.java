package tallerweb.sanguchetto.utils;

import org.junit.Test;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;
import tallerweb.sangucheto.utils.Stock;

public class StockTest {
	@Test
	public void testAgregarIngrediente() {
		Ingrediente ketchup = new Ingrediente();
		ketchup.setNombre("Ketchup");
		ketchup.setPrecio(1.00);
		ketchup.setTipo(TipoIngrediente.CONDIMENTO);
		Stock.getInstance().agregarIngrediente(ketchup);
		Stock.getInstance().agregarStock(ketchup, 5);
		
		System.out.println(Stock.getInstance().obtenerStockDisponible(ketchup));
	}
}
