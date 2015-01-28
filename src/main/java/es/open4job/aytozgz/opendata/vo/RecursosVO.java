package es.open4job.aytozgz.opendata.vo;

public class RecursosVO {

	private double _latitud;
	private double _longitud;
	private String _servicios;
	private String _horario;
	private String _titulo;
	private String _descripcion;
	private String _gradoacc;
	private int _id;
	private String _tipo;
	private String _relacionado;
	private String _clasificación;
	private String _precio;
	private String _email;
	private String _url;
	private String _accesibilidad;
	private String _poblacion;
	private String _telefono;

	public RecursosVO() {
	}

	public RecursosVO(int _id, String _titulo, double _latitud, double _longitud){
		this._id = _id;
		this._titulo = _titulo;
		this._latitud = _latitud;
		this._longitud = _longitud;
	}
	
	public RecursosVO(double _latitud, double _longitud,
			String _servicios, String _horario, String _titulo,
			String _descripcion, String _gradoacc, int _id, String _tipo,
			String _relacionado, String _clasificación, String _precio,
			String _email, String _url, String accesibilidad,
			String _poblacion, String _telefono) {
		this._latitud = _latitud;
		this._longitud = _longitud;
		this._servicios = _servicios;
		this._horario = _horario;
		this._titulo = _titulo;
		this._descripcion = _descripcion;
		this._gradoacc = _gradoacc;
		this._id = _id;
		this._tipo = _tipo;
		this._relacionado = _relacionado;
		this._clasificación = _clasificación;
		this._precio = _precio;
		this._email = _email;
		this._url = _url;
		this._accesibilidad = accesibilidad;
		this._poblacion = _poblacion;
		this._telefono = _telefono;
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
	 * @return the _servicios
	 */
	public String get_servicios() {
		return _servicios;
	}

	/**
	 * @param _servicios
	 *            the _servicios to set
	 */
	public void set_servicios(String _servicios) {
		this._servicios = _servicios;
	}

	/**
	 * @return the _horario
	 */
	public String get_horario() {
		return _horario;
	}

	/**
	 * @param _horario
	 *            the _horario to set
	 */
	public void set_horario(String _horario) {
		this._horario = _horario;
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
	 * @return the _descripcion
	 */
	public String get_descripcion() {
		return _descripcion;
	}

	/**
	 * @param _descripcion
	 *            the _descripcion to set
	 */
	public void set_descripcion(String _descripcion) {
		this._descripcion = _descripcion;
	}

	/**
	 * @return the _gradoacc
	 */
	public String get_gradoacc() {
		return _gradoacc;
	}

	/**
	 * @param _gradoacc
	 *            the _gradoacc to set
	 */
	public void set_gradoacc(String _gradoacc) {
		this._gradoacc = _gradoacc;
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
	 * @return the _relacionado
	 */
	public String get_relacionado() {
		return _relacionado;
	}

	/**
	 * @param _relacionado
	 *            the _relacionado to set
	 */
	public void set_relacionado(String _relacionado) {
		this._relacionado = _relacionado;
	}

	/**
	 * @return the _clasificación
	 */
	public String get_clasificación() {
		return _clasificación;
	}

	/**
	 * @param _clasificación
	 *            the _clasificación to set
	 */
	public void set_clasificación(String _clasificación) {
		this._clasificación = _clasificación;
	}

	/**
	 * @return the _precio
	 */
	public String get_precio() {
		return _precio;
	}

	/**
	 * @param _precio
	 *            the _precio to set
	 */
	public void set_precio(String _precio) {
		this._precio = _precio;
	}

	/**
	 * @return the _email
	 */
	public String get_email() {
		return _email;
	}

	/**
	 * @param _email
	 *            the _email to set
	 */
	public void set_email(String _email) {
		this._email = _email;
	}

	/**
	 * @return the _url
	 */
	public String get_url() {
		return _url;
	}

	/**
	 * @param _url
	 *            the _url to set
	 */
	public void set_url(String _url) {
		this._url = _url;
	}

	/**
	 * @return the accesibilidad
	 */
	public String getAccesibilidad() {
		return _accesibilidad;
	}

	/**
	 * @param accesibilidad
	 *            the accesibilidad to set
	 */
	public void setAccesibilidad(String accesibilidad) {
		this._accesibilidad = accesibilidad;
	}

	/**
	 * @return the _poblacion
	 */
	public String get_poblacion() {
		return _poblacion;
	}

	/**
	 * @param _poblacion
	 *            the _poblacion to set
	 */
	public void set_poblacion(String _poblacion) {
		this._poblacion = _poblacion;
	}

	/**
	 * @return the _telefono
	 */
	public String get_telefono() {
		return _telefono;
	}

	/**
	 * @param _telefono
	 *            the _telefono to set
	 */
	public void set_telefono(String _telefono) {
		this._telefono = _telefono;
	}

}
