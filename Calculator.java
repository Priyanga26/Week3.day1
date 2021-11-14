package week3.day1;

public class Calculator {
	
	public void add(int num1, int num2) {

		System.out.println(num1+num2);
			
	}
	public void add(int num1, int num2, int num3) {

		System.out.println(num1+num2+num3);
	}
	
	public void multiply(int num1, int num2) {

		System.out.println(num1*num2);
	
			
	}

	public void multiply(int num1, double num2) {

		System.out.println(num1*num2);
	
			
	}
	public void sub(int num1, int num2) {

		System.out.println(num1-num2);
	
			
	}
	public void sub(double num1, double num2) {

		System.out.println(num1-num2);
	
			
	}
	public void divide(int num1, int num2) {

		System.out.println(num1/num2);
	
			
	}
	public void divide(double num1, int num2) {

		System.out.println(num1/num2);
	
			
	}
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		calc.add(10, 20);
		calc.add(10, 5, 10);
		calc.multiply(5, 20);
		calc.multiply(20, 20.5);
		calc.sub(20, 10);
		calc.sub(20.5, 10.5);
		calc.divide(10, 5);
		calc.divide(20.5, 5);
	}

}
