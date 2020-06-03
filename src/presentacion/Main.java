package presentacion;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import persistencia.Conn;
import extras.Docente;
import extras.Estudiante;
import extras.Materia;
import extras.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2 Estudiantes (e1, e2), 2 Docentes (d1, d2), 5 Materias (m1...m5).

		El objeto e1 cursa m1, m2, m3
		El objeto e2 cursa m2, m3, m4, m5
		El objeto d1, dicta m1..m3
		El objeto d2, dicta m4..m5
		*/
		
		/*Materia m1 = new Materia("Prog I", 2);
		Materia m2 = new Materia("Prog II", 3);
		Materia m3 = new Materia("Prog III", 3);
		Materia m4 = new Materia("Math", 6);
		Materia m5 = new Materia("Filosofia", 4);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Materia> materias = new ArrayList<Materia>();
		
		Usuario e1 = new Estudiante("Juan", "Bordagorry", LocalDate.of(1996, 3, 13), 12312313);
		Usuario e2 = new Estudiante("Pablo", "Escobar", LocalDate.of(1976, 8, 13), 22222222);
		
		Usuario d1 = new Docente("Carlo", "Magno", LocalDate.of(856, 4, 11), 853, 11000);
		Usuario d2 = new Docente("Tomas", "Alvez", LocalDate.of(2004, 4, 9), 1231244, 234234);
		
		// El objeto e1 cursa m1, m2, m3
		((Estudiante) e1).addMateriaQueCursa(m1);
		m1.addEstudianteQueCursaLaMateria((Estudiante) e1); 
		
		((Estudiante) e1).addMateriaQueCursa(m2);
		m2.addEstudianteQueCursaLaMateria((Estudiante) e1); 
		
		((Estudiante) e1).addMateriaQueCursa(m3);
		m3.addEstudianteQueCursaLaMateria((Estudiante) e1); 
		
		// El objeto e2 cursa m2, m3, m4, m5
		((Estudiante) e2).addMateriaQueCursa(m2);
		m2.addEstudianteQueCursaLaMateria((Estudiante) e2); 
		
		((Estudiante) e2).addMateriaQueCursa(m3);
		m3.addEstudianteQueCursaLaMateria((Estudiante) e2); 
		
		((Estudiante) e2).addMateriaQueCursa(m4);
		m4.addEstudianteQueCursaLaMateria((Estudiante) e2); 
		
		((Estudiante) e2).addMateriaQueCursa(m5);
		m5.addEstudianteQueCursaLaMateria((Estudiante) e2); 
		
		//El objeto d1, dicta m1..m3
		ArrayList<Materia> materiasQueDictaUnDocente = new ArrayList<Materia>();
		materiasQueDictaUnDocente.add(m1);
		m1.addDocenteQueDictaLaMateria((Docente) d1);
		materiasQueDictaUnDocente.add(m2);
		m2.addDocenteQueDictaLaMateria((Docente) d1);
		materiasQueDictaUnDocente.add(m3);
		m3.addDocenteQueDictaLaMateria((Docente) d1);
		((Docente) d1).setMateriasQueDicta(materiasQueDictaUnDocente);
		
		//El objeto d1, dicta m4..m5
		
		
		usuarios.add(e1);
		usuarios.add(e2);
		usuarios.add(d1);
		usuarios.add(d2);
		
		materias.add(m1);
		materias.add(m2);
		materias.add(m3);
		materias.add(m4);
		materias.add(m5);
		
		System.out.println(usuarios.get(0).getNombre());*/
		
		
		Conn connect = new Conn();
		
		Connection con = connect.conectarMySQL();
		
		Statement s;
		ResultSet rs;
		
		String queSelecciono = "*";
		String tabla = "alumnos";
		
		String query = "SELECT " + queSelecciono + " FROM " + tabla;
		
		try {
			s = con.createStatement();
			rs = s.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getInt("ci") + " " + rs.getString("nombre") + " " + rs.getString("orientacion"));
			}

		}catch(SQLException ex) {
			
		}
		
		int ci = 1231232;
		String nombre = "el chavo";
		String orientacion = "TIC";
		
		//Alumno alum = new Alumno(1231232, "el chavo", "TIC");
		//String update = "INSERT INTO " + tabla + " VALUES(" + alum.getCi() + ", '" + alum.getNombre() + "', '" + alum.getOrientacion() + "')";
		
		String update = "INSERT INTO " + tabla + " VALUES(" + ci + ", '" + nombre + "', '" + orientacion + "')";
		
		try {
			s = con.createStatement();
			s.executeUpdate("INSERT INTO alumnos VALUES (1231232, 'el chavo', 'TIC'");
		}catch(SQLException ex) {
			
		}
		
		
		/*
		 * 
		 * presentacion (pantalla.java, index.html)
		 * 
		 * 
		 * logica (Entrenado, Futbolista, Controlador...)
		 * 
		 * 
		 * persistencia (Conn, ControladorBD)
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
	}

}
