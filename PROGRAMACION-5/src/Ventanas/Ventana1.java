package Ventanas;

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
import Juego.Jugador;
import Ventanas.Ventana1;


//CLASE Ventana Inicial
public class Ventana1 extends JFrame {

	//ATRIBUTOS
	private JPanel contentPane;
	private JTextField textFieldNOMBRE;
	private JTextField textFieldAPELLIDO1;
	private JTextField textFieldALIAS;
	private JTextField textFieldEDAD;
	private final JLabel lblJuegoMathDice = new JLabel("Juego MATH  DICE");
	private JTextField textFieldCUADROTextoInferior;
	

	//Creo una etiqueta de referencia a un objeto tipo Inicio
    private Ventana1 referencia;
    //Permite acceso desde la ventana Inicio a la ventana Juego, pasándola como referencia
    private Ventana2 ventanaJuego;
    //Generamos un nuevo jugador
    private Jugador j=new Jugador();

    

    //Constructor Ventana de INICIO
    public Ventana1(Ventana2 FJ) {
    	
    	// Asocio referencia al objeto creado que es tipo Inicio
        referencia=this;
        //La etiqueta ventana_Juego se asocia al input de Login. Se hace visible a toda la clase
        ventanaJuego=FJ;
        //Este truquillo garantiza que al pulsar el botón "A JUGAR" pueda manipular todas las ventanas
        
        //Inicializo Objeto
        j.setNombre("");
        j.setApellido1("");
        j.setAlias("");
        j.setEdad(999);
        

        //VENTANA
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
		
		JLabel lblDatosDelJugador = new JLabel("Datos del Jugador (pulsar INTRO en cada campo)");
		lblDatosDelJugador.setBounds(61, 30, 342, 20);
		lblDatosDelJugador.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelJugador.setBackground(Color.WHITE);
		lblDatosDelJugador.setForeground(Color.RED);
		lblDatosDelJugador.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblDatosDelJugador);
			
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

		
		//Entradas (JTextFile)
		textFieldNOMBRE = new JTextField();
		textFieldNOMBRE.setBounds(61, 57, 187, 20);
		contentPane.add(textFieldNOMBRE);
		textFieldNOMBRE.setColumns(10);
		//Listener esperando INTRO
		textFieldNOMBRE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Si pulso Intro se muestra dato del Jugador
				j.setNombre(textFieldNOMBRE.getText());
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
						j.setApellido1(textFieldAPELLIDO1.getText());
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
				j.setAlias(textFieldALIAS.getText());
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
				if (j.esNumero(textFieldEDAD.getText())==true)
					j.setEdad(Integer.parseInt(textFieldEDAD.getText()));
				else
					j.setEdad(999);
			}
		});
		
		//Botón A JUGAR
		JButton btnBotonJUGAR = new JButton("A  JUGAR");
		btnBotonJUGAR.setBounds(121, 172, 221, 31);
		btnBotonJUGAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0 ) {
				//Cuando pulso el botón "A JUGAR" escribe mensaje en la caja de texto inferior de la ventana
				if (j.getEdad()==999)
					textFieldCUADROTextoInferior.setText("EDAD incorrecta o ausente. Pulsar Intro");
				else if (j.espaciosBlanco(j.getNombre()))
					textFieldCUADROTextoInferior.setText("Falta NOMBRE o pulsar Intro");
				else if (j.espaciosBlanco(j.getApellido1()))
					textFieldCUADROTextoInferior.setText("Falta 1er APELLIDO o pulsar Intro");
				else if (j.espaciosBlanco(j.getAlias()))
					textFieldCUADROTextoInferior.setText("Falta ALIAS o pulsar Intro");
				else
					textFieldCUADROTextoInferior.setText("Nuevo JUGADOR: "+j.getNombre()+" "+j.getApellido1()+"  "+"(alias: "+j.getAlias()+"- "+j.getEdad()+" años)");
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
		j.setNombre(textFieldNOMBRE.getText());
		ventanaJuego.setJugador(j);
		ventanaJuego.setVisible(true);
		//Cierre de la ventana INICIO
		referencia.setVisible(false);

	}

}
