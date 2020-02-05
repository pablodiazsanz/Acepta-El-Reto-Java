import java.util.HashMap;
import java.util.Scanner;

public class P214_AbdicacionDeUnRey {
	static Scanner sc;

	public static boolean reyes() {
		int numReyes = sc.nextInt();
		if (numReyes == 0) {
			return false;
		}
		HashMap<String, Integer> sucesion = new HashMap<String, Integer>();
		for (int i = 0; i < numReyes; i++) {
			String rey = sc.next();
			if (!sucesion.containsKey(rey)) {
				sucesion.put(rey, 1);
			} else {
				sucesion.put(rey, sucesion.get(rey) + 1);
			}
		}
		int sucesionReyes = sc.nextInt();
		for (int i = 0; i < sucesionReyes; i++) {
			String reySucesion = sc.next();
			if (sucesion.containsKey(reySucesion)) {
				sucesion.put(reySucesion, sucesion.get(reySucesion)+1);
				System.out.println(sucesion.get(reySucesion));
			} else {
				sucesion.put(reySucesion, 1);
				System.out.println(sucesion.get(reySucesion));
			}
		}
		System.out.println();
		return true;
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		while (reyes())
			;
	}
}
