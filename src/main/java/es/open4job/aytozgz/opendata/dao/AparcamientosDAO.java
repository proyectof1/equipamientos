package es.open4job.aytozgz.opendata.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import es.open4job.aytozgz.opendata.vo.AparcamientosAccesosVO;
import es.open4job.aytozgz.opendata.vo.RecursosVO;

public class AparcamientosDAO extends GenericDAO {

	public AparcamientosDAO(String driver, String url, String user,
			String password) {
		super(driver, url, user, password);
		// TODO Auto-generated constructor stub
	}

	// Listado de aparcamientos
	public List<AparcamientosAccesosVO> getListadoAparcamientos() {

		List<AparcamientosAccesosVO> aparcamientos = null;

		List<RecursosVO> recursos = null;

		ResultSet rs = null;
		try {
			rs = connection.createStatement().executeQuery(
					"SELECT * FROM APARCAMIENTOACCESO");

			while (rs.next()) {
				System.out.println(rs.next()); // revisar
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aparcamientos;
	}

	// Obtiene los datos de un registro en concreto
	public AparcamientosAccesosVO getDatosaparcamiento(int idAparcamiento) {

		AparcamientosAccesosVO aparcamiento = null;

		ResultSet rs = null;
		try {
			rs = connection.createStatement().executeQuery(
					"SELECT * FROM APARCAMIENTOACCESO WHERE ID = "
							+ idAparcamiento);
			rs.next();
			System.out.println(rs.getString(1)); // 0 ?
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return aparcamiento;
	}

}
