package Ventanas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//import java.util.Random;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Juego.Jugador;

public class Jugar extends JFrame {

	//Atributos
	
	private static final long serialVersionUID = -6310463239070997486L;
	private JPanel contentPane;
	private JLabel dado1,dado2,dado3;
	private JLabel dado4,dado5;
	private JLabel dado6;
	private JLabel JLabel_Saludo;
	private JTextField JtextField_Operacion;
	private JTextField JtextField_Puntuacion;

	//Arrays

				
	//Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jugar frame = new Jugar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public Jugar() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel_Saludo = new JLabel("Saludo Jugador");
		JLabel_Saludo.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel_Saludo.setBounds(92, 11, 240, 32);
		contentPane.add(JLabel_Saludo);
		

		//Imagen en JLabel1
		JLabel label_dado1= new JLabel("d1");
		label_dado1.setBounds(10, 68, 72, 72);
		ImageIcon image1 = new ImageIcon(getClass().getResource("dado1_3.png"));
		Icon icono= new ImageIcon(image1.getImage().getScaledInstance(label_dado1.getWidth(), label_dado1.getHeight(), Image.SCALE_DEFAULT));
		label_dado1.setIcon(icono);
		contentPane.add(label_dado1);
		
		//Imagen en JLabel2
		JLabel label_dado2= new JLabel("d2");
		label_dado2.setBounds(92, 68, 72, 72);
		ImageIcon image2 = new ImageIcon(getClass().getResource("dado2_3.png"));
		Icon icono2= new ImageIcon(image2.getImage().getScaledInstance(label_dado2.getWidth(), label_dado2.getHeight(), Image.SCALE_DEFAULT));
		label_dado2.setIcon(icono2);
		contentPane.add(label_dado2);
		
		//Imagen en JLabel3
		JLabel label_dado3= new JLabel("d3");
		label_dado3.setBounds(174, 68, 72, 72);
		ImageIcon image3 = new ImageIcon(getClass().getResource("dado3_3.png"));
		Icon icono3= new ImageIcon(image3.getImage().getScaledInstance(label_dado3.getWidth(), label_dado3.getHeight(), Image.SCALE_DEFAULT));
		label_dado3.setIcon(icono3);
		contentPane.add(label_dado3);
		
		//Imagen en JLabel4
		JLabel label_dado4= new JLabel("d4");
		label_dado4.setBounds(10, 165, 72, 72);
		ImageIcon image4 = new ImageIcon(getClass().getResource("dado4_6.png"));
		Icon icono4= new ImageIcon(image4.getImage().getScaledInstance(label_dado4.getWidth(), label_dado4.getHeight(), Image.SCALE_DEFAULT));
		label_dado4.setIcon(icono4);
		contentPane.add(label_dado4);
		
		//Imagen en JLabel5
		JLabel label_dado5= new JLabel("d5");
		label_dado5.setBounds(92, 165, 72, 72);
		ImageIcon image5 = new ImageIcon(getClass().getResource("dado5_6.png"));
		Icon icono5= new ImageIcon(image5.getImage().getScaledInstance(label_dado5.getWidth(), label_dado5.getHeight(), Image.SCALE_DEFAULT));
		label_dado5.setIcon(icono5);
		contentPane.add(label_dado5);
		
		//Imagen en JLabel6
		JLabel label_dado6= new JLabel("d6");
		label_dado6.setBounds(10, 262, 72, 72);
		ImageIcon image6 = new ImageIcon(getClass().getResource("dadodoce_10.png"));
		Icon icono6= new ImageIcon(image6.getImage().getScaledInstance(label_dado6.getWidth(), label_dado6.getHeight(), Image.SCALE_DEFAULT));
		label_dado6.setIcon(icono6);
		contentPane.add(label_dado6);


		//Añadimos un MouseListener a cada dado para cuando lo pulsemos
		//dado1.addMouseListener(new ListenerDados());
		
		//JLabel JLabel_Dado1 = new JLabel("d1");
		//JLabel_Dado1.setBounds(10, 68, 72, 72);
		//contentPane.add(JLabel_Dado1);
		
		//dado1.addMouseListener(new ListenerDados());
		
