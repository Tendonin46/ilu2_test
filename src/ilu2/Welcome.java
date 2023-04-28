package ilu2;

public class Welcome {
	public static String welcome(String prenom) {
		StringBuilder chaine = new StringBuilder("Hello, ");
		boolean yodaPresent = false;
		int x=0;
		
		if (prenom == null || prenom.trim().isEmpty()) {
	        return "Hello, my friend";
	    }
		
		boolean b = false;
		String[] tab=prenom.split(",");
		
		for(int j=0;j<tab.length;j++) {
			 if(tab[j].equalsIgnoreCase("yoda")) {
		        	yodaPresent = true;
		     }
	        if (tab[j].equals(tab[j].toUpperCase())) {
	        	b=true;x++;
	        }
	       
	       
		}
	
  	
		
		if (prenom.equals(prenom.toUpperCase())) {
            return "HELLO, " + prenom + "!";
        }
		if (prenom.contains(",")&&!b) {
            
			 StringBuilder sb = new StringBuilder();
			    String[] arr = prenom.split(",");
			    for (int i = 0; i < arr.length; i++) {
			        String name = arr[i].trim();
			        if (i == arr.length - 1 && i > 0) {
			            sb.append(" and ");
			        } else if (i > 0) {
			            sb.append(", ");
			        }
			        sb.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1).toLowerCase());
			    }
			    return chaine + sb.toString();
        
		}
		
		if(prenom.contains(",")&&b) {
			String[] noms = prenom.split(", ");
		    StringBuilder s1 = new StringBuilder("Hello");
		    StringBuilder s2 = new StringBuilder("AND HELLO ");
		    
		    if(x<2) {
		    	for (int i = 0; i < noms.length; i++) {
			        String name = noms[i].trim();
			        if (name.equals(name.toUpperCase())) {
			            s2.append(" ").append(name).append("!");
			        } else {
			            s1.append(" ").append(name);
			            if (i < noms.length - 1) {
			                s1.append(",");
			            }
			        }
			    }
			    s1.append(".");
			    return s1.toString() + s2.toString();
		    }
		    else {		    	   	    	    
		    	    for (int i = 0; i < noms.length; i++) {
		    	        String name = noms[i];
		    	        if (name.toUpperCase().equals(name)) {
		    	            s2.append(name).append(" AND ");
		    	        } else {
		    	            s1.append(", ").append(name);
		    	           
		    	        }
		    	    }

		    	    s1.append(" ").append(s2).append("!");
		    	    int lastIndex = s1.lastIndexOf(" AND ");
		    	    s1.delete(lastIndex, lastIndex + " AND ".length());
		    	    return s1.toString();
		    	    
		    }
			
		}
		
		else {
		    chaine.append(prenom.substring(0, 1).toUpperCase());
		    chaine.append(prenom.substring(1));
		    return chaine.toString();
	    }

	}

	public static void main (String[] args) {
		System.out.println(welcome("bob, yoda, amy, JERRY"));
	}
}