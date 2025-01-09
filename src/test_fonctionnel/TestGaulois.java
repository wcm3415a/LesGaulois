package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	//main A
	public static void main(String[] arg) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom()); 
	}
}