		//JLabel JLabel_dado2 = new JLabel("d2");
		//JLabel_dado2.setBounds(92, 68, 72, 72);
		//contentPane.add(JLabel_dado2);
		
		//dado2.addMouseListener(new ListenerDados());
		
		//JLabel JLabel_dado3 = new JLabel("d3");
		//JLabel_dado3.setBounds(174, 68, 72, 72);
		//contentPane.add(JLabel_dado3);
		
		//dado3.addMouseListener(new ListenerDados());
		
		//JLabel JLabel_dado4 = new JLabel("d4");
		//JLabel_dado4.setBounds(10, 165, 72, 72);
		//contentPane.add(JLabel_dado4);
		
		//dado4.addMouseListener(new ListenerDados());
		
		//JLabel JLabel_dado5 = new JLabel("d5");
		//JLabel_dado5.setBounds(92, 165, 72, 72);
		//contentPane.add(JLabel_dado5);
		
		//dado5.addMouseListener(new ListenerDados());
		
		//JLabel JLabel_dado6 = new JLabel("d6");
		//JLabel_dado6.setBounds(10, 262, 72, 72);
		//contentPane.add(JLabel_dado6);
		
		//dado6.addMouseListener(new ListenerDados());
	
	
		//Inicializar Dados
		
		//Método para inicializar DADOS
		//inicializa_Dados();

		//private void inicializa_Dados() {
			
			//Carga de imagenes en arrays
           
            //for(int i=0;i<dados3.length;i++){
    			
    		//	dados3[i]=new ImageIcon(getClass().getResource("/Ventanas.img/dado"+String.valueOf(i+1)+"_3.png"));
    		//}
            
            //ImageIcon imagen=new ImageIcon(getClass().getResource("imagenes/Dado.jpg"));
            
    		//for(int i=0;i<dados6.length;i++){
    		//	Dados6[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+"_6.png"));
    		//}
    		//for(int i=0;i<dados12.length;i++){
    		//	Dados12[i]=new ImageIcon(getClass().getResource("img/dado"+String.valueOf(i+1)+".png"));
    		//}
            
		//}    

          //Colocamos los dados de 3 caras. El valor de cada uno debe ser aleatorio
            //for(int i=0;i<numerosAlmacenadosdados3.length;i++) {numerosAlmacenadosdados3[i]=dado.nextInt(3);      }                                                                                 
           // dado1.setIcon(dados3[numerosAlmacenadosdados3[0]]); //Imagen dentro de los JLabel
            //dado1.setName("1"); //Bautizo cada jlabel pensando en el posterior listener
            //dado2.setIcon(dados3[numerosAlmacenadosDados3[1]]);
           // dado2.setName("2");
            //dado3.setIcon(dados3[numerosAlmacenadosDados3[2]]);
            //dado3.setName("3");
            
           // dado1.setIcon(dados3[d1]);
                         
//@Override 
//Indica al copilador que estamos “sobreescribiendo” un método ya existentes

//public void mouseClicked(MouseEvent e) {

//getSource() es un método propio de la clase de eventos que permite identificar sobre que elemento
//ha sucedido el click del ratón, en este caso sobre que label

// dado = (JLabel) e.getSource();

//Se había puesto nombre a cada dado, eran 1,2,3 para los 3 dados con cara valores de 1 a 3
//y serán 4,5 para los dados con cara valores de 1 a 6.
//”cogemos” el nombre del dado clickado y lo pasamos a entero

//int numeroDado=Integer.valueOf(dado.getName());

//tocaNumero es una variable booleana, que habremos definido como atributo de la clase que
//nos controla si en el momento en que estamos del juego realmente toca escoger un número (true)
//o no toca escoger un número porque ya lo habíamos escogido antes y ahora lo que se espera es
//que escojamos la operación (false), en ese caso si no toca número, simplemente no pasa nada

//if(tocaNumero){

//Si se trata de alguno de los 3 dados con valores de 1 a 3 en las caras (1, 2, ó 3)

//if(numeroDado<4){

//Apuntamos ese número junto con todo lo que ya teníamos en el campo de texto
//(en mi caso se llama resultado) donde vamos apuntando el seguimiento del juego
//resultado.setText(resultado.getText()+String.valueOf(numerosAlmacenadosDados3[numeroDado-1]+1));

//Pasamos el dato a un método setOperacion, que se encargará de
//ir haciendo las operaciones de forma acumulativa progresivamente

//setOperacion(numerosAlmacenadosDados3[numeroDado-1]+1);}

//Si el dado pulsado es alguno con valores de 1 a 6 en las caras.

//else //hemos pulsado algún dado con valores de 1 a 6, los dados 4,5
//{resultado.setText(resultado.getText()+String.valueOf(numerosAlmacenadosDados6[numeroDado-4]+1));
//setOperacion(numerosAlmacenadosDados6[numeroDado-4]+1);}

//Borramos el listener asociado al dado pulsado
//Ponemos en su label el dado gris para indicar que ya está pulsado
//Ponemos el semáforo tocanumero a false

//dado.removeMouseListener(this);
//dado.setIcon(dadoGris);
//tocaNumero=false;

