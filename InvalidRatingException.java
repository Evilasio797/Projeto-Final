public class InvalidRatingException extends Exception
{

	private int numberSent;
	
	//Cria uma InvalidRatingException vazia sem argumentos.
	private InvalidRatingException()
	{
		
	}

	//Cria uma InvalidRatingException com o n° invalido.
	public InvalidRatingException(int inNumberSent)
	{
		this.numberSent = inNumberSent;
	}
	
	//Retorna o numberSent de uma InvalidRatingException.
	public int getNumberSent()
	{
		return this.numberSent;
	}
	
	//Retorna InvalidRatingException como uma String.
	public String toString()
	{
		String returnString;
		
		returnString = this.numberSent + " is an invalid rating! Please choose a rating between 1 and 5.\n";
		
		return returnString;
	}
}