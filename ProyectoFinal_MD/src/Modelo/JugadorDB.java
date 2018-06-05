package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JugadorDB {

	// Conexion a la Base de Datos
	private Connection conn;

	// Objeto Jugador
	private Jugador jugador;

	// Objeto para ejecutar una orden sobre la Base de Datos
	private java.sql.Statement sqlStmnt = null;

	// Constructor: recoge la conexión establecida para la base de datos
	public JugadorDB(Jugador j, Connection c) {
		this.jugador = j;
		this.conn = c;
	}

	// Método que permite insertar un jugador en la Base de Datos
	// La BBDD se llama "matdice" y la tabla correspondiente "jugador"
	public int insertarJugador() {
		int result = -1; // En caso de error devuelvo -1

		try {
			sqlStmnt = conn.createStatement();

			String sql = "INSERT INTO jugadores (nombre, apellido, alias, edad) " + "VALUES ('" + jugador.getNombre()
					+ "', '" + jugador.getApellido1() + "', '" + jugador.getAlias() + "', "
					+ Integer.parseInt(jugador.getEdad()) + ")";
			sqlStmnt.execute(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = sqlStmnt.getGeneratedKeys();
			if (rs.next()) {
				result = rs.getInt(1);
			}

		} catch (SQLException se) {
			// Se produce un error con la consulta
			se.printStackTrace();
		} catch (Exception e) {
			// Se produce cualquier otro error
			e.printStackTrace();
		} finally {
			try {
				if (sqlStmnt != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return result;
	}

	// Método que permite buscar jugadores en la Base de Datos
	// La BBDD se llama "matdice" y la tabla correspondiente "jugador"
	public List buscarJugadores() {
		List<Jugador> lst = new ArrayList();

		try {
			sqlStmnt = conn.createStatement();

			String sql = "SELECT * FROM `jugadores` WHERE nombre like \"" + jugador.getNombre()
					+ "%\" AND apellido LIKE \"" + jugador.getApellido1() + "%\"";

			ResultSet rs = sqlStmnt.executeQuery(sql);
            
			lst.clear();
            
			while (rs.next()) {
				Jugador j = new Jugador();
				j.setId(rs.getLong("id"));
				j.setApellido1(rs.getString("apellido"));
				j.setNombre(rs.getString("nombre"));
				j.setAlias(rs.getString("alias"));
				j.setEdad(rs.getString("edad"));
				j.setPuntuacion(rs.getInt("puntuacion"));
				lst.add(j);
			}

		} catch (SQLException se) {
			// Se produce un error con la consulta
			se.printStackTrace();
		} catch (Exception e) {
			// Se produce cualquier otro error
			e.printStackTrace();
		} finally {
			try {
				if (sqlStmnt != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return lst;
	}

	// Método que permite insertar un jugador en la Base de Datos
	// La BBDD se llama "matdice" y la tabla correspondiente "jugador"
	public boolean buscarJugador() {
		boolean result = false;
		ResultSet rs = null;

		try {
			sqlStmnt = conn.createStatement();

			String sql = "SELECT * FROM `jugadores` WHERE nombre like \"" + jugador.getNombre()
					+ "\" AND apellido LIKE \"" + jugador.getApellido1() + "\"";

			rs = sqlStmnt.executeQuery(sql);

			if (rs.last() && (rs.getRow() > 0))
				result = true;

		} catch (SQLException se) {
			// Se produce un error con la consulta
			se.printStackTrace();
		} catch (Exception e) {
			// Se produce cualquier otro error
			e.printStackTrace();
		} finally {
			// try {
			// if (sqlStmnt != null)
			// conn.close();
			// } catch (SQLException se) {
			// se.printStackTrace();
			// }
		}

		return result;
	}

	// Método que permite buscar jugadores en la Base de Datos
	// La BBDD se llama "matdice" y la tabla correspondiente "jugador"
	public boolean actualizarJugador() {
		boolean result = true;

		try {
			sqlStmnt = conn.createStatement();

			String sql = "UPDATE `jugadores` SET nombre = \"" + jugador.getNombre() + "\"," + "apellido = \""
					+ jugador.getApellido1() + "\"," + "alias = \"" + jugador.getAlias() + "\"," + "edad = \""
					+ jugador.getEdad() + "\"," + "puntuacion = \"" + String.valueOf(jugador.getPuntuacion()) + "\" "
					+ "WHERE id = " + String.valueOf(jugador.getId());

			int count = sqlStmnt.executeUpdate(sql);
			if (count != 1)
				result = false;

		} catch (SQLException se) {
			// Se produce un error con la consulta
			se.printStackTrace();
			result = false;
		} catch (Exception e) {
			// Se produce cualquier otro error
			e.printStackTrace();
			result = false;
		} finally {
			try {
				if (sqlStmnt != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
				result = false;
			}
		}

		return result;
	}
}
