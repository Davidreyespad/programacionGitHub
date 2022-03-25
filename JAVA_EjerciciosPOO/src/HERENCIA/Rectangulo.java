package HERENCIA;

public class Rectangulo extends Poligono {
	
	private double lado1;
	private double lado2;
	
	public Rectangulo (double lado1, double lado2) {
		
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double getlado1(){
		return lado1;
	}
	
	public double getlado2() {
		return lado2;
	}
	
	@Override
	public String toString() {
		return "Rectangulo : \n" + super.toString() + "\nLado 1= " + lado1 + ", Lado 2= " + lado2;
	}
	
	@Override
	public double area() {
		return lado1*lado2;
	}
	
}
