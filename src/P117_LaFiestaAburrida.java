import java.util.Scanner;

public class P117_LaFiestaAburrida {
	static Scanner sc;

	public static void nombres() {
		String soyNombre = sc.nextLine();
		String nombre = soyNombre.substring(4, soyNombre.length());
		System.out.println("Hola, " + nombre + ".");
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {
			nombres();
		}
	}
}
