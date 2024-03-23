package calculadora;

public class Number {
	
	private double x;
	
	private double getX() {
		return this.x;
	}
	
	private void setX(double x) {
		this.x = x;
	}
	
	public double sum (double x, double y){
		setX(x + y);
		return getX();
	}
	
	public double subtraction (double x, double y){
		setX(x - y);
		return getX();
	}
	
	public double multiplication (double x, double y){
		setX(x * y);
		return getX();
	}
	
	public double division (double value1, double y){
		setX(x / y);
		return getX();
	}
}
