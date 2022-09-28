package vehiculos;

public class Pais {
	//Atributos
	private String nombre;
	
	//Constructores
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Pais paisMasVendedor() {
		Fabricante fabMayorVentas = Fabricante.fabricaMayorVentas();
		return fabMayorVentas.getPais();
	}
}
