package practice;

// creating immutable class : 1 ) make class as final class
//`							  2 ) make variable as private
//							  3 ) make varibale as final
//							  4 ) no setter method
//							  5 ) make deep copy of object

final class B
{
	private final int id;
	private final String name;
	B(int i,String s)
	{
		id=i;
		name=s;
	}
	int getID()
	{
		return id;
	}
	String getString()
	{
		return name;
	}
	
	public static void main(String[] args) {
		
		B ref=new B(10,"Rishi");
		int a=ref.getID();
		String st=ref.getString();
		System.out.println(a+" "+st);
	}
}