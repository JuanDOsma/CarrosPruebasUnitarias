package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import co.edu.unbosque.model.Automovil;

public class AutomivilDAO {

	public Archivo archivo;

	public AutomivilDAO(Archivo archivo) {
		this.archivo = archivo;
	}
	
	public Automovil buscarAutomovil(String placa, ArrayList<Automovil> automoviles) {
		Automovil encontrado = null;

		if (!automoviles.isEmpty()) {
			for (int i = 0; i < automoviles.size(); i++) {
				if (automoviles.get(i).getPlaca().equals(placa)) {
					encontrado = automoviles.get(i);
				}
			}
		}

		return encontrado; 
	}

	public boolean agregarAutomovil(String marca, String modelo, String anio, String placa, String puertas, String capacidad, String tipo, ArrayList<Automovil> automovil,File file) {
		Automovil a = new Automovil(marca, modelo, anio, placa, puertas, capacidad, tipo);
		if (buscarAutomovil(placa, automovil) == null) {
			automovil.add(a);
			archivo.escribirEnArchivo(automovil, file);
			return true;
		} else {
			return false;
		}
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

}
