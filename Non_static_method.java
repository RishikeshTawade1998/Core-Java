class Non_static_method
{
	public void show()
	{
		System.out.println("non static show method");
	}
	
	public void show1()
	{
		this.show();   // non static method call by this keyword
	}
	
	public static void main(String[] args)
	{
		Non_static_method ref=new Non_static_method();
		ref.show();
		ref.show1();
	}
}	