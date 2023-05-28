class Accessing_variable
{
	static int i =10;   // static variable
	int j=20;	          //  non static variable
	
	public static void main(String[] args)
	{
		System.out.println(i);
		
		Accessing_variable ref=new Accessing_variable();
		System.out.println(ref.i);

		System.out.println(ref.j);
	}
}
	