package persistencia;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import logica.Integrante;

public class ControladorDB {
	
	public ControladorDB() {}
	
	public void persistirIntegrante(Integrante integrante) {
		
		String values = "";
		
		values = integrante.getId() + ", '" + integrante.getNombre() + "', '" + 
				integrante.getApellido() + "', " + "'" + 
				java.sql.Date.valueOf(integrante.getFechaNac()) + "'";
		// values = 46637772, 'Carlos', 'Gardel', '13-02-1967'
		
		String insert = "INSERT INTO integrantes VALUES (" + values + ");";
		// insert = INSERT INTO integrantes VALUES (46637772, 'Carlos', 'Gardel', '13-02-1967');
		
		Conn con = new Conn();
		Connection connection = con.conectarMySQL();

		Statement s;
			try {
				s = connection.createStatement();
			
			
				s.executeUpdate(insert);
				
				if (integrante.getClass().toString().equals("Entrenador")) {
	
				} else if(integrante.getClass().toString().equals("Futbolista")) {
					
				} else {
					
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
		
	}

	public ArrayList<Integrante> recuperarIntegrantes() {
		ArrayList<Integrante> integrantes = new ArrayList<Integrante>();
		
		Conn conn = new Conn();
		
		Connection connection = conn.conectarMySQL();
		
		try {
			Statement s = connection.createStatement();
			ResultSet rs;
			
			String query = "SELECT * FROM integrantes";
			
			rs = s.executeQuery(query);
			
			while (rs.next()) {
				Integrante i = new Integrante(rs.getInt("id"), rs.getString("nombre"), rs.getString("apellido"), rs.getDate("fechaNacimiento").toLocalDate());
				integrantes.add(i);
			}
			
			System.out.println(integrantes.get(0).getNombre() + " " + integrantes.get(0).getFechaNac());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return integrantes;
	}
}
