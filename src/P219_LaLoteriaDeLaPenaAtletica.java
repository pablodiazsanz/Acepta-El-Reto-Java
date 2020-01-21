import java.util.Scanner;

public class P219_LaLoteriaDeLaPenaAtletica {
	static Scanner sc;
	public static void casoDePrueba() {
		int numDecimos = sc.nextInt();
		int[] listaDecimos = new int[numDecimos];
		int decimo = 0;
		for (int i = 0; i < listaDecimos.length; i++) {
			listaDecimos[i] = sc.nextInt();
			if (listaDecimos[i] % 2 == 0) {
				decimo++;
			}
		}
		System.out.println(decimo);
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			casoDePrueba();
		}
	}
}
