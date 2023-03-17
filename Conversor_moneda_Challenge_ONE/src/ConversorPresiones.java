class ConversorPresiones extends MenuConversorPresiones {

	public static double ingreso;// suma a convertir
	public static double egreso;// suma convertida
	public static int seleccion;// opcion de conversion
	public static double factor;// egreso=ingreso/factor
	public static String unidadIngreso;
	public static String unidadEgreso;

	private static double psi;// psi=mpa equivalentes a 1psi
	private static double mmhg;// E
	private static double kgfcm;//
	
	public static void main(String[] args) {

	}

	public static void Convertir(int seleccion, double ingreso) {

		setpsi(0.00690095);
		setmmhg(0.00013);
		setkgfcm(0.09807);
		
		switch (seleccion) {
		case 1:
			setFactor(psi);
			setUnidadEgreso("psi");// peso arg a psi,
			break;
		case 2:
			setFactor(mmhg);
			setUnidadEgreso("mmHg");//
			break;
		case 3:
			setFactor(kgfcm);
			setUnidadEgreso("kgf/cm2");//
			break;
		
		// casos 4 a 6 operaciones inversas
		case 4:
			setFactor(1 / psi);
			setUnidadIngreso("psi");// peso arg a psi
			break;
		case 5:
			setFactor(1 / mmhg);
			setUnidadIngreso("mmHg");//
			break;
		case 6:
			setFactor(1 / kgfcm);
			setUnidadIngreso("kgf/cm2");//
			break;
		
		}

		if (seleccion <= 3) {
			setUnidadIngreso("MPa");
		}
		if (seleccion > 3) {
			setUnidadEgreso("MPa");
		}

		setEgreso(ingreso / factor);
		
		// System.out.println(ingreso+" "+unidadIngreso+" "+"equivalen a
		// "+(Math.round(egreso*10000))/10000.0+" "+unidadEgreso);
		System.out.println(egreso);
	}

	// getters setters
	public static double getIngreso() {
		return ingreso;
	}

	public static void setIngreso(double ingreso) {
		ConversorPresiones.ingreso = ingreso;
	}

	public static double getEgreso() {
		return egreso;
	}

	public static void setEgreso(double egreso) {
		ConversorPresiones.egreso = egreso;
	}

	public static int getSeleccion() {
		return seleccion;
	}

	public static void setSeleccion(int seleccion) {
		ConversorPresiones.seleccion = seleccion;
	}

	public static double getFactor() {
		return factor;
	}

	public static void setFactor(double factor) {
		ConversorPresiones.factor = factor;
	}

	public static double getpsi() {
		return psi;
	}

	public static void setpsi(double psi) {
		ConversorPresiones.psi = psi;
	}

	public static double getmmhg() {
		return mmhg;
	}

	public static void setmmhg(double mmhg) {
		ConversorPresiones.mmhg = mmhg;
	}

	public static double getkgfcm() {
		return kgfcm;
	}

	public static void setkgfcm(double kgfcm) {
		ConversorPresiones.kgfcm = kgfcm;
	}

	


	public static String getUnidadIngreso() {
		return unidadIngreso;
	}

	public static void setUnidadIngreso(String unidadIngreso) {
		ConversorPresiones.unidadIngreso = unidadIngreso;
	}

	public static String getUnidadEgreso() {
		return unidadEgreso;
	}

	public static void setUnidadEgreso(String unidadEgreso) {
		ConversorPresiones.unidadEgreso = unidadEgreso;
	}

}
