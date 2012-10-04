public class Probleme_1 {

	public static void main(String[] args) {

		naturalNumber(1000);
	}

	public static void naturalNumber(int limit) {
		int somme = 0;
		for (int i = 1; i < limit; i++) {

			if (((i % 3) == 0) || ((i % 5) == 0)) {
				somme = somme + i;
			}
		}
		System.out.println(somme);
	}
}