package Principal;

import Ventanas.Ventana2;
import Ventanas.Ventana1;

//Lanzo ventanas
public class Principal {

	public static void main(String[] args) {
		
		//Creacion ventana Juego
		Ventana2 FJ = new Ventana2();
		
		//Creacion ventana Inicio y enlace con ventana Juego
		Ventana1 VR = new Ventana1(FJ);
		//Hacer visible la ventana Inicio
		VR.setVisible(true);

	}

}
