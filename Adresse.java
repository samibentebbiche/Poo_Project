//( "//" sami comments , "/* */" hind comments )
public class Adresse { // une classe pour adresse pour crée un type adresse pour les attribut des autre classe /* i agree*/
	private int numeroDeRue;/*préférable nommer NumRue*/
	private String nomDeRue;/*nommer NomRue*/
	private long codePostal;/* i agree */
	private String ville;/* not necessary , since you used CodePostal */
	
	// constructeur pour la classe Adresse 
	/* class adresse does not inherit any other classe , so u can delete the super() of Adresse constructor*/
	
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
	/* NumRue getter and setter : Check */
	public int getNumeroDeRue() {
		return numeroDeRue;
	}
	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}
	
	//getter et setter pour nomRue
	/* NomRue getter and setter : Check */
	
	public String getNomDeRue() {
		return nomDeRue;
	}
	public void setNomDeRue(String nomDeRue) {
		this.nomDeRue = nomDeRue;
	}
	
	//getter et setter pour codePosttal
	/* CodePostal getter and setter : Check */
	
	public long getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(long codePostal) {
		this.codePostal = codePostal;
	}
	
	//getter et setter pour ville
	/* ville getter and setter : Check */
	
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	

}
