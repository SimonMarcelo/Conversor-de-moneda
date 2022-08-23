import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static void main(String[] args) {

		String[] conversionesTemperatura = { "Celsius a Farenheit", "Farenheit a Celsius", "Celsius a Kelvin",
				"Kelvin a Celsius", "Kelvin a Farenheit", "Farenheit a Kelvin" };

		double valorIngresado = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor a convertir?"));

		String elegirConversionTemperatura = (String) JOptionPane.showInputDialog(null,
				"¿Qué tipo de conversión deseas realizar?", "Elegir conversion", JOptionPane.QUESTION_MESSAGE, null,
				conversionesTemperatura, conversionesTemperatura[0]);

		System.out.println("Cambio elegido: " + elegirConversionTemperatura);

	}
}
