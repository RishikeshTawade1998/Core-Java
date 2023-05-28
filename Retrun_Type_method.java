class Retrun_Type_method
{
	// static method with  return type
	public static int show()
	{
		return 10;
	}	
	
	// non static method with return type
	public int show1()
	{
		return 20;
	}

	public static void main(String args[])
	{

		// calling static methods

		System.out.println(show());
		System.out.println(Retrun_Type_method.show());
		Retrun_Type_method ref=new Retrun_Type_method();
		System.out.println(ref.show());

		// calling non static methods
		System.out.println(ref.show1());
		
	}
}