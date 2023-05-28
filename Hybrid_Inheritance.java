class A
{
	int i=10;
}

class B extends A implements I1
{
	int j=i+20;
}


class C extends A implements I1
{
	int j=i+30;
}

class Hybrid_Inheritance
{
	public static void main(String[] args)
	{
		B obj=new B();
		System.out.println(obj.j);	//30

		C obj1=new C();
		System.out.println(obj1.j);	//40	
	}
}
	