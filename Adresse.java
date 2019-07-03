
public class Adresse { // une classe pour adresse pour crée un type adresse pour les attribut des autre classe
	private int numeroDeRue;
	private String nomDeRue;
	private long codePostal;
	private String ville;
	
	// constructeur pour la classe Adresse 
	
	
	public Adresse(int numeroDeRue, String nomDeRue, long codePostal, String ville) {
		super();
		this.numeroDeRue = numeroDeRue;
		this.nomDeRue = nomDeRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}
	
	//                         les getter et setter
	//                         --------------------
	
	
	// getter et setter pour NumeroDeRue
	
	public int getNumeroDeRue() {
		return numeroDeRue;
	}
	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}
	
	//getter et setter pour nomRue
	
	
	public String getNomDeRue() {
		return nomDeRue;
	}
	public void setNomDeRue(String nomDeRue) {
		this.nomDeRue = nomDeRue;
	}
	
	//getter et setter pour codePosttal
	
	
	public long getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}
	
	//getter et setter pour ville
	
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
