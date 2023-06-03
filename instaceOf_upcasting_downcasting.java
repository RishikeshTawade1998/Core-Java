package practice;

// Java instanceof operator
class A
{
	int a=10;
	static int b=20;
	static void show() {System.out.println("A show"); }
	void show1() {System.out.println("A show1"); }
}
class J extends A
{
	int a=30;
	static int b=40;
	static void show() {System.out.println("J show"); }
	void show1() {System.out.println("J show1"); }
}
class  B
{
	public static void main(String[] args) 
	{
		J ref=new J();
		System.out.println(ref instanceof A);
		J ref1=null;
		System.out.println(ref1 instanceof A);
		A  ref2=new J();
		System.out.println(ref2 instanceof A);
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		ref2.show();
		ref2.show1();
		J ref3=(J)ref2;
		ref3.show();
	}
}