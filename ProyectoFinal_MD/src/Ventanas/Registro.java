package Ventanas;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;

import Modelo.ConexionDB;
import Modelo.Jugador;
import Modelo.JugadorDB;
import javax.swing.JComboBox;

//CLASE Ventana Inicial
public class Registro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2815939040592627306L;
	// ATRIBUTOS
	public JPanel contentPane;
	public JTextField textFieldNOMBRE;
	public JTextField textFieldAPELLIDO1;
	public JTextField textFieldALIAS;
	public JTextField textFieldEDAD;
	private final JLabel lblJuegoMathDice = new JLabel("Juego MATH  DICE");
	public JTextArea textFieldCUADROTextoInferior;

	// Creo una etiqueta de referencia a un objeto tipo Inicio
	private Registro registro;
	// Permite acceso desde la ventana Inicio a la ventana Juego, pasándola como
	// referencia
	private FinestraP ventanaJugar;
	// Generamos un nuevo jugador
	private Jugador jugador;
	private JTextField textFieldPuntuacion;

	private List<Jugador> lst = new ArrayList();

	// Constructor Ventana de INICIO
	public Registro() {
		// Creo el DAO Jugador
		jugador = new Jugador();

		// Asocio referencia al objeto creado que es tipo Registro
		registro = this;

		// VENTANA
		setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 405);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Etiquetas (JLabel)
		lblJuegoMathDice.setBounds(155, 11, 152, 19);
		lblJuegoMathDice.setForeground(Color.BLUE);
		lblJuegoMathDice.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(lblJuegoMathDice);

		JLabel lblDatosDelJugador = new JLabel("Datos del Jugador (pulsar INTRO en cada campo)");
		lblDatosDelJugador.setBounds(61, 30, 342, 20);
		lblDatosDelJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelJugador.setBackground(Color.WHITE);
		lblDatosDelJugador.setForeground(Color.RED);
		lblDatosDelJugador.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblDatosDelJugador);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 136, 60, 20);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblNombre);

		JLabel lblApellido1 = new JLabel("1er Apellido:");
		lblApellido1.setBounds(10, 167, 71, 14);
		lblApellido1.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblApellido1);

		JLabel lblAlias = new JLabel("Alias:");
		lblAlias.setBounds(10, 195, 52, 14);
		lblAlias.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblAlias);

		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(202, 195, 46, 14);
		lblEdad.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(lblEdad);

		// Entradas (JTextFile)
		textFieldNOMBRE = new JTextField();
		textFieldNOMBRE.setBounds(61, 136, 187, 20);
		contentPane.add(textFieldNOMBRE);
		textFieldNOMBRE.setColumns(10);
		// Listener esperando INTRO
		textFieldNOMBRE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Si pulso Intro se muestra dato del Jugador
				jugador.setNombre(textFieldNOMBRE.getText());
			}
		});

		textFieldAPELLIDO1 = new JTextField();
		textFieldAPELLIDO1.setBounds(87, 164, 208, 20);
		contentPane.add(textFieldAPELLIDO1);
		textFieldAPELLIDO1.setColumns(10);
		// Listener esperando INTRO
		textFieldAPELLIDO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Si pulso Intro se muestra dato del Jugador
				jugador.setApellido1(textFieldAPELLIDO1.getText());
			}
		});

		textFieldALIAS = new JTextField();
		textFieldALIAS.setBounds(45, 192, 145, 20);
		contentPane.add(textFieldALIAS);
		textFieldALIAS.setColumns(10);
		// Listener esperando INTRO
		textFieldALIAS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Si pulso Intro se muestra dato del Jugador
				jugador.setAlias(textFieldALIAS.getText());
			}
		});

		textFieldEDAD = new JTextField();
		textFieldEDAD.setBounds(237, 193, 46, 20);
		contentPane.add(textFieldEDAD);
		textFieldEDAD.setColumns(10);
		// Listener esperando INTRO
		textFieldEDAD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Si pulso Intro se muestra dato del Jugador
				jugador.setEdad(textFieldEDAD.getText());
			}
		});

		// Botón A JUGAR
		JButton btnBotonJUGAR = new JButton("JUGAR");
		btnBotonJUGAR.setBounds(163, 238, 107, 31);
		btnBotonJUGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Cuando pulso el botón "A JUGAR" escribe mensaje en la caja de texto inferior
				// de la ventana
				boolean sinErrores = true;

				switch (jugador.verificar(jugador)) {
				case 1:
					textFieldCUADROTextoInferior.setText("Falta NOMBRE o pulsar Intro");
					break;
				case 2:
					textFieldCUADROTextoInferior.setText("Valor numérico en NOMBRE. Introducir texto");
					break;
				case 3:
					textFieldCUADROTextoInferior.setText("Falta 1er APELLIDO o pulsar Intro");
					break;
				case 4:
					textFieldCUADROTextoInferior.setText("Valor numérico en APELLIDO. Introducir texto");
					break;
				case 5:
					textFieldCUADROTextoInferior.setText("Falta ALIAS o pulsar Intro");
					break;
				case 6:
					textFieldCUADROTextoInferior.setText("Valor numérico en ALIAS. Introducir texto");
					break;
				case 7:
					textFieldCUADROTextoInferior.setText("Falta EDAD o pulsar Intro");
					break;
				case 8:
					textFieldCUADROTextoInferior.setText("EDAD no es un número");
					break;
				default:
					String texto = "Nuevo JUGADOR: " + jugador.getNombre() + " " + jugador.getApellido1() + " "
							+ "(alias: " + jugador.getAlias() + "- " + jugador.getEdad() + " años)";
					textFieldCUADROTextoInferior.setText(texto);

					// Conexión a BBDD
					ConexionDB conDB = new ConexionDB("localhost", "matdice", "root", "root");

					if (conDB.connectDB()) {

						texto = texto + System.getProperty("line.separator") + "Conectado con éxito a la BBDD";
						textFieldCUADROTextoInferior.setText(texto);

						// Creación de Objeto Jugador BBDD
						JugadorDB jugadorDB = new JugadorDB(jugador, conDB.getConnection());

						if (jugadorDB.buscarJugador()) {
							texto = texto + System.getProperty("line.separator") + "Jugador ya existe";
							textFieldCUADROTextoInferior.setText(texto);

						} else {
							// Dejar en blanco putuación
							jugador.setPuntuacion(0);

							// Insertar Jugador en BBDD
							int result = jugadorDB.insertarJugador();
							if (result > 0) {
								texto = texto + System.getProperty("line.separator")
										+ "Registrado con éxito con el número:" + String.valueOf(result);
								textFieldCUADROTextoInferior.setText(texto);

							}
						}

						ventanaJugar = new FinestraP(jugador);

						// Habilitar menu juego
						ventanaJugar.habilitarJuego();
						// Abro Jugar
						ventanaJugar.setVisible(true);
						// Cierro Registro
						// registro.setVisible(false);

					}
					break;
				}

			}
		});

		btnBotonJUGAR.setForeground(new Color(199, 21, 133));
		btnBotonJUGAR.setFont(new Font("Arial", Font.BOLD, 16));
		contentPane.add(btnBotonJUGAR);

		textFieldCUADROTextoInferior = new JTextArea();
		textFieldCUADROTextoInferior.setBounds(10, 280, 428, 75);
		contentPane.add(textFieldCUADROTextoInferior);
		textFieldCUADROTextoInferior.setColumns(10);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 83, 406, 20);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jugador = (Jugador) lst.get(comboBox.getSelectedIndex());
				textFieldAPELLIDO1.setText(jugador.getApellido1());
				textFieldNOMBRE.setText(jugador.getNombre());
				textFieldALIAS.setText(jugador.getAlias());
				textFieldEDAD.setText(jugador.getEdad());
				textFieldPuntuacion.setText(String.valueOf(jugador.getPuntuacion()));

			}
		});
		contentPane.add(comboBox);

		// Botón BUSCAR
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// Conexión a BBDD
				ConexionDB conDB = new ConexionDB("localhost", "matdice", "root", "root");

				if (conDB.connectDB()) {

					String texto = "Conectado con éxito a la BBDD";
					textFieldCUADROTextoInferior.setText(texto);

					// Creación de Objeto Jugador BBDD
					JugadorDB jugadorDB = new JugadorDB(jugador, conDB.getConnection());

					// Recupero de la BBDD jugadores que coinciden con busqueda
					lst.clear();
					lst = jugadorDB.buscarJugadores();

					// Cargar COMBO con datos de los jugadores recuperados
					comboBox.removeAll();
					
					Iterator<Jugador> iterator = lst.iterator();
					while (iterator.hasNext()) {
						Jugador j = (Jugador) iterator.next();
						String s = j.getApellido1() + ", " + j.getNombre();
						comboBox.addItem(s);
					}

					// texto = texto + System.getProperty("line.separator") + "Registrado con éxito
					// con el número:"
					// + String.valueOf(result);
					// textFieldCUADROTextoInferior.setText(texto);

				}

			}
		});
		btnBuscar.setForeground(new Color(199, 21, 133));
		btnBuscar.setFont(new Font("Arial", Font.BOLD, 16));
		btnBuscar.setBounds(31, 238, 107, 31);
		contentPane.add(btnBuscar);

		JLabel lblPuntuacion = new JLabel("Puntuacion:");
		lblPuntuacion.setFont(new Font("Arial", Font.BOLD, 12));
		lblPuntuacion.setBounds(292, 195, 86, 14);
		contentPane.add(lblPuntuacion);

		textFieldPuntuacion = new JTextField();
		textFieldPuntuacion.setEditable(false);
		textFieldPuntuacion.setColumns(10);
		textFieldPuntuacion.setBounds(361, 193, 46, 20);
		contentPane.add(textFieldPuntuacion);

		// Botón REGISTRO
		JButton btnRegistro = new JButton("REGISTRO");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Botón REGISTRO - Acción registrar
				switch (jugador.verificar(jugador)) {
				case 1:
					textFieldCUADROTextoInferior.setText("Falta NOMBRE o pulsar Intro");
					break;
				case 2:
					textFieldCUADROTextoInferior.setText("Valor numérico en NOMBRE. Introducir texto");
					break;
				case 3:
					textFieldCUADROTextoInferior.setText("Falta 1er APELLIDO o pulsar Intro");
					break;
				case 4:
					textFieldCUADROTextoInferior.setText("Valor numérico en APELLIDO. Introducir texto");
					break;
				case 5:
					textFieldCUADROTextoInferior.setText("Falta ALIAS o pulsar Intro");
					break;
				case 6:
					textFieldCUADROTextoInferior.setText("Valor numérico en ALIAS. Introducir texto");
					break;
				case 7:
					textFieldCUADROTextoInferior.setText("Falta EDAD o pulsar Intro");
					break;
				case 8:
					textFieldCUADROTextoInferior.setText("EDAD no es un número");
					break;
				default:
					
					String texto = "Nuevo JUGADOR: " + jugador.getNombre() + " " + jugador.getApellido1() + " "
							+ "(alias: " + jugador.getAlias() + "- " + jugador.getEdad() + " años)";
					textFieldCUADROTextoInferior.setText(texto);

					// Conexión a BBDD
					ConexionDB conDB = new ConexionDB("localhost", "matdice", "root", "root");

					if (conDB.connectDB()) {

						texto = "Conectado con éxito a la BBDD";
						textFieldCUADROTextoInferior.setText(texto);

						// Creación de Objeto Jugador BBDD
						JugadorDB jugadorDB = new JugadorDB(jugador, conDB.getConnection());

						if (jugadorDB.buscarJugador()) {
							texto = texto + System.getProperty("line.separator") + "Jugador ya existe";
							textFieldCUADROTextoInferior.setText(texto);

						} else {
							// Dejar en blanco putuación
							jugador.setPuntuacion(0);

							// Insertar Jugador en BBDD
							int result = jugadorDB.insertarJugador();
							if (result > 0) {
								texto = texto + System.getProperty("line.separator")
										+ "Registrado con éxito con el número:" + String.valueOf(result);
								jugador.setId(result);
								textFieldCUADROTextoInferior.setText(texto);
								
								// Agrego el nuevo jugador al COMBO
								lst.add(jugador);
								String s = jugador.getApellido1() + ", " + jugador.getNombre();
								comboBox.addItem(s);

							}
						}
					}
				}
			}
		});
		btnRegistro.setForeground(new Color(199, 21, 133));
		btnRegistro.setFont(new Font("Arial", Font.BOLD, 16));
		btnRegistro.setBounds(296, 238, 124, 31);
		contentPane.add(btnRegistro);

	}
}
