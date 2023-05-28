class ConstructorR
{
	ConstructorR(String st ,float ft)
	{
		System.out.println("Name is : "+st);
		System.out.println("Salary is : "+ft);
	}
	
	public static void main(String[] args)
	{
		ConstructorR ref=new ConstructorR("Rishi",10);
	}
}