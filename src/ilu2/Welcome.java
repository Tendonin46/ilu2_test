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
            
            if (noms.length == 2) {
            	chaine.append(prenom.substring(0, 1).toUpperCase());
    		    chaine.append(prenom.substring(1));
            }
            
            else {
                for (int i = 0; i < noms.length; i++) {
                    chaine.append(" ").append(noms[i].trim());
                    if (i == noms.length - 2) {
                        chaine.append(", and");
                    }
                    else if (i < noms.length - 1) {
                        chaine.append(",");
                    }
                }
            }
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