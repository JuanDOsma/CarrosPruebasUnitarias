package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JPanel {
	
	private JLabel lblTitulo;
	private JButton btnComparar;
	private JButton btnRegistrar;
	
	public Menu() {
		setLayout(null);
		
		lblTitulo = new JLabel("Comparaci\u00F3n de automoviles");
		lblTitulo.setFont(new Font("Kristen ITC", Font.PLAIN, 33));
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setBounds(10, 105, 465, 63);
		add(lblTitulo);
		
		btnRegistrar = new JButton("Agregar un automovil nuevo");
		btnRegistrar.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnRegistrar.setBounds(121, 179, 230, 41);
		add(btnRegistrar);
		
		btnComparar = new JButton("Comparar automoviles");
		btnComparar.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnComparar.setBounds(140, 231, 200, 41);
		add(btnComparar);
		
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public void setLblTitulo(JLabel lblTitulo) {
		this.lblTitulo = lblTitulo;
	}

	public JButton getBtnComparar() {
		return btnComparar;
	}

	public void setBtnComparar(JButton btnComparar) {
		this.btnComparar = btnComparar;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}
}
