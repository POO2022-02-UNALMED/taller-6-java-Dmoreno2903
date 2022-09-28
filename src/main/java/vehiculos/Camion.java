package vehiculos;

public class Camion extends Vehiculo{
	//Atributos
	private static int cantidadCamiones;
	private int ejes;
	
	//Constructores
	public Camion(String placa, String nombre, double precio, double peso,
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
	}
	public Camion() {
		cantidadCamiones++;
	}
	
	//Get and Set
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static int cantidadCamiones() {
		return cantidadCamiones;
	}
}
