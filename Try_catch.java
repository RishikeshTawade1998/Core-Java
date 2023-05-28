class Try_catch
{
	public static void main(String[] args)
	{
		try
		{
			int a=2/0;
		}
		catch(Exception e)
		{
			System.out.println("Catch block");
		}
		finally
		{
			System.out.println("Finally block");
		}
	}
}