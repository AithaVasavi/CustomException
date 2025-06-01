
public class MyException extends Exception{
	public MyException(String s)
	{
		super(s);
	}

}
class Sample{
	public static void main(String[] args) {
		try {
			throw new MyException("My Custom Exception");
		}
		catch(MyException my)
		{
			System.out.println("Exception Caught");
			System.out.println(my.getMessage());
		}
	}
}