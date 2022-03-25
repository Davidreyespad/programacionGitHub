package Ejercicio9;


public class Pizza {

	private static int totalPedidas;
	private static int totalServidas;
	private String estado;
	private String tamaño;
	private String tipo;
	
	public Pizza(String tipo, String tamaño) {
		
		this.tipo= tipo;
		this.tamaño=tamaño;
		this.estado="pedido";
		Pizza.totalPedidas++;
	}
	
	public void setTipo (String tipo) {
		this.tipo=tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTamaño (String tamaño) {
		this.tamaño=tamaño;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setEstado (String estado) {
		this.estado=estado;
	}
	public String getEstado() {
		return estado;
	}
	
	public String toString() {
		return "pizza" + tipo + " " + tamaño + " " + estado;
	}
	
	public static int getTotalPedidas(){
		return Pizza.totalPedidas;
	}
	

	public static int getTotalServidas(){
		return Pizza.totalServidas;
	}
	
	public void sirve() {
		if(this.estado.equals("pedido")) {
			this.estado="servida";
			totalServidas++;
		}
		else {
			System.out.println("Esa pizza ya se ha servido");
		}
	}
	
	
	
	
	
}