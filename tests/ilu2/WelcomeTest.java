package ilu2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WelcomeTest {
	
	private Welcome M;
	
	@BeforeEach
	public void initialiserSituation() {
		Welcome M=new Welcome();
	}
	
//	@Test
//	public void test_2noms_virgule() {
//		String prenom ="amy,bob";
//		String attendu ="Hello, Amy,bob";
//		String actuel = M.welcome(prenom);
//		assertEquals(attendu, actuel);
//		assertEquals("Hello, Frank,max",M.welcome("frank,max"));
//	}
	 @Test
	public void test_hello() {
		String prenom = "bob";
        String attendu = "Hello, Bob";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
        assertEquals("Hello, John",M.welcome("john"));
        assertEquals("Hello, Bjorn",M.welcome("bjorn"));
	}
	@Test
	public void test_hello_null() {
		String prenom = null;
        String attendu = "Hello, my friend";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
	}
	
	@Test
	public void test_hello_chaine_vide() {
		String prenom = "";
        String attendu = "Hello, my friend";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
	}
	
	@Test
	public void test_hello_blanche() {
		String prenom ="      ";
        String attendu = "Hello, my friend";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
	}
	
	@Test
	public void test_hello_CRI() {
		String prenom ="JERRY";
        String attendu = "HELLO, JERRY!";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
        assertEquals("HELLO, YVAN!",M.welcome("YVAN"));
	}
	
	
	@Test
	public void test_plusieurs_noms() {
		String prenom ="amy, bob, jerry";
		String attendu ="Hello, Amy, Bob and Jerry";
		String actuel = M.welcome(prenom);
		assertEquals(attendu, actuel);
		assertEquals("Hello, Amy, Bob, Jerry and Vinn", M.welcome("amy, bob, jerry,vinn"));
		assertEquals("Hello, Amy, Bob, Jerry, Vinn and Rene", M.welcome("amy, bob, jerry,vinn,rene"));
		
	}
	
	@Test
	public void test_cri_plusieurs_noms() {
		String prenom ="Amy, BOB, Jerry";
		String attendu ="Hello Amy, Jerry.AND HELLO  BOB!";
		String actuel = M.welcome(prenom);
		assertEquals(attendu, actuel);
		assertEquals("Hello, Amy, Jerry,YVES AND HELLO BOB!", M.welcome("Amy, BOB, Jerry,YVES"));
		assertEquals("Hello, Amy, Jerry,YVES,DENIS AND HELLO BOB!", M.welcome("Amy, BOB, Jerry,YVES,DENIS"));
	}
	
	//@Test
	//public void test_ajout_end() {
		//assertEquals("Hello, bob, jerry AND HELLO AMY AND JACK!",M.welcome("bob, AMY, jerry, JACK"));
	//}
	@Test
	public void test_espaces_inutiles() {
		assertEquals("Hello, Amy and Bob", M.welcome("amy,          bob"));
		assertEquals("Hello, Amy, Bob and Jerry", M.welcome("amy,        bob, jerry"));
		assertEquals("Hello, Amy, Bob, Jerry and John", M.welcome("amy, bob,jerry,         john"));
	}
}
