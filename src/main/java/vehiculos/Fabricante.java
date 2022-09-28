package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	//Atributos
	public static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
	private String nombre;
	private Pais pais;
	
	//Constructores
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	//Métodos
	public static void agregarFabricante(Fabricante fabricante) {
		listado.add(fabricante);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Fabricante fabricaMayorVentas() {
		Fabricante fMayorVentas = null;
		int nMayorVentas = 0;
		for(Fabricante fab:listado) {
			int nVentas = Collections.frequency(listado, fab); 
			if( nVentas > nMayorVentas) {
				nMayorVentas = nVentas;
				fMayorVentas = fab;
			}
		}
		return fMayorVentas;
	}
	
}
