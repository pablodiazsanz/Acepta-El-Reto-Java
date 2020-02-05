import java.util.HashSet;
import java.util.Scanner;

public class P416_MichaelJFoxYelPatoDonald {
	static Scanner sc;

	public static boolean cumples() {
		boolean repetido = false;
		int cantidadCumples = sc.nextInt();
		if (cantidadCumples == 0) {
			return false;
		}
		String[] fechas = new String[cantidadCumples];
		for (int i = 0; i < fechas.length; i++) {
			fechas[i] = sc.next();
			fechas[i] = fechas[i].substring(0, fechas[i].length() - 5);
		}
		HashSet<String> fechasRepetidas = new HashSet<String>();
		for (int i = 0; i < fechas.length; i++) {
			if (fechasRepetidas.contains(fechas[i])) {
				repetido = true;
			} else {
				fechasRepetidas.add(fechas[i]);
			}
		}
		if (repetido) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		return true;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (cumples())
			;
	}
}
