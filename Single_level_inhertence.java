class A
{
	int a=10;
	String st="rishi";
}
class B extends A
{
	public void show()
	{
	System.out.println(a+" "+st);
	}
}

class Single_level_inhertence
{
	public static void main(String args[])
	{
	B ref=new B();
	ref.show();
	}
}