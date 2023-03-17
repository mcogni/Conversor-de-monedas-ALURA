class ConversorEnergias extends MenuConversorEnergias {

	public static double ingreso;// suma a convertir
	public static double egreso;// suma convertida
	public static int seleccion;// opcion de conversion
	public static double factor;// egreso=ingreso/factor
	public static String unidadIngreso;
	public static String unidadEgreso;

	private static double kcal;// kcal kwh equivalentes a 1kcal
	private static double btu;// E
	private static double kj;//
	
	public static void main(String[] args) {

	}

	public static void Convertir(int seleccion, double ingreso) {

		setkcal(0.001163);
		setbtu(0.0002931);
		setkj(0.0002777778 );
		
		switch (seleccion) {
		case 1:
			setFactor(kcal);
			setUnidadEgreso("kcal");// peso arg a kcal,
			break;
		case 2:
			setFactor(btu);
			setUnidadEgreso("BTU");//
			break;
		case 3:
			setFactor(kj);
			setUnidadEgreso("kJ");//
			break;
		
		// casos 4 a 6 operaciones inversas
		case 4:
			setFactor(1 / kcal);
			setUnidadIngreso("kcal");// peso arg a kcal
			break;
		case 5:
			setFactor(1 / btu);
			setUnidadIngreso("BTU");//
			break;
		case 6:
			setFactor(1 / kj);
			setUnidadIngreso("kJ");//
			break;
		
		}

		if (seleccion <= 3) {
			setUnidadIngreso("kWh");
		}
		if (seleccion > 3) {
			setUnidadEgreso("kWh");
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
		ConversorEnergias.ingreso = ingreso;
	}

	public static double getEgreso() {
		return egreso;
	}

	public static void setEgreso(double egreso) {
		ConversorEnergias.egreso = egreso;
	}

	public static int getSeleccion() {
		return seleccion;
	}

	public static void setSeleccion(int seleccion) {
		ConversorEnergias.seleccion = seleccion;
	}

	public static double getFactor() {
		return factor;
	}

	public static void setFactor(double factor) {
		ConversorEnergias.factor = factor;
	}

	public static double getkcal() {
		return kcal;
	}

	public static void setkcal(double kcal) {
		ConversorEnergias.kcal = kcal;
	}

	public static double getbtu() {
		return btu;
	}

	public static void setbtu(double btu) {
		ConversorEnergias.btu = btu;
	}

	public static double getkj() {
		return kj;
	}

	public static void setkj(double kj) {
		ConversorEnergias.kj = kj;
	}

	


	public static String getUnidadIngreso() {
		return unidadIngreso;
	}

	public static void setUnidadIngreso(String unidadIngreso) {
		ConversorEnergias.unidadIngreso = unidadIngreso;
	}

	public static String getUnidadEgreso() {
		return unidadEgreso;
	}

	public static void setUnidadEgreso(String unidadEgreso) {
		ConversorEnergias.unidadEgreso = unidadEgreso;
	}

}
