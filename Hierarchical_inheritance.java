class A
{
	int i=10;
	String str="rishi";
}

class B extends A
{
	int j=i+10;
	String st="Your name : "+str;
}

class C extends A
{
	int k=i+20;
	String st="Your fame : "+str;
}

class Hierarchical_inheritance
{
	public static void main(String args[])
	{
		B ref=new B();
		System.out.println("j : "+ref.j+"st : "+ref.st);

		C ref1=new C();
		System.out.println("k : "+ref1.k+"st : "+ref.st);
	}
}