package Exception;

public class IllegalCharacterException extends Exception{
	public IllegalCharacterException(String a){
		super(a);
		String u = "Ìí¼Ó";//Ìí¼Ó
	}
	public IllegalCharacterException() {
		super();
	}

}
