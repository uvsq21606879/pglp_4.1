package uvsq.pglp_4_1.pglp_4_1;

import java.util.ArrayList;

public class GroupePersonnel implements Hierarchie {
	
	private ArrayList<Hierarchie> Personnel = new ArrayList<Hierarchie>();
	
	
	public void afficher() {
		for(Hierarchie i : Personnel) {
			i.afficher();
		}
	}
	
	
	public void ajouter(Hierarchie Personnel) {
		this.Personnel.add(Personnel);
	}
	
	
	public void retirer(Hierarchie Personnel) {
		this.Personnel.remove(Personnel);
	}
	
	public int getSizeGroupe() {
		return this.Personnel.size();
	}
	
}
