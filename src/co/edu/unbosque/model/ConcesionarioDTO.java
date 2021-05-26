package co.edu.unbosque.model;

import java.io.File;
import java.util.ArrayList;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.AutomivilDAO;

public class ConcesionarioDTO {
	
	private ArrayList<Automovil> automoviles;
	private AutomivilDAO automovilDAO;
	private File file = new File("data/informacion.dat");
	private Archivo archivo;
	
	public ConcesionarioDTO() {
		automoviles = new ArrayList<Automovil>();
		archivo = new Archivo(file);
		automovilDAO = new AutomivilDAO(archivo);
		automoviles = archivo.leerArchivo(file);
		
	}

	public ArrayList<Automovil> getAutomoviles() {
		return automoviles;
	}

	public void setAutomoviles(ArrayList<Automovil> automoviles) {
		this.automoviles = automoviles;
	}

	public AutomivilDAO getAutomovilDAO() {
		return automovilDAO;
	}

	public void setAutomovilDAO(AutomivilDAO automovilDAO) {
		this.automovilDAO = automovilDAO;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Archivo getArchivo() {
		return archivo;
	}

	public void setArchivo(Archivo archivo) {
		this.archivo = archivo;
	}
	
}
