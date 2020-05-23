package uvsq.pglp_4_1.pglp_4_1;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import uvsq.pglp_4_1.pglp_4_1.Personnel.Builder;

public class GroupePersonnelTest {

	@Test
	public void groupePersonnelTest() {
		ArrayList<NumTel> numeros1 = new ArrayList<NumTel>();
		numeros1.add(new NumTel("Num mobile","06.82.17.75.44"));
		numeros1.add(new NumTel("fixe", "0171636879"));
		Builder p1 = new Builder("Said", "seghir", "devlopper", LocalDate.of(1997, 4, 10),numeros1);
		Personnel devlopper = p1.build();

		ArrayList<NumTel> numeros2 = new ArrayList<NumTel>();
		numeros2.add(new NumTel("telportable", "0771696279"));
		numeros2.add(new NumTel("fixe", "0187636879"));
		Builder p2 = new Builder("camille", "lelouche", "secretaire", LocalDate.of(1994, 5, 1),numeros2);
		Personnel secretarie = p2.build();

		ArrayList<NumTel> numeros3 = new ArrayList<NumTel>();
		numeros3.add(new NumTel("telportable", "0772796279"));
		numeros3.add(new NumTel("fixe", "0181537879"));
		Builder p3 = new Builder("Thomas", "Muller", "manager", LocalDate.of(1984, 11, 12),numeros3);
		Personnel manager = p3.build();

		ArrayList<NumTel> numeros4 = new ArrayList<NumTel>();
		numeros4.add(new NumTel("telportable", "0661436924"));
		numeros4.add(new NumTel("fixe", "0181626279"));
		Builder p4 = new Builder("Maurice", "Fabien", "Chomeur", LocalDate.of(1994, 1, 28),numeros4);
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
		assertEquals(2, Grp1.getSizeGroupe());

		Grp2.ajouter(manager);
		Grp2.ajouter(secretarie);

		assertEquals(2, Grp1.getSizeGroupe());

		Grp1.retirer(chomeur);

		assertEquals(1, Grp1.getSizeGroupe());

		Grp2.ajouter(chomeur);

		assertEquals(3, Grp2.getSizeGroupe());


		Entreprise.afficher();
	}

}
