import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ConversorTemperatura {

	public static DecimalFormat formatoSinDecimal = new DecimalFormat("#,###.##");
	
	public static void main(String[] args) {

		String[] conversionesTemperatura = { "Celsius a Farenheit", "Farenheit a Celsius", "Celsius a Kelvin",
				"Kelvin a Celsius", "Kelvin a Farenheit", "Farenheit a Kelvin" };

		String elegirConversionTemperatura = (String) JOptionPane.showInputDialog(null,
				"¿Qué tipo de conversión deseas realizar?", "Elegir conversion", JOptionPane.QUESTION_MESSAGE, null,
				conversionesTemperatura, conversionesTemperatura[0]);

		System.out.println("Cambio elegido: " + elegirConversionTemperatura);

		if (elegirConversionTemperatura != null) {

			try {
				double valorAConvertir = Double
					.parseDouble(JOptionPane.showInputDialog("¿Cuál es el valor a convertir de \n grados "   + elegirConversionTemperatura + "?"));

				String stringDevuelto;

				switch (elegirConversionTemperatura) {
				case "Farenheit a Celsius": {
					Farenheit farenheit = new Farenheit(valorAConvertir);
					double valorConvertido = farenheit.farenheitACelsius(valorAConvertir);
					Celsius celsius = new Celsius(valorConvertido);
					stringDevuelto = formatoSinDecimal.format(celsius.valor) + celsius.simbolo;
					break;
				}
				case "Celsius a Farenheit": {
					Celsius celsius = new Celsius(valorAConvertir);
					double valorConvertido = celsius.celsiusAFarenheit(valorAConvertir);
					Farenheit farenheit = new Farenheit(valorConvertido);
					stringDevuelto = formatoSinDecimal.format(farenheit.valor) + farenheit.simbolo;
					break;
				}
				case "Celsius a Kelvin": {
					Celsius celsius = new Celsius(valorAConvertir);
					double valorConvertido = celsius.celsiusAKelvin(valorAConvertir);
					Kelvin kelvin = new Kelvin(valorConvertido);
					stringDevuelto = formatoSinDecimal.format(kelvin.valor) + kelvin.simbolo;
					break;
				}
				case "Kelvin a Celsius": {
					Kelvin kelvin = new Kelvin(valorAConvertir);
					double valorConvertido = kelvin.kelvinACelsius(valorAConvertir);
					Celsius celsius = new Celsius(valorConvertido);
					stringDevuelto = formatoSinDecimal.format(celsius.valor) + celsius.simbolo;
					break;
				}
				case "Kelvin a Farenheit": {
					Kelvin kelvin = new Kelvin(valorAConvertir);
					double valorConvertido = kelvin.kelvinAFarenheit(valorAConvertir);
					Farenheit farenheit = new Farenheit(valorConvertido);
					stringDevuelto = formatoSinDecimal.format(farenheit.valor) + farenheit.simbolo;
					break;
				}
				case "Farenheit a Kelvin": {
					Farenheit farenheit = new Farenheit(valorAConvertir);
					double valorConvertido = farenheit.farenheitAKelvin(valorAConvertir);
					Kelvin kelvin = new Kelvin(valorConvertido);
					stringDevuelto = formatoSinDecimal.format(kelvin.valor) + kelvin.simbolo;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + elegirConversionTemperatura);
				}

				JOptionPane.showMessageDialog(null, formatoSinDecimal.format(valorAConvertir) + " convertido de grados "
						+ elegirConversionTemperatura + " es: " + stringDevuelto);

			} catch (NumberFormatException ne) {
				JOptionPane.showMessageDialog(null, "El valor ingresado debe ser un número");

			}
		}
	}
	
}