		//***********************************************************************
		
		JButton JbtnSignoMas = new JButton("SignoMas");
		JbtnSignoMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		JbtnSignoMas.setBackground(Color.GREEN);
		JbtnSignoMas.setBounds(220, 208, 98, 32);
		contentPane.add(JbtnSignoMas);
		
		JButton btnSignomenos = new JButton("SignoMenos");
		btnSignomenos.setBackground(Color.RED);
		btnSignomenos.setBounds(326, 208, 98, 32);
		contentPane.add(btnSignomenos);
		
		JtextField_Operacion = new JTextField();
		JtextField_Operacion.setHorizontalAlignment(SwingConstants.CENTER);
		JtextField_Operacion.setText("Operacion");
		JtextField_Operacion.setBounds(220, 251, 204, 32);
		contentPane.add(JtextField_Operacion);
		JtextField_Operacion.setColumns(10);
		
		JtextField_Puntuacion = new JTextField();
		JtextField_Puntuacion.setHorizontalAlignment(SwingConstants.CENTER);
		JtextField_Puntuacion.setText("Puntuacion");
		JtextField_Puntuacion.setBounds(220, 165, 204, 32);
		contentPane.add(JtextField_Puntuacion);
		JtextField_Puntuacion.setColumns(10);
		
		JButton btnMensajesalida = new JButton("Mensaje_Salida");
		btnMensajesalida.setBounds(256, 345, 138, 39);
		contentPane.add(btnMensajesalida);
		
		JButton btnNewButton = new JButton("MathDice");
		btnNewButton.setBounds(256, 295, 138, 39);
		contentPane.add(btnNewButton);
	}
	// Setter
		public void setJugador(Jugador player1)
		{
			JLabel_Saludo.setText("Bienvenido "+player1.getNombre()+" al juego");
		}
		
		//***************************************************************************
		
		//ListenerDados al implementar MouseListener debe también implemtar los siguientes casos
		//Aunque no hagan nada

		//Inner Class (ActionListener a través de un Inner class)
		
		private class ListenerDados implements MouseListener {
			
			ListenerDados ref=this;
			
			public void mouseClicked(MouseEvent e) {
				
				
				JLabel player1=(JLabel)e.getSource();
				
				//No deja volver a pulsar el botón
				
				//if (alternando==false){
					
					//Valor del Dado
					
					//int valorDado=Integer.valueOf(j.getText());
					player1.setEnabled(false);
					//String aux=sumDados.getText(); 
					//String aux2=aux + String.valueOf(valorDado+1); 
					//sumDados.setText(aux2);
					
					player1.removeMouseListener(ref);
					
					//alternando=true;
					
					//1 eleccion pulsada
					
					//if(resultadoFinal == 0) {
						//resultadoFinal = valorDado+1;
						
					//Resto
						
					//}else{
						//if(controladorOperacion == 1){
							//resultadoFinal = resultadoFinal + (valorDado+1);
						//}else if (controladorOperacion == 0){
							//resultadoFinal = resultadoFinal - (valorDado+1);
						//}
					}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Apéndice de método generado automáticamente
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Apéndice de método generado automáticamente
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Apéndice de método generado automáticamente
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Apéndice de método generado automáticamente
				
			}
				}
				
			//}
		
		
		
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

