package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba window = new prueba();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Comparaci\u00F3n de automoviles");
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setFont(new Font("Kristen ITC", Font.PLAIN, 33));
		lblTitulo.setBounds(10, 105, 465, 63);
		frame.getContentPane().add(lblTitulo);
		
		JButton btnRegistrar = new JButton("Agregar un automovil nuevo");
		btnRegistrar.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnRegistrar.setBounds(121, 179, 230, 41);
		frame.getContentPane().add(btnRegistrar);
		
		JButton btnComparar = new JButton("Comparar carros");
		btnComparar.setFont(new Font("Kristen ITC", Font.PLAIN, 13));
		btnComparar.setBounds(163, 231, 150, 41);
		frame.getContentPane().add(btnComparar);
	}
}
