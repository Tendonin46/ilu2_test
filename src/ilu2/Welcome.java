package ilu2;

public class Welcome {
	public static String welcome(String prenom) {
		StringBuilder chaine = new StringBuilder();
	    chaine.append("Hello, ");
	    chaine.append(prenom.substring(0, 1).toUpperCase());
	    chaine.append(prenom.substring(1));
	    return chaine.toString();
	}

	public static void main (String[] args) {
		System.out.println(welcome("bob"));
	}
}
