package ilu2;

public class Welcome {
	public static String welcome(String prenom) {
		StringBuilder chaine = new StringBuilder("Hello, ");
		
		if (prenom == null || prenom.trim().isEmpty()) {
	        return "Hello, my friend";
	    }
		
		if (prenom.equals(prenom.toUpperCase())) {
            return "HELLO, " + prenom + "!";
        }
		if (prenom.contains(",")) {
            String[] noms =prenom.split(",");
            String nom1 = noms[0].trim();
            String nom2 = noms[1].trim();
            chaine.append(nom1.substring(0, 1).toUpperCase() + nom1.substring(1)).append(", ").append(nom2.substring(0, 1).toUpperCase() + nom2.substring(1));
            return chaine.toString();
		}
		else {
		    chaine.append(prenom.substring(0, 1).toUpperCase());
		    chaine.append(prenom.substring(1));
		    return chaine.toString();
	    }
	     

	}

	public static void main (String[] args) {
		System.out.println(welcome("amy,bob"));
	}
}
