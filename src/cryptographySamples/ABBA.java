package cryptographySamples;

//Fail
public class ABBA {

	public static String canObtain(String initial, String target){
		
		initial = initial.toLowerCase();
		target = target.toLowerCase();
	 	final String POSSIBLE = "Possible";
	    final String IMPOSSIBLE = "Impossible";
	    String result = IMPOSSIBLE;
	    
	    if(initial.length()<1 || initial.length()>999){
	     	return IMPOSSIBLE;   
	    }
	    if(target.length()<2 || target.length()>1000){
	    	return IMPOSSIBLE;
	    }
	    if(target.length()<=initial.length()){
	     	return IMPOSSIBLE;   
	    }
	    for(int i = 0; i<initial.length();i++){
	    	if(!String.valueOf(initial.charAt(i)).equals("a") || !String.valueOf(initial.charAt(i)).equals("b")){
	    		return IMPOSSIBLE;
	    		}
	    }
	   
	    
	    int targetLength = target.length();
	    StringBuilder testString = new StringBuilder();
	    for(int i = 0; i<targetLength;i++){
	    	if(testString.length()==0){
	    	testString.append(initial);
	    	}
	    	testString.append("a");
	    	if(testString.toString().equals(target)){
	    		result = POSSIBLE;
	    		break;
	    	}
	    	testString.reverse();
	    	testString.append("b");
	    	if(testString.toString().equals(target)){
	    		result = POSSIBLE;
	    		break;
	    	}
	    }
	    
	    return result;
	}
	
	public static void main(String[] args){
		System.out.println(canObtain("BBBBABABBBBBBA","BBBBABABBABBBBBBABABBBBBBBBABAABBBAA"));
	}
	
}
