package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double Converter(double dollar, double quantDollar) {
		return dollar * quantDollar * (1.0 + IOF);
	}
	
}
