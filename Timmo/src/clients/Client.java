package clients;

public class Client {

	// int idClient;//Pour ne pas r�inscrire les clients d�j� isncrits (alt.
	// hashCode())
	String nom;

	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	String prenom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
