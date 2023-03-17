import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang.ArrayUtils;//interesante identificar número elemento matriz
import org.omg.CORBA.PUBLIC_MEMBER;

public class MenuConversorPresiones extends MenuPrincipal {

	public static double importe;

	public static void main(String[] args) {

	}

	public static void MenuPresiones() {
		String[] opcionesMenuConversorPresion = {
				"megapascal (MPa) \u25B6 libra sobre pulgada cuadrada (psi)",
				"megapascal (MPa) \u25B6 milímetros de mercurio (mmHg)",
				"megapascal (MPa) \u25B6 kilogramo fuerza sobre centímetro cuadrado (kgf/cm2)",
				"libra sobre pulgada cuadrada (psi) \u25B6 megapascal (MPa)", 
				"milímetros de mercurio (mmHg) \u25B6 megapascal (MPa)",
				"kilogramo fuerza sobre centímetro cuadrado (kgf/cm2) \u25B6 megapascal (MPa)", 
				"Regresar al MENÚ PRINCIPAL" };
		String opcionConversion = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opción o CANCELAR para salir.", "Conversor de presiones ALURA", JOptionPane.PLAIN_MESSAGE,
				null, opcionesMenuConversorPresion, opcionesMenuConversorPresion[0]);// opción por defecto seleccionada de
																					// la matriz

		if (opcionConversion == opcionesMenuConversorPresion[6]) {
			MenuPrincipal();
		}
		if (opcionConversion == null) {
			System.exit(0);
		}

		if (opcionConversion != opcionesMenuConversorPresion[6]) {

			// ingreso de la suma a convertir
			JFrame frame1 = new JFrame();
			String importe = JOptionPane.showInputDialog(frame1, "Ingrese la cantidad a convertir...", opcionConversion,
					JOptionPane.QUESTION_MESSAGE);

			// el ingreso es valor numerico?
			String regex = "([0-9]+)(.*)";
			if (importe.matches(regex) == false) {

				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f, "Ingrese un dato numérico.");
				MenuPresiones();
			}

			ConversorPresiones.Convertir(ArrayUtils.indexOf(opcionesMenuConversorPresion, opcionConversion) + 1,
					Double.parseDouble(importe));

			double mensajeEgreso;

			mensajeEgreso = ConversorPresiones.egreso;
			mensajeEgreso = Math.round((ConversorPresiones.egreso * 10000)) / 10000.0;

			// mensajeEgreso=ConversorDivisas.egreso;
			JFrame frame2 = new JFrame();
			JOptionPane.showMessageDialog(frame2,
					importe + " " + ConversorPresiones.unidadIngreso + " " + "equivalen a " + mensajeEgreso + " "
							+ ConversorPresiones.unidadEgreso,
					"La conversión solicitada es...", JOptionPane.INFORMATION_MESSAGE);

			String[] options = new String[] { "Nueva conversión", "MENU PRINCIPAL", "Cancelar" };
			int response = JOptionPane.showOptionDialog(null, "Seleccione una opción o CANCELAR para salir",
					"Conversor múltiple ALURA", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
					options[0]);
			switch (response) {
			case 0:
				MenuPresiones();
				break;
			case 1:
				MenuPrincipal();
				break;
			case 2:
				System.exit(0);
				break;
			}

		}

	}

}
