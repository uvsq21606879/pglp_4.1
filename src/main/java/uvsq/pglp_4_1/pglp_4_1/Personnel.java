package uvsq.pglp_4_1.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel implements Hierarchie  {
	
	private final String Nom;
	private final String Prenom;
	private final String Fonction;
	private final LocalDate DateNaissance;
	private final ArrayList<NumTel> NumeroTel;
	
	
	public void afficher() {
		System.out.println(this.Nom + " " + this.Prenom + ": \nfonction: " 
		+ this.Fonction + "\ndate de naissance: "+this.DateNaissance + "\n");	
	}
	
	public static class Builder{
		private final String Nom;
		private final String Prenom;
		private final String Fonction;
		private final LocalDate DateNaissance;
		private final ArrayList<NumTel> NumeroTel;
		
		
		public Builder(String Nom, String Prenom, String Fonction, LocalDate DateNaissance ) {
			this.Nom=Nom;
			this.Prenom=Prenom;
			this.Fonction=Fonction;
			this.DateNaissance=DateNaissance;
			this.NumeroTel= new ArrayList<NumTel>();
		}
		
		public Builder NumeroTel(NumTel numero) {
			this.NumeroTel.add(numero);
			return this;
		}
	}
	
	private Personnel(Builder builder) {
		this.Nom=builder.Nom;
		this.Prenom=builder.Prenom;
		this.Fonction=builder.Fonction;
		this.DateNaissance=builder.DateNaissance;
		this.NumeroTel=builder.NumeroTel;
	}

}
