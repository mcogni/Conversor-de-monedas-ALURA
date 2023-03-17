class ConversorDivisas extends MenuConversorDivisas {

	public static double ingreso;// suma a convertir
	public static double egreso;// suma convertida
	public static int seleccion;// opcion de conversion
	public static double factor;// egreso=ingreso/factor
	public static String unidadIngreso;
	public static String unidadEgreso;

	private static double dolar;// USD dolar=cantidad de pesos equivalentes a un dolar
	private static double euro;// EUR
	private static double libra;// GBP
	private static double yen;// JPY
	private static double won;// KRW

	public static void main(String[] args) {

	}

	public static void Convertir(int seleccion, double ingreso) {

		setDolar(199.3759);
		setEuro(212.4854);
		setLibra(239.929);
		setYen(1.4767);
		setWon(0.1515);

		switch (seleccion) {
		case 1:
			setFactor(dolar);
			setUnidadEgreso("USD");// peso arg a dolar,
			break;
		case 2:
			setFactor(euro);
			setUnidadEgreso("EUR");//
			break;
		case 3:
			setFactor(libra);
			setUnidadEgreso("GBP");//
			break;
		case 4:
			setFactor(yen);
			setUnidadEgreso("JPY");//
			break;
		case 5:
			setFactor(won);
			setUnidadEgreso("KRW");//
			break;
		// casos 6 a 10 operaciones inversas
		case 6:
			setFactor(1 / dolar);
			setUnidadIngreso("USD");// peso arg a dolar
			break;
		case 7:
			setFactor(1 / euro);
			setUnidadIngreso("EUR");//
			break;
		case 8:
			setFactor(1 / libra);
			setUnidadIngreso("GBP");//
			break;
		case 9:
			setFactor(1 / yen);
			setUnidadIngreso("JPY");//
			break;
		case 10:
			setFactor(1 / won);
			setUnidadIngreso("KRW");//
			break;
		default:
			break;
		}

		if (seleccion <= 5) {
			setUnidadIngreso("ARS");
		}
		if (seleccion > 5) {
			setUnidadEgreso("ARS");
		}

		setEgreso(ingreso / factor);
		System.out.println(1 / factor);
		System.out.println(seleccion);
		System.out.println(getFactor());

		// System.out.println(ingreso+" "+unidadIngreso+" "+"equivalen a
		// "+(Math.round(egreso*10000))/10000.0+" "+unidadEgreso);
		System.out.println(egreso);
	}

	// getters setters
	public static double getIngreso() {
		return ingreso;
	}

	public static void setIngreso(double ingreso) {
		ConversorDivisas.ingreso = ingreso;
	}

	public static double getEgreso() {
		return egreso;
	}

	public static void setEgreso(double egreso) {
		ConversorDivisas.egreso = egreso;
	}

	public static int getSeleccion() {
		return seleccion;
	}

	public static void setSeleccion(int seleccion) {
		ConversorDivisas.seleccion = seleccion;
	}

	public static double getFactor() {
		return factor;
	}

	public static void setFactor(double factor) {
		ConversorDivisas.factor = factor;
	}

	public static double getDolar() {
		return dolar;
	}

	public static void setDolar(double dolar) {
		ConversorDivisas.dolar = dolar;
	}

	public static double getEuro() {
		return euro;
	}

	public static void setEuro(double euro) {
		ConversorDivisas.euro = euro;
	}

	public static double getLibra() {
		return libra;
	}

	public static void setLibra(double libra) {
		ConversorDivisas.libra = libra;
	}

	public static double getYen() {
		return yen;
	}

	public static void setYen(double yen) {
		ConversorDivisas.yen = yen;
	}

	public static double getWon() {
		return won;
	}

	public static void setWon(double won) {
		ConversorDivisas.won = won;
	}

	public static String getUnidadIngreso() {
		return unidadIngreso;
	}

	public static void setUnidadIngreso(String unidadIngreso) {
		ConversorDivisas.unidadIngreso = unidadIngreso;
	}

	public static String getUnidadEgreso() {
		return unidadEgreso;
	}

	public static void setUnidadEgreso(String unidadEgreso) {
		ConversorDivisas.unidadEgreso = unidadEgreso;
	}

}
