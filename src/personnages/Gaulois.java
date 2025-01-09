package personnages;

public class Gaulois {
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force){
		this.nom  = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le gaulois " + getNom() + ":" + texte );
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(getNom() + " envoie un grand coup dans la mâchoire de "+ nomRomain);
		romain.recevoirCoup(force/3);
	}
	 
	//main C
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom()); 
		asterix.parler(" Bonjour à tous ");
	}
}
