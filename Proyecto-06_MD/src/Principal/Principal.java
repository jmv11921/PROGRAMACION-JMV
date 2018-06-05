package Principal;

import Ventanas.Jugar;
import Ventanas.Registro;

//Lanzo ventanas
public class Principal {

	public static void main(String[] args) {
		
	//Ventanas usadas
		
		//Ventana Jugar
		Jugar JUG = new Jugar();
		
		//Creacion ventana Registro y enlace con ventana Jugar
		Registro REG= new Registro(JUG);
		
		//Hacer visible la ventana Registro
		REG.setVisible(true);
		//JUG.setVisible(false);

	}

}
