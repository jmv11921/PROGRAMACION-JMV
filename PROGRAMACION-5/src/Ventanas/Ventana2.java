package Ventanas;

import Juego.Jugador;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class Ventana2 extends JFrame {

	private JPanel contentPane;  
	private Jugador j;
	private JLabel lblNewLabel;


	//Constructor
	public Ventana2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 23, 403, 32);
		contentPane.add(lblNewLabel);
	}


	// Setter
	public void setJugador(Jugador j) {
		this.j=j;
	    lblNewLabel.setText("Bienvenido "+j.getNombre()+" al juego");
	 }
}