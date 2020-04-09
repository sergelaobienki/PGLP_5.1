package PGLP_5.PGLP5_1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Personnels implements InterfacePersonnels, Serializable{
	/**
	 * a version d’un classe pour la sérialisation 
	 */
	//private static final long serialVersionUID = 1L;
	/**
	 * parametre obligatoire
	 */
	private final String nom;
	private final String prenom;
	private final int Id;//new
	
	/**
	 * parametre optionel
	 */
	private final LocalDate dateDeNaissance;
	private final ArrayList<Integer> numTel;
	
	public static class Builder{
		
		/**
		 * parametre obligatoire
		 */
		private final String nom;
		private final String prenom;
		private final int Id;//new
		/**
		 * parametre optionel
		 */
		private LocalDate dateDeNaissance;
		private ArrayList<Integer> numTel;
		
		public Builder(String nom, String prenom, int Id) {
			this.nom=nom;
			this.prenom=prenom;
			this.Id=Id;
			
		}
		
		public Builder dateDeNaissance(int anne,int mois,int jour) {
			this.dateDeNaissance= LocalDate.of(anne, mois, jour);
			return this;
			
		}
		
		public Builder numTel(int numTel) {
			this.numTel.add(numTel);
			return this;
			
		}
		
		public Personnels build() {
			return new Personnels(this);
			
		}
		
		
	}
	
	private Personnels(Builder builder) {
		//Obligatoire
		this.nom=builder.nom;
		this.prenom=builder.prenom;
		this.Id=builder.Id;//new
		//optionel
		this.dateDeNaissance=builder.dateDeNaissance;
		this.numTel=builder.numTel;
		
	}
	/**
	 * Affichage des informations du personnel
	 */
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("l'identifiant du personnel :"+this.Id+" "+this.nom+" "+this.prenom);
	}
	
	
	
	@Override
	public String toString() {
		return ", Id=" + Id +"Personnels [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", numTel=" + numTel + "]";
	}
	/*public String toString(){
		  String str = "\t je suis un Personnel ID ==>> " + this.Id;
		  return str;
	}*/
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getId() {
		return Id;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public ArrayList<Integer> getNumTel() {
		return numTel;
	}
	

}