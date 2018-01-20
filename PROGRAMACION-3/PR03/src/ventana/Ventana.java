package ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

// CLASE Ventana es la clase Principal - Punto de arranque del programa
public class Ventana extends JFrame {

	// ATRIBUTOS
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final JLabel lblJuegoMathDice = new JLabel("Juego MATH  DICE");

	/**
	 * Launch the application.
	 */
	// Método MAIN por ser la Clase Principal
	public static void main(String[] args) {

	//Crea un jugador nuevo
	Jugador player1=new Jugador();
	player1.setNombre("Joan");
	player1.setApellidos("de Monserrat i Vallvè");
	player1.setAlias("Tite");
	player1.setEdad("55");
	player1.setNumJugador("0001");
	player1.setPuntuacion("000000");

	System.out.pintln(player1.toString());

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 326);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(5, 33, 60, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Arial", Font.BOLD, 12));
		lblApellidos.setBounds(5, 60, 71, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblAlias = new JLabel("Alias:");
		lblAlias.setFont(new Font("Arial", Font.BOLD, 12));
		lblAlias.setBounds(5, 88, 52, 14);
		contentPane.add(lblAlias);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Arial", Font.BOLD, 12));
		lblEdad.setBounds(219, 88, 46, 14);
		contentPane.add(lblEdad);
		
		JLabel lblPuntuacin = new JLabel("Puntuaci\u00F3n:");
		lblPuntuacin.setFont(new Font("Arial", Font.BOLD, 12));
		lblPuntuacin.setBounds(5, 116, 71, 14);
		contentPane.add(lblPuntuacin);
		
		textField = new JTextField();
		textField.setBounds(56, 33, 187, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 57, 372, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(40, 85, 145, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(81, 113, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(256, 85, 46, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		lblJuegoMathDice.setForeground(Color.BLUE);
		lblJuegoMathDice.setFont(new Font("Verdana", Font.BOLD, 14));
		lblJuegoMathDice.setBounds(150, 0, 152, 31);
		contentPane.add(lblJuegoMathDice);

	}
}
