public class InvalidLengthException extends Exception
{

	private String lengthSent;
	
	//Cria uma InvalidLengthException vazio sem argumentos.
	private InvalidLengthException()
	{
		
	}

	//Cria uma InvalidLengthException que recebe a invalid String.
	public InvalidLengthException(String inString)
	{
		this.lengthSent = inString;
	}
	
	//Retorna o inString de uma InvalidLengthException.
	public String getLengthSet()
	{
		return this.lengthSent;
	}
	
	//Retorna InvalidLengthException como uma String.
	public String toString()
	{
		String returnString;
		
		returnString = this.lengthSent + " is an invalid length!\n";
		
		return returnString;
	}
	
}