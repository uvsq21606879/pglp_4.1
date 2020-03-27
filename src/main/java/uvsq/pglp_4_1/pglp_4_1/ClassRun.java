package uvsq.pglp_4_1.pglp_4_1;

import uvsq.pglp_4_1.pglp_4_1.Personnel.Builder;
import java.time.LocalDate;

public enum ClassRun {

	Entreprise;

	public void run() {

		Builder p1 = new Builder("Said", "seghir", "devlopper", LocalDate.of(1997, 4, 10));
		NumTel num1 = new NumTel("fixe", "0681636879");
		p1.NumeroTel(num1);
		Personnel devlopper = p1.build();

		Builder p2 = new Builder("camille", "lelouche", "secretaire", LocalDate.of(1994, 5, 1));
		NumTel num2 = new NumTel("telportable", "0771696279");
		p2.NumeroTel(num2);
		Personnel secretarie = p2.build();

		Builder p3 = new Builder("Thomas", "Muller", "manager", LocalDate.of(1984, 11, 12));
		NumTel num3 = new NumTel("fixe", "0131436929");
		p3.NumeroTel(num3);
		Personnel manager = p3.build();

		Builder p4 = new Builder("Maurice", "Fabien", "Chomeur", LocalDate.of(1994, 1, 28));
		NumTel num4 = new NumTel("telportable", "0661436924");
		p4.NumeroTel(num4);
		Personnel chomeur = p4.build();

		GroupePersonnel Grp1 = new GroupePersonnel();
		GroupePersonnel Grp2 = new GroupePersonnel();
		GroupePersonnel Entreprise = new GroupePersonnel();

		Entreprise.ajouter(devlopper);
		Entreprise.ajouter(chomeur);
		Entreprise.ajouter(manager);
		Entreprise.ajouter(secretarie);

		Grp1.ajouter(devlopper);
		Grp1.ajouter(chomeur);

		Grp2.ajouter(manager);
		Grp2.ajouter(secretarie);

		Entreprise.afficher();

	}

	public static void main(String arg[]) {

		Entreprise.run();
	}

}
