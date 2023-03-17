import java.lang.reflect.Method;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang.ArrayUtils;//interesante identificar n�mero elemento matriz
import org.omg.CORBA.PUBLIC_MEMBER;

public class MenuConversorEnergias extends MenuPrincipal {

	public static double importe;

	public static void main(String[] args) {

	}

	public static void MenuEnergias() {
		String[] opcionesMenuConversorEnergia = {
				"kilowatt-hora (kWh) \u25B6 kilocalor�a (kcal)",
				"kilowatt-hora (kWh) \u25B6 unidad termal brit�nica (BTU)",
				"kilowatt-hora (kWh) \u25B6 kilojoule (kJ)",
				"kilocalor�a (kcal) \u25B6 kilowatt-hora (kWh)", 
				"unidad termal brit�nica (BTU) \u25B6 kilowatt-hora (kWh)",
				"kilojoule (kJ) \u25B6 kilowatt-hora (kWh)", 
				"Regresar al MEN� PRINCIPAL" };
		String opcionConversion = (String) JOptionPane.showInputDialog(null,
				"Seleccione una opci�n o CANCELAR para salir.", "Conversor de energ�as ALURA", JOptionPane.PLAIN_MESSAGE,
				null, opcionesMenuConversorEnergia, opcionesMenuConversorEnergia[0]);// opci�n por defecto seleccionada de
																					// la matriz

		if (opcionConversion == opcionesMenuConversorEnergia[6]) {
			MenuPrincipal();
		}
		if (opcionConversion == null) {
			System.exit(0);
		}

		if (opcionConversion != opcionesMenuConversorEnergia[6]) {

			// ingreso de la suma a convertir
			JFrame frame1 = new JFrame();
			String importe = JOptionPane.showInputDialog(frame1, "Ingrese la cantidad a convertir...", opcionConversion,
					JOptionPane.QUESTION_MESSAGE);

			// el ingreso es valor numerico?
			String regex = "([0-9]+)(.*)";
			if (importe.matches(regex) == false) {

				JFrame f = new JFrame();
				JOptionPane.showMessageDialog(f, "Ingrese un dato num�rico.");
				MenuEnergias();
			}

			ConversorEnergias.Convertir(ArrayUtils.indexOf(opcionesMenuConversorEnergia, opcionConversion) + 1,
					Double.parseDouble(importe));

			double mensajeEgreso;

			mensajeEgreso = ConversorEnergias.egreso;
			mensajeEgreso = Math.round((ConversorEnergias.egreso * 10000)) / 10000.0;

			// mensajeEgreso=ConversorDivisas.egreso;
			JFrame frame2 = new JFrame();
			JOptionPane.showMessageDialog(frame2,
					importe + " " + ConversorEnergias.unidadIngreso + " " + "equivalen a " + mensajeEgreso + " "
							+ ConversorEnergias.unidadEgreso,
					"La conversi�n solicitada es...", JOptionPane.INFORMATION_MESSAGE);

			String[] options = new String[] { "Nueva conversi�n", "MENU PRINCIPAL", "Cancelar" };
			int response = JOptionPane.showOptionDialog(null, "Seleccione una opci�n o CANCELAR para salir",
					"Conversor m�ltiple ALURA", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options,
					options[0]);
			switch (response) {
			case 0:
				MenuEnergias();
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
