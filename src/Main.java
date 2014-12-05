import java.util.Scanner;

import static algorithm.numberTheory.phi;

public class Main {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chislo = scanner.nextInt();
		int res = phi(chislo);
		System.out.println(res);
	}
}
