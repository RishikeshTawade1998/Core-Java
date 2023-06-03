package practice;

// call method by return type
class A
{
	A get()
	{
		return this;
	}
	void show() {System.out.println("show");}
}
class J extends A
{
	J get()
	{
		return this;
	}
	void show() {System.out.println("show1");}
}
class  B
{
	public static void main(String[] args) {
		new A().get().show();
		new J().get().show();
	}
}