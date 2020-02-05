import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class P270_MePilloElToro {
	static Scanner sc;

	public static boolean evaluacion() {
		int numEjercicios = Integer.parseInt(sc.nextLine());
		if (numEjercicios == 0) {
			return false;
		}
		HashMap<String, Integer> notas = new HashMap<String, Integer>();
		for (int i = 0; i < numEjercicios; i++) {
			String nombreAlumno = sc.nextLine();
			String valor = sc.nextLine();
			if (!notas.containsKey(nombreAlumno)) {
				if (valor.equals("CORRECTO")) {
					notas.put(nombreAlumno, 1);
				} else {
					notas.put(nombreAlumno, -1);
				}
			} else {
				if (valor.equals("CORRECTO")) {
					notas.put(nombreAlumno, notas.get(nombreAlumno) + 1);
				} else {
					notas.put(nombreAlumno, notas.get(nombreAlumno) - 1);
				}
			}
		}
		ArrayList<String> notasFinales = new ArrayList<String>();
		notasFinales.addAll(notas.keySet());
		Collections.sort(notasFinales);
		for (int i = 0; i < notasFinales.size(); i++) {
			if (notas.get(notasFinales.get(i)) != 0) {
				System.out.println(notasFinales.get(i) + ", " + notas.get(notasFinales.get(i)));
			}
		}
		System.out.println("---");
		return true;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (evaluacion())
			;
	}
}