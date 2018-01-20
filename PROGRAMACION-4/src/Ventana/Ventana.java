package Ventana;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Jugador.Jugador;


//CLASE Ventana, es la clase Principal - Punto de arranque del programa
public class Ventana extends JFrame {

	//ATRIBUTOS
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNOMBRE;
	private JTextField textFieldAPELLIDO1;
	private JTextField textFieldALIAS;
	private JTextField textFieldPUNTUACION;
	private JTextField textFieldEDAD;
	private final JLabel lblJuegoMathDice = new JLabel("Juego MATH  DICE");
	private JTextField textFieldCUADROTextoInferior;
	private Jugador player1;
	private JTextField textFieldNumJUGADOR;
	

	//Launch the application.
	//Método MAIN, por ser la Clase Principal
	public static void main(String[] args) {
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

	//Create the frame.
	public Ventana() {
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 326);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Etiquetas (JLabel)
		lblJuegoMathDice.setBounds(155, 11, 152, 19);
		lblJuegoMathDice.setForeground(Color.BLUE);
		lblJuegoMathDice.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(lblJuegoMathDice);
		
		JLabel lblDatosDelJugadr = new JLabel("Datos del Jugador (pulsar INTRO en cada campo)");
		lblDatosDelJugadr.setBounds(61, 30, 342, 20);
		lblDatosDelJugadr.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelJugadr.setBackground(Color.WHITE);
		lblDatosDelJugadr.setForeground(Color.RED);
		lblDatosDelJugadr.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblDatosDelJugadr);
			
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 57, 60, 20);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNombre);
		
		JLabel lblApellido1 = new JLabel("1er Apellido:");
		lblApellido1.setBounds(10, 88, 71, 14);
		lblApellido1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblApellido1);
		
		JLabel lblAlias = new JLabel("Alias:");
		lblAlias.setBounds(10, 116, 52, 14);
		lblAlias.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblAlias);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(224, 116, 46, 14);
		lblEdad.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblEdad);
		
		JLabel lblNumJugador = new JLabel("Num. Jugador:");
		lblNumJugador.setBounds(10, 144, 94, 14);
		lblNumJugador.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNumJugador);
		
		JLabel lblPuntuacion = new JLabel("Puntuacion:");
		lblPuntuacion.setBounds(224, 144, 71, 14);
		lblPuntuacion.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblPuntuacion);
		
		//JTextFile
		textFieldNOMBRE = new JTextField();
		textFieldNOMBRE.setBounds(61, 57, 187, 20);
		contentPane.add(textFieldNOMBRE);
		textFieldNOMBRE.setColumns(10);
		//Listener esperando INTRO
		textFieldNOMBRE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Si pulso Intro se muestra dato del Jugador
				player1.setNombre(textFieldNOMBRE.getText());
			}
		});
		
		textFieldAPELLIDO1 = new JTextField();
		textFieldAPELLIDO1.setBounds(87, 85, 208, 20);
		contentPane.add(textFieldAPELLIDO1);
		textFieldAPELLIDO1.setColumns(10);
		//Listener esperando INTRO
				textFieldAPELLIDO1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					//Si pulso Intro se muestra dato del Jugador
						player1.setApellido1(textFieldAPELLIDO1.getText());
					}
				});
		
		textFieldALIAS = new JTextField();
		textFieldALIAS.setBounds(45, 113, 145, 20);
		contentPane.add(textFieldALIAS);
		textFieldALIAS.setColumns(10);
		//Listener esperando INTRO
			textFieldALIAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Si pulso Intro se muestra dato del Jugador
				player1.setAlias(textFieldALIAS.getText());
					}
				});
		
		textFieldEDAD = new JTextField();
		textFieldEDAD.setBounds(261, 113, 46, 20);
		contentPane.add(textFieldEDAD);
		textFieldEDAD.setColumns(10);
		//Listener esperando INTRO
		textFieldEDAD.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			//Si pulso Intro se muestra dato del Jugador y verifico si es un dato numérico
				if (player1.esNumero(textFieldEDAD.getText())==true)
					player1.setEdad(Integer.parseInt(textFieldEDAD.getText()));
				else
					player1.setEdad(999);
			}
		});
		
		textFieldNumJUGADOR = new JTextField();
		textFieldNumJUGADOR.setBounds(102, 142, 86, 20);
		textFieldNumJUGADOR.setColumns(10);
		contentPane.add(textFieldNumJUGADOR);
		
		textFieldPUNTUACION = new JTextField();
		textFieldPUNTUACION.setBounds(300, 141, 86, 20);
		contentPane.add(textFieldPUNTUACION);
		textFieldPUNTUACION.setColumns(10);
		
		JButton btnBotonJUGAR = new JButton("A  JUGAR");
		btnBotonJUGAR.setBounds(121, 172, 221, 31);
		btnBotonJUGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0 ) {
				//Cuando pulso el botón "A JUGAR" escribe mensaje en la caja de texto inferior de la ventana
				if (player1.getEdad()==999)
					textFieldCUADROTextoInferior.setText("EDAD incorrecta o ausente. Pulsar Intro");
				else if (player1.espaciosBlanco(player1.getNombre()))
					textFieldCUADROTextoInferior.setText("Falta NOMBRE o pulsar Intro");
				else if (player1.espaciosBlanco(player1.getApellido1()))
					textFieldCUADROTextoInferior.setText("Falta 1er APELLIDO o pulsar Intro");
				else if (player1.espaciosBlanco(player1.getAlias()))
					textFieldCUADROTextoInferior.setText("Falta ALIAS o pulsar Intro");
				else
					textFieldCUADROTextoInferior.setText("Nuevo JUGADOR: "+player1.getNombre()+" "+player1.getApellido1()+"  "+"(alias: "+player1.getAlias()+"- "+player1.getEdad()+" años)");
				}
			});
		
		btnBotonJUGAR.setForeground(new Color(199, 21, 133));
		btnBotonJUGAR.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.add(btnBotonJUGAR);
		
		textFieldCUADROTextoInferior = new JTextField();
		textFieldCUADROTextoInferior.setBounds(10, 201, 428, 75);
		contentPane.add(textFieldCUADROTextoInferior);
		textFieldCUADROTextoInferior.setColumns(10);
				
		//Crea un jugador nuevo
		player1 = new Jugador();
		
		//Asignamos datos al jugador
		player1.setNombre(textFieldNOMBRE.getText());
		player1.setApellido1(textFieldAPELLIDO1.getText());		

	}
}
