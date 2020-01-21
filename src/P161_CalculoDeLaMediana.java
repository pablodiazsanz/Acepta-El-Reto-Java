import java.util.Arrays;
import java.util.Scanner;

public class P161_CalculoDeLaMediana {
	static Scanner sc;

	public static boolean mediana() {
		int entrada = sc.nextInt();
		if (entrada == 0) {
			return false;
		}
		int[] valores = new int[entrada];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		Arrays.sort(valores);
		if (entrada % 2 == 0) {
			double doublePar = (valores[(valores.length / 2)] + valores[(valores.length / 2) - 1]);
			int par = (int) doublePar;
			System.out.println(par);
		} else {
			int impar = (valores[valores.length / 2]) * 2;
			System.out.println(impar);
		}
		return true;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (mediana())
			;
	}
}
