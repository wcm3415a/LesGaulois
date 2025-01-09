package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le romain " + getNom() + ":" + texte);
	}

	public void recevoirCoup(int coup) {
		force = force - coup;
		if (force > 0) {
			System.out.println("Le romain " + getNom() + ": Aie ! ");
		} else {
			System.out.println("Le romain " + getNom() + ": J'abandonne... ");
			force = 0;
		}
	}

}
