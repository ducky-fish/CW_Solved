public class Main {
	public static void main(String[] args){
		tester();
	}

	public static void tester(){
	String Test_Case = "testing please all caps babe";
  	System.out.print(toJadenCase(Test_Case));
	}

	public static String toJadenCase(String phrase) {
	  //Phrase_Count is an int for the input length
    //Cap_String is our version of phrase that we'll be changing
  int Phrase_Count = phrase.length();
  String Cap_String = phrase;

    //If our string length is greater than 0 we want to do the operations
    //else we return null
  if(Phrase_Count > 0){
    
    //We capitalize entry 0 because the method to check won't work
    //for the first entry. 
    //Check length for every " " and obtain, index + 1 of every " "
    //This will be what we need to store then adjust and insert
  Cap_String = Character.toUpperCase(phrase.charAt(0)) + phrase.substring(1);
  
    //The loop invariant for this is Char_Count < Phrase_Count-1
  for(int Char_Count = 0; Char_Count<Phrase_Count-1; Char_Count++){
		char c = phrase.charAt(Char_Count);
    char t = phrase.charAt(Char_Count+1);
    String Char_String = Character.toString(t);
  if(c == ' '){
      Char_String = Char_String.toUpperCase();
      Cap_String = Cap_String.substring(0,Char_Count) + " " + Char_String + Cap_String.substring(Char_Count+2);
	  }
  } 
	  return Cap_String;
	}
	return "that didn't work";
	}

}
