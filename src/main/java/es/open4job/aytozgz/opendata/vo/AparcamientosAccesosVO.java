package es.open4job.aytozgz.opendata.vo;

public class AparcamientosAccesosVO {

	private double _latitud;
	private double _longitud;
	private String _titulo;
	private String _icono;
	private String _tipo;
	private int _id;

	public AparcamientosAccesosVO() {
	}

	public AparcamientosAccesosVO(double _latitud, double _longitud,
			String _titulo, String _icono, String _tipo, int _id) {
		this._latitud = _latitud;
		this._longitud = _longitud;
		this._titulo = _titulo;
		this._icono = _icono;
		this._tipo = _tipo;
		this._id = _id;
	}

	/**
	 * @return the _latitud
	 */
	public double get_latitud() {
		return _latitud;
	}

	/**
	 * @param _latitud
	 *            the _latitud to set
	 */
	public void set_latitud(double _latitud) {
		this._latitud = _latitud;
	}

	/**
	 * @return the _longitud
	 */
	public double get_longitud() {
		return _longitud;
	}

	/**
	 * @param _longitud
	 *            the _longitud to set
	 */
	public void set_longitud(double _longitud) {
		this._longitud = _longitud;
	}

	/**
	 * @return the _titulo
	 */
	public String get_titulo() {
		return _titulo;
	}

	/**
	 * @param _titulo
	 *            the _titulo to set
	 */
	public void set_titulo(String _titulo) {
		this._titulo = _titulo;
	}

	/**
	 * @return the _icono
	 */
	public String get_icono() {
		return _icono;
	}

	/**
	 * @param _icono
	 *            the _icono to set
	 */
	public void set_icono(String _icono) {
		this._icono = _icono;
	}

	/**
	 * @return the _tipo
	 */
	public String get_tipo() {
		return _tipo;
	}

	/**
	 * @param _tipo
	 *            the _tipo to set
	 */
	public void set_tipo(String _tipo) {
		this._tipo = _tipo;
	}

	/**
	 * @return the _id
	 */
	public int get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(int _id) {
		this._id = _id;
	}
}
