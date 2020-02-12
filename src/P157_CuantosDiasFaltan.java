import java.util.Scanner;

public class P157_CuantosDiasFaltan {
	static Scanner sc;

	public static void dias() {
		int[] diaMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int dia = sc.nextInt();
		int mes = sc.nextInt();
		int diasMesTotales = 0;
		int diasTotales = 0;
		for (int i = 0; i < diaMes.length; i++) {
			if (mes - 1 < i) {
				diasMesTotales += diaMes[i];
			}
			if (mes - 1 == i) {
				diasTotales = diaMes[i] - dia;
			}
		}
		System.out.println(diasMesTotales + diasTotales);
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			dias();
		}
	}
}
