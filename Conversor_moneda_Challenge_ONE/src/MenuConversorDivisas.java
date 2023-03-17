import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang.ArrayUtils;//interesante identificar n�mero elemento matriz
import org.omg.CORBA.PUBLIC_MEMBER;

public class MenuConversorDivisas extends MenuPrincipal {

	public static double importe;

	public static void main(String[] args) {

	}

	public static void MenuDivisas() {
		String[] opcionesMenuCoversorMoneda = { "peso argentino (ARS) \u25B6 d�lar estadounidense (USD)",
				"peso argentino (ARS) \u25B6 euro (EUR)", "peso argentino (ARS) \u25B6 libra esterlina (GBP)",
				"peso argentino (ARS) \u25B6 yen japon�s (JPY)", "peso argentino (ARS) \u25B6 won surcoreano (WON)",
				"d�lar estadounidense (USD) \u25B6 peso argentino (ARS)", "euro (EUR) \u25B6 peso argentino (ARS)",
				"libra esterlina (GBP) \u25B6 peso argentino (ARS)", "yen japon�s (JPY) \u25B6 peso argentino (ARS)",
				"won surcoreano (WON) \u25B6 peso argentino (ARS)", "Regresar al MEN� PRINCIPAL", };
		String opcionConversion = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opci�n o CANCELAR para salir.", "Conversor de divisas ALURA", JOptionPane.PLAIN_MESSAGE,
				null, opcionesMenuCoversorMoneda, opcionesMenuCoversorMoneda[0]);// opci�n por defecto seleccionada de
																					// la matriz

		if (opcionConversion == opcionesMenuCoversorMoneda[10]) {
			MenuPrincipal();
		}
		if (opcionConversion == null) {
			System.exit(0);
		}

		if (opcionConversion != opcionesMenuCoversorMoneda[10]) {

			// ingreso de la suma a convertir
			JFrame frame1 = new JFrame();
			String importe = JOptionPane.showInputDialog(frame1, "Ingrese el importe a convertir...", opcionConversion,
					JOptionPane.QUESTION_MESSAGE);

			// el ingreso es valor numerico?
			String regex = "([0-9]+)(.*)";
			if (importe.matches(regex) == false) {

				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f, "Ingrese un dato num�rico.");
				MenuDivisas();
			}

			ConversorDivisas.Convertir(ArrayUtils.indexOf(opcionesMenuCoversorMoneda, opcionConversion) + 1,
					Double.parseDouble(importe));

			double mensajeEgreso;

			mensajeEgreso = ConversorDivisas.egreso;
			mensajeEgreso = Math.round((ConversorDivisas.egreso * 10000)) / 10000.0;

			// mensajeEgreso=ConversorDivisas.egreso;
			JFrame frame2 = new JFrame();
			JOptionPane.showMessageDialog(frame2,
					importe + " " + ConversorDivisas.unidadIngreso + " " + "equivalen a " + mensajeEgreso + " "
							+ ConversorDivisas.unidadEgreso,
					"La conversi�n solicitada es...", JOptionPane.INFORMATION_MESSAGE);

			String[] options = new String[] { "Nueva conversi�n", "MENU PRINCIPAL", "Cancelar" };
			int response = JOptionPane.showOptionDialog(null, "Seleccione una opci�n o CANCELAR para salir",
					"Conversor m�ltiple ALURA", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
					options[0]);
			switch (response) {
			case 0:
				MenuDivisas();
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
