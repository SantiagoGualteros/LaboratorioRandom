package logica;

public class Restar extends Calculadora {
	private double num1;
	private double num2;
	
	public Restar(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public double operacion() {
		double restar = num1 - num2;
		return restar;
	}
	
}
