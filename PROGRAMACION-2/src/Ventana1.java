import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JLabel EtiquetaNom;
	private JTextField CajaNom;
	private JLabel EtiquetaCognoms;
	private JTextField CajaCognoms;
	private JLabel EtiquetaEdat;
	private JTextField CajaEdat;
	private JLabel EtiquetaCorreuemail;
	private JTextField CajaCorreu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public Ventana1() {
		String nom = new String ("Joan");
		String cognoms = new String ("de Monserrat i Vallv\u00E8");
		String edat = new String ("55");
		String correu = new String ("joandemonserrat@gmail.com");
		
		//Genera Ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//Configuracion contenedor
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiqueta Nom
		JLabel EtiquetaNom = new JLabel("Nom");
		EtiquetaNom.setBounds(10, 8, 46, 14);
		contentPane.add(EtiquetaNom);
		
		//Caja Nom
		CajaNom = new JTextField();
		CajaNom.setBounds(10, 27, 189, 20);
		contentPane.add(CajaNom);
		CajaNom.setColumns(10);
		CajaNom.setText(nom);

		//Etiqueta Cognom
		JLabel EtiquetaCognoms = new JLabel("Cognoms");
		EtiquetaCognoms.setBounds(10, 68, 56, 14);
		contentPane.add(EtiquetaCognoms);
		
		//CajaCognoms
		CajaCognoms = new JTextField();
		CajaCognoms.setBounds(10, 87, 189, 20);
		contentPane.add(CajaCognoms);
		CajaCognoms.setColumns(10);
		CajaCognoms.setText(cognoms);
		
		//Etiqueta Edat
		JLabel EtiquetaEdat = new JLabel("Edat");
		EtiquetaEdat.setBounds(10, 131, 46, 14);
		contentPane.add(EtiquetaEdat);
		
		//Caja Edat
		CajaEdat = new JTextField();
		CajaEdat.setBounds(10, 150, 189, 20);
		contentPane.add(CajaEdat);
		CajaEdat.setColumns(10);
		CajaEdat.setText(edat);
	
		//Etiqueta Correu
		JLabel EtiquetaCorreuemail = new JLabel("Correu (email)");
		EtiquetaCorreuemail.setBounds(10, 195, 87, 14);
		contentPane.add(EtiquetaCorreuemail);
		
		//Caja Correu
		CajaCorreu = new JTextField();
		CajaCorreu.setBounds(10, 214, 189, 20);
		contentPane.add(CajaCorreu);
		CajaCorreu.setColumns(10);
		CajaCorreu.setText(correu);

	} 
}
