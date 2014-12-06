package tallerweb.sangucheto.utils;

import java.util.LinkedList;
import java.util.List;

import tallerweb.sangucheto.model.Ingrediente;
import tallerweb.sangucheto.model.TipoIngrediente;

public class Sanguchetto {

	private static Sanguchetto instance = new Sanguchetto();
	private List<Ingrediente> ingredientes = new LinkedList<Ingrediente>();
	
	private Sanguchetto(){}
	
	public static Sanguchetto getInstance(){
		return instance;
	}
	
	/**
	 * Elimina todos los ingredientes del sanguchetto.<br>
	 */
	public void vaciar(){
		this.ingredientes.clear();
	}
	
	/**
	 * Agrega un ingrediente al carrito.<br>
	 * @param ingrediente
	 */
	public void agregarIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	/**
	 * Lista todos los ingredientes que forman parte del sanguchetto.<br>
	 * @return
	 */
	public List<Ingrediente> verIngredientes(){
		List<Ingrediente> resultado = new LinkedList<Ingrediente>();
		for(Ingrediente each : this.ingredientes) {
			if (each.getTipo().equals(TipoIngrediente.INGREDIENTE)) {
				resultado.add(each);
			}
		}
		return resultado;
	}
	
	/**
     * Lista todos los condimentos que forman parte del sanguchetto.<br>
     * @return
     */
    public List<Ingrediente> verCondimentos(){
    	List<Ingrediente> resultado = new LinkedList<Ingrediente>();
		for(Ingrediente each : this.ingredientes) {
			if (each.getTipo().equals(TipoIngrediente.CONDIMENTO)) {
				resultado.add(each);
			}
		}
		return resultado;
    }
    
    /*
     * Listar ingredientes y condimentos del sangucheto
     */
    public List<Ingrediente> listarTodosLosIngredientes(){
    	return this.ingredientes;
    }
	
	/**
	 * Devuelve el precio total del sanguchetto.<br>
	 * @return
	 */
	public Double getPrecio(){
		Double sumaPrecio = 0.0;
		for(Ingrediente each : this.ingredientes) {
			sumaPrecio += each.getPrecio();
		}
		return sumaPrecio;
	}
}
