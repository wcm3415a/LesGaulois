package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	// main A
	public static void main(String[] arg) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix.getNom());

		Romain minus = new Romain("Minus", 6);
		System.out.println(minus.getNom());

		minus.parler(" UN GAU... UN GAUGAU... ");

		/*
		 * for (int i = 0; i<2; i++) { minus.recevoirCoup(3); }
		 */
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}

	}
}
