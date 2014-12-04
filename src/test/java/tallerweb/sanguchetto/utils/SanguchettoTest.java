package tallerweb.sanguchetto.utils;

import org.junit.Assert;
import org.junit.Test;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;
import tallerweb.sangucheto.utils.Sanguchetto;
import tallerweb.sangucheto.utils.Stock;

public class SanguchettoTest {

    @Test
    public void testVaciar() {
    	Ingrediente mostaza = new Ingrediente();
    	mostaza.setNombre("Mostaza");
    	mostaza.setPrecio(0.50);
    	mostaza.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(2.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente queso = new Ingrediente();
    	queso.setNombre("Queso");
    	queso.setPrecio(2.00);
    	queso.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Sanguchetto.getInstance().agregarIngrediente(mostaza);
    	Sanguchetto.getInstance().agregarIngrediente(lechuga);
    	Sanguchetto.getInstance().agregarIngrediente(queso);
    	
        Sanguchetto.getInstance().vaciar();
        
        Integer ingredientes = Sanguchetto.getInstance().verIngredientes().size();
    	Integer condimentos = Sanguchetto.getInstance().verCondimentos().size();
    	
    	Assert.assertTrue(ingredientes+condimentos == 0);
    }

    @Test
    public void testAgregarIngrediente() {
    	Ingrediente mostaza = new Ingrediente();
    	mostaza.setNombre("Mostaza");
    	mostaza.setPrecio(0.50);
    	mostaza.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(2.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente queso = new Ingrediente();
    	queso.setNombre("Queso");
    	queso.setPrecio(2.00);
    	queso.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Sanguchetto.getInstance().agregarIngrediente(mostaza);
    	Sanguchetto.getInstance().agregarIngrediente(lechuga);
    	Sanguchetto.getInstance().agregarIngrediente(queso);
    	
    	Integer ingredientes = Sanguchetto.getInstance().verIngredientes().size();
    	Integer condimentos = Sanguchetto.getInstance().verCondimentos().size();
    	
    	Assert.assertTrue(ingredientes+condimentos == 3);
    }

    @Test
    public void testVerIngredientes() {
    	Ingrediente mostaza = new Ingrediente();
    	mostaza.setNombre("Mostaza");
    	mostaza.setPrecio(0.50);
    	mostaza.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(2.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente queso = new Ingrediente();
    	queso.setNombre("Queso");
    	queso.setPrecio(2.00);
    	queso.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Sanguchetto.getInstance().agregarIngrediente(mostaza);
    	Sanguchetto.getInstance().agregarIngrediente(lechuga);
    	Sanguchetto.getInstance().agregarIngrediente(queso);
    	
    	Assert.assertTrue(Sanguchetto.getInstance().verIngredientes().size() == 2);
    }

    @Test
    public void testVerCondimentos() {
    	Ingrediente mostaza = new Ingrediente();
    	mostaza.setNombre("Mostaza");
    	mostaza.setPrecio(0.50);
    	mostaza.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(2.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente queso = new Ingrediente();
    	queso.setNombre("Queso");
    	queso.setPrecio(2.00);
    	queso.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Sanguchetto.getInstance().agregarIngrediente(mostaza);
    	Sanguchetto.getInstance().agregarIngrediente(lechuga);
    	Sanguchetto.getInstance().agregarIngrediente(queso);
    	
    	Assert.assertTrue(Sanguchetto.getInstance().verCondimentos().size() == 1);
    }

    @Test
    public void testGetPrecio() {
    	Ingrediente mostaza = new Ingrediente();
    	mostaza.setNombre("Mostaza");
    	mostaza.setPrecio(0.50);
    	mostaza.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(2.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente queso = new Ingrediente();
    	queso.setNombre("Queso");
    	queso.setPrecio(2.00);
    	queso.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Sanguchetto.getInstance().agregarIngrediente(mostaza);
    	Sanguchetto.getInstance().agregarIngrediente(lechuga);
    	Sanguchetto.getInstance().agregarIngrediente(queso);
    	
    	Assert.assertTrue(Sanguchetto.getInstance().getPrecio() == 5);
    }
    
    @Test
    public void sarasa() {
    	Ingrediente mostaza = new Ingrediente();
    	mostaza.setNombre("Mostaza");
    	mostaza.setPrecio(0.50);
    	mostaza.setTipo(TipoIngrediente.CONDIMENTO);
    	
    	Ingrediente lechuga = new Ingrediente();
    	lechuga.setNombre("Lechuga");
    	lechuga.setPrecio(2.50);
    	lechuga.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Ingrediente queso = new Ingrediente();
    	queso.setNombre("Queso");
    	queso.setPrecio(2.00);
    	queso.setTipo(TipoIngrediente.INGREDIENTE);
    	
    	Stock.getInstance().agregarIngrediente(queso);
    	Stock.getInstance().agregarIngrediente(lechuga);
    	Stock.getInstance().agregarIngrediente(mostaza);
    	
    	Stock.getInstance().agregarStock(queso, 12);
    	Stock.getInstance().agregarStock(lechuga, 43);
    	Stock.getInstance().agregarStock(mostaza, 24);
    	
    	for(Ingrediente cada : Stock.getInstance().listarIngredientesEnStock()) {
			System.out.println(cada.getNombre());
		}
    }
}
