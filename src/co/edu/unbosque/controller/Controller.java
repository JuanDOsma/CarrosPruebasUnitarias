package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Automovil;
import co.edu.unbosque.model.ConcesionarioDTO;
import co.edu.unbosque.view.VistaPrincipal;

public class Controller implements ActionListener {

	public VistaPrincipal vista;
	public ConcesionarioDTO inscripcion;

	public Controller() throws Exception {
		iniciarAplicacion();
		inscripcion = new ConcesionarioDTO();
	}

	public void iniciarAplicacion() {
		vista = new VistaPrincipal();
		vista.setVisible(true); 
		vista.getpMenu().getBtnRegistrar().addActionListener(this);
		vista.getpViewRegistrar().getBtnVolver().addActionListener(this);
		vista.getpMenu().getBtnComparar().addActionListener(this);
		vista.getpViewRegistrar().getBtnRegistrar().addActionListener(this);
		vista.getpViewComparar().getBtnVolver().addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Agregar un automovil nuevo")) {
			vista.getpMenu().setVisible(false);
			vista.getpViewRegistrar().setVisible(true);
		}

		if (e.getActionCommand().equals("Comparar automoviles")) {
			vista.getpMenu().setVisible(false);
			vista.getpViewComparar().setVisible(true);
		}

		if (e.getActionCommand().equals("Volver")) {
			vista.getpViewRegistrar().setVisible(false);
			vista.getpMenu().setVisible(true);
		}
		
		if (e.getActionCommand().equals("Volver")) {
			vista.getpViewComparar().setVisible(false);
			vista.getpMenu().setVisible(true);
		}

		if (e.getActionCommand().equals("registrar")) {
			vista.getpViewRegistrar().setVisible(true);
			String placa = vista.getpViewRegistrar().getTxtPLaca().getText();
			String modelo = vista.getpViewRegistrar().getTxtModelo().getText();
			String marca = vista.getpViewRegistrar().getTxtMarca().getText();
			String capacidad = vista.getpViewRegistrar().getTxtCapacidad().getText();
			String puertas = vista.getpViewRegistrar().getTxtNumPuertas().getText();
			String tipo = vista.getpViewRegistrar().getTipo().getSelectedItem().toString();
			String anio = vista.getpViewRegistrar().getTxtAnio().getText();
			if (placa == null || modelo == null || marca == null || capacidad == null || puertas == null || tipo == null || anio == null ) {
				JOptionPane.showMessageDialog(null,
						"Error: Todos los campos son obligatorios, no se registro el ciudadano");
			} else {
				boolean res = inscripcion.getAutomovilDAO().agregarAutomovil(placa, modelo, marca, anio, puertas, capacidad, tipo, inscripcion.getAutomoviles(),inscripcion.getFile());
				if (res) {
					JOptionPane.showMessageDialog(null, "El automovil se registro correctamente");
					limpiar();
				} else {
					JOptionPane.showMessageDialog(null, "Error: El automovil ya existe");
				}
			}
			} 
		}
	
		public void limpiar(){
			vista.getpViewRegistrar().getTxtPLaca().setText("");
			vista.getpViewRegistrar().getTxtModelo().setText(""); 
			vista.getpViewRegistrar().getTxtMarca().setText("");
			vista.getpViewRegistrar().getTxtCapacidad().setText("");
			vista.getpViewRegistrar().getTxtNumPuertas().setText("");
			vista.getpViewRegistrar().getTxtNumPuertas().setText("");
			vista.getpViewRegistrar().getTipo().setSelectedItem(null);
			vista.getpViewRegistrar().getTxtAnio().setText("");
				
		}
}

