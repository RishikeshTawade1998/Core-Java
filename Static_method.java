class Static_method
{
	// static method
	public static void show()
	{
		System.out.println("Show method run");
	}
	
	public static void main(String args[])
	{
		show(); 		    	//call by name
		Static_method.show();	 //call by class name
		Static_method ref=new Static_method();
		ref.show() ;                 	   // call by reference variable
	}
}