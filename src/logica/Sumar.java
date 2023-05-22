package logica;

public class Sumar extends Calculadora {
	private double num1;
	private double num2;
	
	public Sumar(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double operacion() {
		double sumar = num1 + num2;
		return sumar;
	}
	
}
