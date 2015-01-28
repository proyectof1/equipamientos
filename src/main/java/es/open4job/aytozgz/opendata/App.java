package es.open4job.aytozgz.opendata;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import es.open4job.aytozgz.opendata.dao.AparcamientosDAO;
import es.open4job.aytozgz.opendata.dao.RecursosDAO;
import es.open4job.aytozgz.opendata.vo.RecursosVO;

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
    	
    	
    	
    	//llamada a recursosDao
    	
    	RecursosDAO recursosDAO = new RecursosDAO(driver, url, user, password);
    	
    	List<RecursosVO> recursos = recursosDAO.getListadoRecursos();
    	
    	if (recursos != null){
    		
    		Iterator<RecursosVO> iterator = recursos.iterator();
    		while (iterator.hasNext()) {
    			RecursosVO recurso = iterator.next();
    			System.out.println("recurso " + recurso.get_id()+ " " + recurso.get_titulo() + " " + recurso.get_latitud() + " " + recurso.get_longitud());
    		}
    	}
    	 
    	
    	//busqueda de 1 recurso en concreto
    	System.out.println("\n 2º FUNCION \n ");
    	RecursosVO recurso = recursosDAO.getDatosRecurso(18370);
    	
    	if (recurso != null){
			System.out.println("recurso " + recurso.get_id()+ " " + recurso.get_titulo() + " " + recurso.get_latitud() + " " + recurso.get_longitud());

    		//iterator como no es una lista no va
    	}
    	
    	
    	
    	
    }
}
