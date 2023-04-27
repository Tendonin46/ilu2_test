package ilu2;

public class Welcome {
	public static String welcome(String prenom) {
		if (prenom == null || prenom.trim().isEmpty()) {
	        return "Hello, my friend";
	    }
		if (prenom.equals(prenom.toUpperCase())) {
            return "HELLO, " + prenom + "!";
        }
		else {
			StringBuilder chaine = new StringBuilder("Hello, ");
		    chaine.append(prenom.substring(0, 1).toUpperCase());
		    chaine.append(prenom.substring(1));
		    return chaine.toString();
	    }
	     

	}

	public static void main (String[] args) {
		System.out.println(welcome("JERRY"));
	}
}
