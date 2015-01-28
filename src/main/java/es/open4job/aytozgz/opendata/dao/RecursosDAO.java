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
		
		//String query = "SELECT * FROM RECURSO";
		String query = "SELECT ID, TITULO, LATITUD, LONGITUD FROM RECURSO";

		Statement st = null;
		ResultSet rs = null;
		
		try {
			
			this.abrirConexion();
			
			st = connection.createStatement();
			rs = st.executeQuery(query);
			//rs = connection.createStatement().executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt(1);
				String titulo = rs.getString(2);
				float latitud = rs.getFloat(3);
				float longitud = rs.getFloat(4);
				
				RecursosVO recurso = new RecursosVO(id, titulo, latitud, longitud);
				recursos.add(recurso);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE,
					"ClassNotFoundException : " + e.getMessage());
		} catch (SQLException e) {
			e.printStackTrace();
			logger.log(Level.SEVERE, "SQLException : " + e.getMessage());
		}finally {
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
