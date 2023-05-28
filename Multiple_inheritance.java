class A
{
	int i =10;
}
class B extends A
{
	int b=20;
}
class C extends B
{
	int D=30;
}
class D extends C
{
	int E=40;
}

class Multiple_inheritance
{
	public static void main(String args[])
	{
		D ref = new D();
		System.out.println("i value from A  class : "+ref.i);
		System.out.println("b value from B class : "+ref.b);
		System.out.println("D value from C class : "+ref.D);
		System.out.println("E value from E class : "+ref.E);
	}
}