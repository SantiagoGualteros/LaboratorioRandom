package logica;

public class Multiplicar extends Calculadora {
	private double num1;
	private double num2;
	
	public Multiplicar(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double operacion() {
		double multiplicar = num1 * num2;
		return multiplicar;
	}
	
}
