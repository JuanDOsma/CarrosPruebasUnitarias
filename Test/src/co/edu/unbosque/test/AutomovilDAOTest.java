package co.edu.unbosque.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.unbosque.model.Automovil;
import co.edu.unbosque.model.persistence.Archivo;
import co.edu.unbosque.model.persistence.AutomivilDAO;
import junit.framework.TestCase;

public class AutomovilDAOTest extends TestCase {
	
	AutomivilDAO automovil;
	Archivo archivo;
	File file = new File("dataTest/informacionTest.dat");
	ArrayList<Automovil> lista;
	Automovil automovil_1;
	Automovil automovil_2;
	Automovil automovil_3;
	Automovil automovil_4;
	
	private void setupEscenario() {
		file.delete();
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		archivo = new Archivo(file);
		lista = archivo.leerArchivo(file);
		System.out.println(lista.size());
		automovil = new AutomivilDAO(archivo);
		
		automovil_1 = new Automovil("ABC123", "nombrePrueba1", "Nissan", "2000", "4", "6", "Carrp");
		automovil_2 = new Automovil("BGN432", "nombrePrueba2", "Toyota", "2020", "5", "6", "Carro");
		automovil_3 = new Automovil("DMG930", "nombrePrueba3", "Chevrolet", "2015", "4", "4", "Camioneta");
		automovil_4 = new Automovil("BGN432", "nombrePrueba4", "BMW", "2018", "4", "5", "Camioneta");
		
		lista.add(automovil_1);
		lista.add(automovil_2);		
	}
	
	public void testAutomovilDAO() {
		setupEscenario();
		
		assertEquals("La cantidad de automoviles debe ser 2", 2, lista.size());
	}
	
	public void testAgregarAutomovil() {
		setupEscenario();
		
		assertTrue("Se debió agregar el automovil", 
				   automovil.agregarAutomovil(automovil_3.getMarca(), 
						   					  automovil_3.getModelo(), 
						   					  automovil_3.getAnio(), 
						   					  automovil_3.getPlaca(), 
						   					  automovil_3.getPuertas(), 
						   					  automovil_3.getCapacidad(), 
						   					  automovil_3.getTipo(), 
						   					  lista,
						   					  file));
		
		assertFalse("No se debería un automovil ya existente",
					automovil.agregarAutomovil(automovil_4.getMarca(), 
						   					   automovil_4.getModelo(), 
						   					   automovil_4.getAnio(), 
						   					   automovil_4.getPlaca(), 
						   					   automovil_4.getPuertas(), 
						   					   automovil_4.getCapacidad(), 
						   					   automovil_4.getTipo(), 
						   					   lista,
						   					   file));
	}
	
	public void testBuscarAutomovil() {
		setupEscenario();
		
		assertNotNull("Debió encontrarse el automovil", 
					  automovil.buscarAutomovil(automovil_1.getPlaca(), 
				    		  					lista).getPlaca());
		
		assertNull("No debió encontrar un automovil con placa no existente en el sistema",
				   automovil.buscarAutomovil("ANL199", 
						   					 lista));
	}
	
	public void testEliminarAutomovil(){
		assertTrue("Se debió eliminar el automovil",
				   automovil.eliminarAutomovil(automovil_1.getPlaca(), 
						   					   lista, 
						   					   file));
		
		assertFalse("No se debió eliminar el automovil, ya que el automovil ingresado no existe", 
					automovil.eliminarAutomovil("ANL199", 
												lista, 
												file));
	}
}
