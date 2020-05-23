package uvsq.pglp_4_1.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class PersonnelTest extends TestCase {
	

		
		
		/**
		 * tester le constructeur.
		 */
		@Test
		public void testConstructeur() {
			ArrayList<NumTel> numeros = new ArrayList<NumTel>();
	    	numeros.add(new NumTel("Num mobile","06.82.17.75.44"));
	    	numeros.add(new NumTel("Num fixe","01.18.22.17.45"));
	    	assertEquals("06.82.17.75.44", numeros.get(0).getNumero());
	    	assertEquals(" Num mobile", numeros.get(0).getInformations());
	        Personnel p = new Personnel.Builder("Said", "Seghir","directeur", LocalDate.of(1997, 04, 22), numeros).build();
	        p.afficher();
	       
		}

}
