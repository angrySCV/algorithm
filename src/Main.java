import static algorithm.numberTheory.*;

public class Main {
	public static void main (String[] args) {
		//Scanner scanner = new Scanner(System.in);
//		int chislo = scanner.nextInt();
//		int res = phi(chislo);
		System.out.println(nod(25, 40) + " nok: " + nok(25, 40));
		System.out.println(primeNumber(20));
		System.out.println(fastPow(5, 8));
		int massivChisel[] = reshetoEratosfena(40000);
		for (int i = 0; i < massivChisel.length; i++) {
			if (massivChisel[i] == 0) continue;
			System.out.println(massivChisel[i]);
		}
	}
}
