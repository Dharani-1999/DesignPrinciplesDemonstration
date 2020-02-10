package Calculator.CalculatorExample;

public class Calci implements CalciInterface{
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
	public void display() {
		System.out.println("WELCOME TO THE EXAMPLE OF SIMPLE CALCULATOR");
	}
    
}
