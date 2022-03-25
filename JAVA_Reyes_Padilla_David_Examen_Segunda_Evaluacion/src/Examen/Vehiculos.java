package Examen;


public class Vehiculos {
	
	private String marca;
	private String matricula;
	private int nKilometros;
	private int dia, mes, año;
	private String descripcion;
	private double precio;
	private String nombrePro;
	private String dniPro;
	
    //Constructor por defecto
    public Vehiculos() {
    }
    
    //Constructor con parámetros
    public Vehiculos(String marca, String matricula, int nKilometros, int dia, int mes, int año,  String descripcion, double precio, String nombrePro, String dniPro) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.nKilometros= nKilometros;
        this.marca = marca;
        this.matricula = matricula;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombrePro = nombrePro;
        this.dniPro = dniPro;
    }
    
    
    //Constructor copia
    public Vehiculos(final Vehiculos veh) {
    	dia=veh.dia;
    	mes=veh.mes;
    	año=veh.año;
    	nKilometros=veh.nKilometros;
    	marca=veh.marca;
    	matricula=veh.matricula;
    	descripcion=veh.descripcion;
    	precio=veh.precio;
    	nombrePro=veh.nombrePro;
    	dniPro=veh.dniPro; 	
	}

	//getters y setters
    
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getnKilometros() {
		return nKilometros;
	}

	public void setnKilometros(int nKilometros) {
		this.nKilometros = nKilometros;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombrePro() {
		return nombrePro;
	}

	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	public String getDniPro() {
		return dniPro;
	}

	public void setDniPro(String dniPro) {
		this.dniPro = dniPro;
	}
	public String toString() {
		String cadena = "\n------------------------------------------";
		cadena += "\nMarca " + this.marca;
		cadena += "\nMatrícula " + this.matricula;
		cadena += "\nVer número de Kilómetros " + this.nKilometros;
		cadena += "\nDNI propietario " + this.dniPro;
		cadena += "\nVer años de antigüedad " + this.año;
		cadena += "\nMostrar propietarios " + this.nombrePro;
		cadena += "\nMostrar descripción " + this.descripcion;
		cadena += "\nMostrar precio " + this.precio;
		cadena += "\n------------------------------------------";
		return cadena;
	}
    
    
}
