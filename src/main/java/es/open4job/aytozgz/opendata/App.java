package es.open4job.aytozgz.opendata;

import java.sql.SQLException;

import es.open4job.aytozgz.opendata.dao.AparcamientosDAO;
import es.open4job.aytozgz.opendata.dao.RecursosDAO;


public class App 
{
    public static void main( String[] args ){
      
    	
    	String driver = "oracle.jdbc.driver.OracleDriver";
    	String host = "54.154.192.80";
    	String puerto = "1521";
    	String sid = "xe";
    	String user = "open4job";
    	String password = "open4job";
    	String url = "jdbc:oracle:thin:" + user + "/" + password + "@" + host
    	+ ":" + puerto + ":" + sid;
    	AparcamientosDAO aparcamientosDAO = new AparcamientosDAO(driver,
    	url, user, password);
    	RecursosDAO recursosDAO = new RecursosDAO(driver, url, user, password);
    	
    	//llamada a recursosDao
    	try {
    		System.out.println("recursos");
    		recursosDAO.prueba();
    		recursosDAO.getListadoRecursos();
    		recursosDAO.getDatosRecurso(0);	//id
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	} catch (SQLException e) {
    	
    		e.printStackTrace();
    	} 
    	
    	//llamada a aparcamientosDAO
    	try {
    		System.out.println("aparcamientos");
    		aparcamientosDAO.prueba();
    		aparcamientosDAO.getListadoAparcamientos();
    		aparcamientosDAO.getDatosaparcamiento(1);	//id?
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	} catch (SQLException e) {
    	
    		e.printStackTrace();
    	}
    	
    }
}
