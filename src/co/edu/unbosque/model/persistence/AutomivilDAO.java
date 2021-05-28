package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import co.edu.unbosque.model.Automovil;
import co.edu.unbosque.model.Ciudadano;

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
	
	public boolean eliminarAutomovil(String placa, ArrayList<Automovil> automoviles, File file) {
		boolean resp = false;
		try {
			Automovil e = buscarAutomovil(placa, automoviles);
			if (e != null) {
				automoviles.remove(e);
				file.delete();
				file.createNewFile();
				archivo.escribirEnArchivo(automoviles, file);
				resp = true;
			}
			return resp;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return resp;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}

}
