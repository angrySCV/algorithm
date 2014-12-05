package algorithm;

/**
 * Created by macbook on 06.12.14.
 */
public final class numberTheory {
	private static int result;

	private numberTheory () {
	}

	public static int phi (int chislo) {
		//Eller function
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
}
