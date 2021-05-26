package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ViewRegistrar extends JPanel{
	
	private JTextField txtPLaca;
	private JTextField txtModelo;
	private JTextField txtMarca;
	private JTextField txtCapacidad;
	private JTextField txtNumPuertas;
	private JComboBox tipo;
	private JTextField txtAnio;
	private JButton btnRegistrar;
	private JButton btnVolver;
	
	public ViewRegistrar() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Datos del automovil:");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Kristen ITC", Font.BOLD, 33));
		lblTitulo.setBounds(33, 11, 402, 41);
		add(lblTitulo);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setForeground(Color.BLACK);
		lblPlaca.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblPlaca.setBounds(33, 62, 86, 28);
		add(lblPlaca);
		
		txtPLaca = new JTextField();
		txtPLaca.setBounds(33, 95, 132, 31);
		add(txtPLaca);
		txtPLaca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblModelo.setBounds(33, 139, 116, 26);
		add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(33, 170, 132, 31);
		add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setForeground(Color.BLACK);
		lblMarca.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblMarca.setBounds(33, 210, 102, 28);
		add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(33, 245, 132, 31);
		add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setForeground(Color.BLACK);
		lblCapacidad.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblCapacidad.setBounds(185, 137, 231, 31);
		add(lblCapacidad);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setBounds(185, 170, 132, 31);
		add(txtCapacidad);
		txtCapacidad.setColumns(10);
		
		JLabel lblNumeroDePuertas = new JLabel("Numero de puertas:");
		lblNumeroDePuertas.setForeground(Color.BLACK);
		lblNumeroDePuertas.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblNumeroDePuertas.setBounds(185, 63, 250, 26);
		add(lblNumeroDePuertas);
		
		txtNumPuertas = new JTextField();
		txtNumPuertas.setBounds(186, 95, 132, 31);
		add(txtNumPuertas);
		txtNumPuertas.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblTipo.setBounds(185, 209, 231, 30);
		add(lblTipo);
		
		tipo = new JComboBox();
		tipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tipo.setMaximumRowCount(3);
		tipo.setBounds(186, 245, 132, 31);
		tipo.setModel(new DefaultComboBoxModel(new String[] {"Carro", "Camioneta","SUV",}));
		add(tipo);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Kristen ITC", Font.PLAIN, 17));
		btnRegistrar.setBounds(374, 317, 116, 31);
		add(btnRegistrar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Kristen ITC", Font.PLAIN, 17));
		btnVolver.setBounds(10, 445, 116, 31);
		add(btnVolver);
		
		JLabel lblAnio = new JLabel("A\u00F1o:");
		lblAnio.setForeground(Color.BLACK);
		lblAnio.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblAnio.setBounds(33, 287, 102, 28);
		add(lblAnio);
		
		txtAnio = new JTextField();
		txtAnio.setColumns(10);
		txtAnio.setBounds(33, 316, 132, 31);
		add(txtAnio);
	}

	public JComboBox<?> getTipo() {
		return tipo;
	}

	public void setTipo(JComboBox<?> tipo) {
		this.tipo = tipo;
	}

	public JTextField getTxtAnio() {
		return txtAnio;
	}

	public void setTxtAnio(JTextField txtAnio) {
		this.txtAnio = txtAnio;
	}

	public JTextField getTxtPLaca() {
		return txtPLaca;
	}

	public void setTxtPLaca(JTextField txtPLaca) {
		this.txtPLaca = txtPLaca;
	}

	public JTextField getTxtModelo() {
		return txtModelo;
	}

	public void setTxtModelo(JTextField txtModelo) {
		this.txtModelo = txtModelo;
	}

	public JTextField getTxtMarca() {
		return txtMarca;
	}

	public void setTxtMarca(JTextField txtMarca) {
		this.txtMarca = txtMarca;
	}

	public JTextField getTxtCapacidad() {
		return txtCapacidad;
	}

	public void setTxtCapacidad(JTextField txtCapacidad) {
		this.txtCapacidad = txtCapacidad;
	}

	public JTextField getTxtNumPuertas() {
		return txtNumPuertas;
	}

	public void setTxtNumPuertas(JTextField txtNumPuertas) {
		this.txtNumPuertas = txtNumPuertas;
	}

	public JButton getBtnRegistrar() {
		return btnRegistrar;
	}

	public void setBtnRegistrar(JButton btnRegistrar) {
		this.btnRegistrar = btnRegistrar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
}
