import java.util.Scanner;

public class P216_Goteras {
	static Scanner sc;

	public static void casoDePrueba() {
		int segundos = sc.nextInt();
		int minutos, horas;
		if (segundos < 60) {
			System.out.printf("00:00:%02d\n", segundos);
		} else if (segundos > 60 && segundos < 3600) {
			minutos = segundos / 60;
			segundos = segundos - (60 * minutos);
			System.out.printf("00:%02d:%02d\n", minutos, segundos);
		} else {
			horas = segundos / 3600;
			minutos = (segundos / 60) - (60 * horas);
			segundos = segundos - (60 * minutos + 3600 * horas);
			System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
		}

	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numCasos = sc.nextInt();
		for (int i = 0; i < numCasos; i++) {
			casoDePrueba();
		}
	}
}