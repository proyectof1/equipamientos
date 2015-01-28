package es.open4job.aytozgz.opendata.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

import es.open4job.aytozgz.opendata.vo.RecursosVO;

public class RecursosDAO extends GenericDAO {

	public static final Logger logger = Logger.getLogger(RecursosDAO.class
			.getName());

	// constructor
	public RecursosDAO(String driver, String url, String user, String password) {
		super(driver, url, user, password);
		// TODO Auto-generated constructor stub
	}

	// Listado de recursos
	public List<RecursosVO> getListadoRecursos() {

		List<RecursosVO> recursos = new ArrayList<RecursosVO>();

		String query = "SELECT * FROM RECURSO";
		// String query = "SELECT ID, TITULO, LATITUD, LONGITUD FROM RECURSO";

		Statement st = null;
		ResultSet rs = null;

		try {

			this.abrirConexion();
			st = connection.createStatement();
			rs = st.executeQuery(query);
			// rs = connection.createStatement().executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				float latitud = rs.getFloat(2);
				float longitud = rs.getFloat(3);
				String servicios = rs.getString(4);
				String horario = rs.getString(5);
				String titulo = rs.getString(6);
				String descripcion = rs.getString(7);
				String gradoacc = rs.getString(8);
				String tipo = rs.getString(9);
				String relacionado = rs.getString(10);
				String clasificación = rs.getString(11);
				String precio = rs.getString(12);
				String email = rs.getString(13);
				String url = rs.getString(14);
				String accesibilidad = rs.getString(15);
				String poblacion = rs.getString(16);
				String telefono = rs.getString(17);

				RecursosVO recurso = new RecursosVO(id, latitud, longitud,
						servicios, horario, titulo, descripcion, gradoacc,
						tipo, relacionado, clasificación, precio, email, url,
						accesibilidad, poblacion, telefono);
				recursos.add(recurso);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE,
					"ClassNotFoundException : " + e.getMessage());
		} catch (SQLException ereport2) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "SQLException : " + e.getMessage());
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
			}
			if (st != null) {
				try {
					st.close();
				} catch (Exception e) {
				}
			}
		}
		this.cerrarConexion();

		return recursos;
	}

	// Obtiene los datos de un registro en concreto
	public RecursosVO getDatosRecurso(int idEquipo) {

		RecursosVO recurso = null;

		ResultSet rs = null;
		try {
			rs = connection.createStatement().executeQuery(
					"SELECT * FROM RECURSO WHERE ID = " + idEquipo);
			rs.next();
			System.out.println(rs.getString(1)); // 0 ?
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return recurso;

	}

}
