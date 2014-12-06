package algorithm;

/**
 * Created by macbook on 06.12.14.
 */
public final class numberTheory {
	private static int result;

	private numberTheory () {
	}

	public static int phi (int chislo) {
		//Eller function - вычисление функции Eллера
		result = chislo;
		for (int i = 2; i * i <= chislo; ++i)
			if (chislo % i == 0) {
				while (chislo % i == 0)
					chislo /= i;
				result = result - (result / i);
			}
		if (chislo > 1)
			result = result - (result / chislo);
		return result;
	}

	public static int nod (int a, int b) {
		// Алгоритм Евклида - для нахождения наибольшего общего делителя
		int temp;
		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int nok (int a, int b) {
		// наименьшее общее кратное - используя наибольший общий делитель
		return a * b / nod(a, b);
	}
}
