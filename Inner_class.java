package practice;

import java.sql.Ref;

//******************************  Java Inner Classes *****************************************
//  Java inner class or nested class is a class that is declared inside the class or interface.
//	it can access all the members of the outer class, including private data members and methods.
//  Advantage of Java inner classes
//		There are three advantages of inner classes in Java. They are as follows:

//		1 ) Nested classes represent a particular type of relationship that is it can access all the members 
//			(data members and methods) of the outer class, including private.
//		2 ) Nested classes are used to develop more readable and maintainable code 
//			because it logically group classes and interfaces in one place only.
//		3 ) Code Optimization: It requires less code to write.
//		4 ) Sometimes users need to program a class in such a way so that no other class can access it.
//			Therefore, it would be better if you include it within other classes.

//		Inner  class has 2 types : static , non static
//		member inner class (regular inner class): It is non static inner class
//												: A non-static class that is created inside a class but outside a method is called member inner class
//												: public protected default private

//class B
//{
//	private int data=40;
//	// public protected default private
//	class A
//	{
//		void show()
//		{
//			System.out.println("show"+data);
//		}
//	}
//	
//	public static void main(String[] args)
//	{
//		B ref=new B();
//		B.A ref1=ref.new A();
//		ref1.show();
//	}
//}

//	Anonymous inner class
//abstract class T
//{
//	abstract void eat();
//}
//class B
//{
//	public static void main(String[] args) {
//		T ref=new T()
//				{
//					void eat()
//					{
//						System.out.println("show");
//					}
//				};
//				ref.eat();
//	}
//}

//anonymous inner class
//interface I
//{
//	void show();
//}
//class B 
//{
//	public static void main(String[] args)
//	{
//		I ref =new I()
//				{
//					public void show() {System.out.println("show((");}
//				};
//				ref.show();
//	}
//}

//	class inside a method
//class B
//{
//	public void call()
//	{
//		class C
//		{
//			void fas() 
//			{
//				System.out.println("hiii");
//			}
//		}
//		C ref4=new C();
//		ref4.fas();
//	}
//	public static void main(String[] args)
//	{
//		B ref=new B();
//		ref.call();
//	}
//}
// nested static class
//class B
//{
//	static class C
//	{
//		static void du() {System.out.println("hiii");}
//		static void au() {System.out.println("hiii123");}
//	}
//	public static void main(String[] args) 
//	{
//		B.C.du();
//		B.C ref=new B.C();
//		ref.au();
//	}
//}

//interface inside interface
//interface i
//{
//	void show();
//	interface i1
//	{
//		void show1();
//	}
//}
//class B implements i.i1
//{
//	void show()
//	{
//		System.out.println("hii");
//	}
//	public void show1()
//	{
//		System.out.println("hii45 ");
//	}
//	public static void main(String[] args) {
//		i.i1 ref=new B();
//		ref.show1();
//		
//	}
//}
