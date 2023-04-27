package ilu2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WelcomeTest {
	
	 @Test
	public void test_hello() {
		 Welcome M=new Welcome();
		String prenom = "bob";
        String attendu = "Hello, Bob";
        String actuel = M.welcome(prenom);
        assertEquals(attendu, actuel);
		
	}
}
