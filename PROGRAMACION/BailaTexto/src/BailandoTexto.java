import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class BailandoTexto extends JFrame {

	private JPanel VentCont;
	private JTextField CajaL1;
	private JTextField CajaR2;

	/**
	 * Inicio de la aplicación
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BailandoTexto frame = new BailandoTexto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Ventana
	 */
	public BailandoTexto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		VentCont = new JPanel();
		VentCont.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(VentCont);
		VentCont.setLayout(null);
		
		// Caja Texto 1
		CajaL1 = new JTextField();
		CajaL1.setFont(new Font("Calibri", Font.BOLD, 12));
		CajaL1.setHorizontalAlignment(SwingConstants.CENTER);
		CajaL1.setBounds(10, 104, 141, 31);
		VentCont.add(CajaL1);
		CajaL1.setColumns(10);
		
		// Caja Texto 2
		CajaR2 = new JTextField();
		CajaR2.setFont(new Font("Calibri", Font.BOLD, 12));
		CajaR2.setHorizontalAlignment(SwingConstants.CENTER);
		CajaR2.setBounds(283, 104, 141, 31);
		VentCont.add(CajaR2);
		CajaR2.setColumns(10);
		
		// Botón 1
		JButton BotonArribaR = new JButton("====>");
		BotonArribaR.setFont(new Font("Arial", Font.PLAIN, 18));
		BotonArribaR.setBackground(Color.GREEN);
		BotonArribaR.setForeground(Color.BLACK);
		BotonArribaR.setBounds(170, 59, 93, 31);
		VentCont.add(BotonArribaR);
		
		// Acción Botón 1
		BotonArribaR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaR2.setText(CajaL1.getText());
				CajaL1.setText("");
			}
		});
		
		// Botón 2
		JButton BotonAbajoL = new JButton("<====");
		BotonAbajoL.setFont(new Font("Arial", Font.PLAIN, 18));
		BotonAbajoL.setBackground(Color.YELLOW);
		BotonAbajoL.setBounds(170, 148, 93, 31);
		VentCont.add(BotonAbajoL);
		
		// Acción Botón 2
		BotonAbajoL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CajaL1.setText(CajaR2.getText());
				CajaR2.setText("");
			}
		});

		// Etiqueta de la caja
		JLabel lblBailandoTexto = new JLabel("Bailando Texto");
		lblBailandoTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblBailandoTexto.setForeground(Color.RED);
		lblBailandoTexto.setFont(new Font("Calibri", Font.BOLD, 28));
		lblBailandoTexto.setBounds(118, 10, 194, 31);
		VentCont.add(lblBailandoTexto);
	}
}
