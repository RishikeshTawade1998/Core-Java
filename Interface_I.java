//	1 ) Marker or tagged interface
//		An interface which has no member is known as a marker or tagged interface.
//		for example, Serializable, Cloneable, Remote, etc. 
//		They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
//
//2 ) Nested Interface
//
//3 ) functional interface

package practice;

import java.sql.Ref;

interface I
{
	int a=30;
	public static final int b=20;
	
	public void show();
	
	static void show1()
	{
		  System.out.println("show1"); 
	}
	
	default void show2()
	{
		System.out.println("show2"); 
	}
	
}

class B implements I
{

	@Override
	public void show() 
	{
		System.out.println("overided show");
	}
	
	public static void main(String[] args)
	{
		I ref=new B();
		System.out.println(I.b);
		System.out.println(ref.a);
		ref.show();
		I.show1();
		ref.show2();
	}
}