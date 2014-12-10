package tallerweb.sanguchetto.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;
import tallerweb.sangucheto.utils.Sanguchetto;

public class SanguchettoTest {

    @Before // Este metodo se ejecuta antes de cada Test
    public void inicializar() {
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
    }

    @After // Este metodo se ejecuta despues de cada Test
    public void limpiar() {
        Sanguchetto.getInstance().vaciar();
    }

    @Test
    public void testVaciar() {

        Sanguchetto.getInstance().vaciar();
        
        Integer ingredientes = Sanguchetto.getInstance().verIngredientes().size();
    	Integer condimentos = Sanguchetto.getInstance().verCondimentos().size();
    	
    	Assert.assertTrue(ingredientes+condimentos == 0);
    }

    @Test
    public void testAgregarIngrediente() {
    	Ingrediente tomate = new Ingrediente();
    	tomate.setNombre("tomate");
    	tomate.setPrecio(2.00);
    	tomate.setTipo(TipoIngrediente.INGREDIENTE);
        
        Sanguchetto.getInstance().agregarIngrediente(tomate);
    	
    	Integer ingredientes = Sanguchetto.getInstance().verIngredientes().size();
    	Integer condimentos = Sanguchetto.getInstance().verCondimentos().size();
    	
    	Assert.assertTrue(ingredientes+condimentos == 4);
    }

    @Test
    public void testVerIngredientes() {
    	
    	Assert.assertTrue(Sanguchetto.getInstance().verIngredientes().size() == 2);
    }

    @Test
    public void testVerCondimentos() {
    	
    	Assert.assertTrue(Sanguchetto.getInstance().verCondimentos().size() == 1);
    }

    @Test
    public void testGetPrecio() {
    	
    	Assert.assertTrue(Sanguchetto.getInstance().getPrecio() == 5);
    }
    
}