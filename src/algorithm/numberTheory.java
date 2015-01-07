package algorithm;

/**
 * Created by AngrySCV on 06.12.14.
 * https://github.com/angrySCV
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
		return a / nod(a, b) * b; // для исключения переполнения при перемножении, в начале идет деление на первый элемент потом домножаем на второй
	}

	public static int primeNumber (int a) {
		// очень простенькая генерация большого простого числа на основе перемножения всех множетелей
		// до требуемого числа и вычитания еденицы, что гарантирует не делимость на эти числа
		// во множетели включается много не простых чисел, это плохо - но зато алгоритм очень просто реализуется
		int prime = 1;
		for (int i = 2; i < a; i++) {
			prime = prime * i;
		}
		return prime - 1;
	}

	public static int fastPow (int chislo, int n) {
		// быстрое возведение в степень за LOG(N)
		int solution = 1;
		while (n != 0) {
			if ((n & 1) == 0) {
				chislo *= chislo;
				n = n >> 1;
			} else {
				solution *= chislo;
				n -= 1;

			}
		}
		return chislo;
	}
}
