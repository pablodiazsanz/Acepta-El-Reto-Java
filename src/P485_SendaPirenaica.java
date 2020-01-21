import java.util.Scanner;

public class P485_SendaPirenaica {
	static Scanner sc;

	public static boolean distancia() {
		int numEtapas = sc.nextInt();
		if (numEtapas == 0) {
			return false;
		}
		int[] distEtapas = new int[numEtapas];
		int distTotal = 0;
		for (int i = 0; i < distEtapas.length; i++) {
			distEtapas[i] = sc.nextInt();
			distTotal += distEtapas[i];
		}
		int[] distEtapasFinal = new int[numEtapas];
		distEtapasFinal[0] = distTotal;
		System.out.print(distEtapasFinal[0]);
		for (int i = 1; i < distEtapasFinal.length; i++) {
			distEtapasFinal[i] = distTotal - distEtapas[i - 1];
			distTotal = distEtapasFinal[i];
			System.out.print(" " + distEtapasFinal[i]);
		}
		System.out.println();
		return true;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (distancia())
			;
	}
}