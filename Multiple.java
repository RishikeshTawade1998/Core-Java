interface i1
{
	default void show()
	{
		System.out.println("I1");
	}
}

interface i2
{
	default void show()
	{
		System.out.println("I2");
	}
}

class Multiple implements i1,i2
{
	public void show()
	{
		i1.super.show();
		i2.super.show();
	}
	public void show1()
	{
		i1.super.show();
	}
	public void show2()
	{
		i2.super.show();
	}
	public static void main(String[] args)
	{	
		Multiple ref=new Multiple();
		ref.show();
		ref.show1();
		ref.show2();
	}
}
	