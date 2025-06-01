

public class VasaviException extends Exception{
	

	public VasaviException(String s)
	{
		super(s);
	}

}
class Sample1{
	public static void main(String[] args) {
		try {
			throw new VasaviException("Vasavi Custom Exception");
		}
		catch(VasaviException my)
		{
			System.out.println("Exception Caught");
			System.out.println(my.getMessage());
		}
	}
}
