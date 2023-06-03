// class which is declared as abstract is known as an abstract class.
// It can have abstract and non-abstract methods. It needs to be extended and its method implemented. 
// Points to Remember
// An abstract class must be declared with an abstract keyword.
// It can have abstract and non-abstract methods.
// It cannot be instantiated.
//  It can have constructors and static methods also.
// It can have final methods which will force the subclass not to change the body of the method.
package practice;

abstract class A
{
	abstract public void d1();  // this method must be overrided by subclass
	public  void d2()
	{
		System.out.println("d2");
	}
	
	public static void d4()
	{
		System.out.println("d2");
	}
	
	public final  void d3()
	{
		System.out.println("d3");
	}
	
	public final static void d5()
	{
		System.out.println("d5");
	}
	
	static								// static block
	{
		System.out.println("static");
	}
	
	{									// non static block
		System.out.println("non static");
	}
	
	A()
	{
		System.out.println("constructor : ");
	}
}

class B extends A
{
	public void d1()
	{
		System.out.println("d1");
	}
	public static void main(String[] args) {
//		A ref = new A();   // can not instanciated 
		A ref = new B();
		ref.d2();
		ref.d1();
		ref.d3();
		A.d4();
		ref.d5();
	}
}