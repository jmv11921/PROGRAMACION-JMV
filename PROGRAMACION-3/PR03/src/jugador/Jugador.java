package jugador;

// CLASE
public class Jugador {

		// Declaro ATRIBUTOS y TIPOS de la Clase
		private String nombre;
		private String apellidos;
		private String alias;
		private int edad;
		private int numjugador;
		private int puntuacion;
		
		
		// METODOS (geters y seters)
		public String getNombre(){
			return nombre;}
		public void setNombre (String nombre){
			this.nombre = nombre;}
		
		public String getApellidos(){
			return apellidos;}
		public void setApellidos (String apellidos){
			this.apellidos = apellidos;}
		
		public String getAlias(){
			return alias;}	
		public void alias (String alias){
			this.alias = alias;}
		
		public int getEdad(){
			return edad;}
		public void setEdad(int edad){
			this.edad = edad;}
		
		public int getNumJugador(){
			return numjugador;}
		public void setNumJugador(int numjugador){
			this.numjugador = numjugador;}
		
		public int Puntuacion(){
			return puntuacion;}
		public void setPuntuacion(int puntuacion){
			this.puntuacion = puntuacion;}
		
		
		// CONSTRUCTOR de la Clase
		public Jugador(){
			
		}
		
		public String toString(){
			return this.nombre+"  "+this.apellidos+"  "+this.alias+" "+this.edad+"  "+this.numjugador+" "+this.puntuacion;
		}
}
