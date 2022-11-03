package CalculadoraMaven.CalculadoraMaven;

import javax.swing.JTextField;

public class Functions {
	private static double result;
	
	public static double sumar(String textField, String textField_1) {
		try {
			result = Double.parseDouble(textField) + Double.parseDouble(textField_1);
			return result;
		}
		catch (Exception exception) {
			return 0;
		}
	}

	public static double restar(String textField, String textField_1) {
		try {
			result = Double.parseDouble(textField) - Double.parseDouble(textField_1);
			return result;
		}
		catch (Exception exception) {
			return 0;
		}
	}
	
	public static double multiplicar(String textField, String textField_1) {
		try {
			result = Double.parseDouble(textField) * Double.parseDouble(textField_1);
			return result;
		}
		catch (Exception exception) {
			return 0;
		}
	}
	
	public static double dividir(String textField, String textField_1) {
		try {
			result = Double.parseDouble(textField) / Double.parseDouble(textField_1);
			return result;
		}
		catch (Exception exception) {
			return 0;
		}
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
