package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VistaPrincipal extends JFrame {
	
	private Menu pMenu;
	private ViewRegistrar pViewRegistrar;
	private ViewComparar pViewComparar;
	
	public VistaPrincipal() {
		
		setTitle("Comparador de carros");
		setBounds(100, 100, 504, 512);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		inicializar();
		
	}
	
	public void inicializar() {
		
		pMenu = new Menu();
		pMenu.setBounds(0,0,504, 487);
		pMenu.setBackground(new Color(50, 80, 150));
		pMenu.setVisible(true);
		getContentPane().add(pMenu);
		
		pViewRegistrar = new ViewRegistrar();
		pViewRegistrar.setBounds(0,0,504, 487);
		pViewRegistrar.setBackground(new Color(50, 100, 100));
		pViewRegistrar.setVisible(false);
		getContentPane().add(pViewRegistrar);
		
		pViewComparar = new ViewComparar();
		pViewComparar.setBounds(0,0,504, 487);
		pViewComparar.setBackground(new Color(100, 40, 150));
		pViewComparar.setVisible(false);
		getContentPane().add(pViewComparar);
		
	}

	public Menu getpMenu() {
		return pMenu;
	}

	public void setpMenu(Menu pMenu) {
		this.pMenu = pMenu;
	}

	public ViewRegistrar getpViewRegistrar() {
		return pViewRegistrar;
	}

	public void setpViewRegistrar(ViewRegistrar pViewRegistrar) {
		this.pViewRegistrar = pViewRegistrar;
	}

	public ViewComparar getpViewComparar() {
		return pViewComparar;
	}

	public void setpViewComparar(ViewComparar pViewComparar) {
		this.pViewComparar = pViewComparar;
	}
}
