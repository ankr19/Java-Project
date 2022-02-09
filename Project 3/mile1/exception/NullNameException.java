package mile1.exception;

@SuppressWarnings("serial")
public class NullNameException extends Exception{
	@Override
	public String toString()
	{
		return "name is null";
	}

}
