package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class prueba2 extends JPanel {
	
	private JTextField txtPLaca1;
	private JTextField txtPlaca2;
	private JTextField txtCarac2;
	private JTextField txtCarac1;

	/**
	 * Create the panel.
	 */
	public prueba2() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Comparador de carros");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Kristen ITC", Font.BOLD, 33));
		lblTitulo.setBounds(33, 11, 439, 41);
		add(lblTitulo);
		
		JLabel lblPlaca1Auto = new JLabel("Ingrese la placa del primer automovil:");
		lblPlaca1Auto.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblPlaca1Auto.setBounds(10, 63, 439, 28);
		add(lblPlaca1Auto);
		
		txtPLaca1 = new JTextField();
		txtPLaca1.setBounds(33, 95, 132, 31);
		add(txtPLaca1);
		txtPLaca1.setColumns(10);
		
		JLabel lblPlaca2Auto = new JLabel("Ingrese la placa del segundo automovil:");
		lblPlaca2Auto.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblPlaca2Auto.setBounds(10, 137, 462, 26);
		add(lblPlaca2Auto);
		
		txtPlaca2 = new JTextField();
		txtPlaca2.setBounds(33, 170, 132, 31);
		add(txtPlaca2);
		txtPlaca2.setColumns(10);
		
		JLabel lblSelecComp2 = new JLabel("a comparar:");
		lblSelecComp2.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblSelecComp2.setBounds(33, 240, 207, 28);
		add(lblSelecComp2);
		
		txtCarac2 = new JTextField();
		txtCarac2.setBounds(278, 392, 132, 31);
		add(txtCarac2);
		txtCarac2.setColumns(10);
		
		JLabel lblSelecComp1 = new JLabel("Seleccione la caracteristica  a comparar:");
		lblSelecComp1.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblSelecComp1.setBounds(33, 212, 439, 30);
		add(lblSelecComp1);
		
		JComboBox tipoComp = new JComboBox();
		tipoComp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tipoComp.setMaximumRowCount(7);
		tipoComp.setBounds(33, 272, 207, 31);
		tipoComp.setModel(new DefaultComboBoxModel(new String[] {"Placa", "Modelo","Marca", "Año", "Puertas", "Capacidad", "Tipo",}));
		add(tipoComp);
		
		JButton btnComparar = new JButton("Comparar");
		btnComparar.setFont(new Font("Kristen ITC", Font.PLAIN, 19));
		btnComparar.setBounds(346, 262, 126, 41);
		add(btnComparar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Kristen ITC", Font.PLAIN, 17));
		btnVolver.setBounds(10, 445, 116, 31);
		add(btnVolver);
		
		JLabel lblAnio = new JLabel("\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013\u2013");
		lblAnio.setFont(new Font("Kristen ITC", Font.PLAIN, 24));
		lblAnio.setBounds(-1, 303, 505, 28);
		add(lblAnio);
		
		txtCarac1 = new JTextField();
		txtCarac1.setColumns(10);
		txtCarac1.setBounds(60, 392, 132, 31);
		add(txtCarac1);
		
		JLabel lblCaracteristicaDelPrimer = new JLabel("Caracteristica del ");
		lblCaracteristicaDelPrimer.setFont(new Font("Kristen ITC", Font.PLAIN, 19));
		lblCaracteristicaDelPrimer.setBounds(10, 340, 230, 26);
		add(lblCaracteristicaDelPrimer);
		
		JLabel lblPrimerAuto = new JLabel("Primer auto:");
		lblPrimerAuto.setFont(new Font("Kristen ITC", Font.PLAIN, 17));
		lblPrimerAuto.setBounds(60, 366, 116, 26);
		add(lblPrimerAuto);
		
		JLabel lblSegundoAuto = new JLabel("Segundo auto:");
		lblSegundoAuto.setFont(new Font("Kristen ITC", Font.PLAIN, 17));
		lblSegundoAuto.setBounds(278, 366, 143, 26);
		add(lblSegundoAuto);

	}
}
