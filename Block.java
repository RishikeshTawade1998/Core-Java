class Block
{
	// static method executes before main method
	static
	{
		System.out.println("static block");
	}
	
	// executes when object is created
	{
		System.out.println("non static block");
	}

	public static void main(String[] args)
	{
		Block ref = new Block();
	}
}
	
	
	