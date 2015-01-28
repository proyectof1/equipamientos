package es.open4job.aytozgz.opendata;

import java.util.Iterator;
import java.util.List;

import es.open4job.aytozgz.opendata.dao.AparcamientosDAO;
import es.open4job.aytozgz.opendata.dao.RecursosDAO;
import es.open4job.aytozgz.opendata.vo.AparcamientosAccesosVO;
import es.open4job.aytozgz.opendata.vo.RecursosVO;

public class App {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String host = "54.154.192.80";
		String puerto = "1521";
		String sid = "xe";
		String user = "open4job";
		String password = "open4job";
		String url = "jdbc:oracle:thin:" + user + "/" + password + "@" + host
				+ ":" + puerto + ":" + sid;
		/*
		 * // Recursos RecursosDAO recursosDAO = new RecursosDAO(driver, url,
		 * user, password);
		 * 
		 * List<RecursosVO> recursos = recursosDAO.getListadoRecursos();
		 * 
		 * if (recursos != null) {
		 * 
		 * Iterator<RecursosVO> iterator = recursos.iterator(); while
		 * (iterator.hasNext()) { RecursosVO recurso = iterator.next();
		 * System.out.println(recurso.toString()); } }
		 */
		// llamada a recursosDao

		RecursosDAO recursosDAO = new RecursosDAO(driver, url, user, password);

		List<RecursosVO> recursos = recursosDAO.getListadoRecursos();

		if (recursos != null) {

			Iterator<RecursosVO> iterator = recursos.iterator();
			while (iterator.hasNext()) {
				RecursosVO recurso = iterator.next();
				System.out.println("recurso " + recurso.getId() + " "
						+ recurso.getTitulo() + " " + recurso.getLatitud()
						+ " " + recurso.getLongitud());
			}
		}

		// busqueda de 1 recurso en concreto
		System.out.println("\n 2º FUNCION \n ");
		RecursosVO recurso = recursosDAO.getDatosRecurso(18370);

		if (recurso != null) {
			System.out.println("recurso " + recurso.getId() + " "
					+ recurso.getTitulo() + " " + recurso.getLatitud() + " "
					+ recurso.getLongitud());

			// iterator como no es una lista no va
		}

		// AparcamientosAcceso
		AparcamientosDAO aparcamientosDAO = new AparcamientosDAO(driver, url,
				user, password);

		List<AparcamientosAccesosVO> aparcamientos = aparcamientosDAO
				.getListadoAparcamientos();

		if (aparcamientos != null) {

			Iterator<AparcamientosAccesosVO> iterator = aparcamientos
					.iterator();
			while (iterator.hasNext()) {
				AparcamientosAccesosVO aparcamiento = iterator.next();
				System.out.println(aparcamiento.toString());
			}
		}

	}

}
