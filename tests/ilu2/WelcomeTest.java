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
	
	
	 @Test
	public void test_hello() {
		String prenom = "bob";
        String attendu = "Hello, Bob";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
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
	
}
