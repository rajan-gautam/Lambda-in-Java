package exceptions;

public class ExceptionForTriangle extends Exception {
	
	//constructor
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionForTriangle()
	{
		super("Invalid Side(s)!");
	}
}
