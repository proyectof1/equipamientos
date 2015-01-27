package es.open4job.aytozgz.opendata.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import es.open4job.aytozgz.opendata.vo.RecursosVO;

public class RecursosDAO extends AbstractDAO {

	public RecursosDAO(String driver, String url, String user, String password) {
		super(driver, url, user, password);
		// TODO Auto-generated constructor stub
	}

	// Listado de recursos
	public List<RecursosVO> getListadoRecursos() {

		List<RecursosVO> recursos = null;

		ResultSet rs = null;
		try {
			rs = connection.createStatement().executeQuery(
					"SELECT * FROM RECURSO");
			
			while (rs.next()) {
				System.out.println(rs.next());	//revisar
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return recursos;
	}

	// Obtiene los datos de un registro en concreto
	public RecursosVO getDatosRecurso(int idEquipo) {

		RecursosVO recurso = null;

		ResultSet rs = null;
		try {
			rs = connection.createStatement().executeQuery(
					"SELECT * FROM RECURSO WHERE ID = " +idEquipo);
			rs.next();
			System.out.println(rs.getString(1));	//0 ?
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return recurso;

	}

}
