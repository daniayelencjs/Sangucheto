package tallerweb.sanguchetto.utils;

import org.junit.Assert;
import org.junit.Test;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;
import tallerweb.sangucheto.utils.Sanguchetto;

public class SanguchettoTest {

    @Test
    public void testVaciar() {
        // Implementar
    }

    @Test
    public void testAgregarIngrediente() {
        // Implementar
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
    	
    	Sanguchetto.getInstance().agregarIngrediente(mayonesa);
    	Sanguchetto.getInstance().agregarIngrediente(tomate);
    	Sanguchetto.getInstance().agregarIngrediente(jamon);
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
    	Assert.assertTrue(Sanguchetto.getInstance().verCondimentos().size() == 1);
    }

    @Test
    public void testGetPrecio() {
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
    	
    	Sanguchetto.getInstance().agregarIngrediente(mayonesa);
    	Sanguchetto.getInstance().agregarIngrediente(tomate);
    	Sanguchetto.getInstance().agregarIngrediente(jamon);
    	
    	Assert.assertTrue(Sanguchetto.getInstance().getPrecio() == 15);
    }
}
