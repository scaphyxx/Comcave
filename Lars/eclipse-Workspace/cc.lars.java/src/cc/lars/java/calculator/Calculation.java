package cc.lars.java.calculator;

public class Calculation {
// Addition
	static int addition(int x, int y) {
		return x + y;
	}
	
	static double addition(double x, int y) {
		return x + y;
	}
	
	static double addition(int x, double y) {
		return x + y;
	}
	
	static double addition(double x, double y) {
		return x + y;
	}

// Subtraction
	static int substract(int x, int y) {
	return x - y;
	}
	
	static double substract(double x, int y) {
	return x - y;
	}
	
	static double substract(int x, double y) {
	return x - y;
	}
	
	static double substract(double x, double y) {
	return x - y;
	}
	
/** var args : 
 * 	Are used to setup a list of variants. Only allowed to use once, not in multiple form */
//	static int addition(int...x) {
//		int sum = 0;
//		for(int i = 0 ; i < x.length; i++)
//			sum += x[i];
//		return sum;
//	}
}