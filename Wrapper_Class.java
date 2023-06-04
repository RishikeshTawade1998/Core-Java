package practice;

import org.springframework.data.jpa.repository.support.QueryHintValue;

//	wrapper class:
//				: provides the mechanism to convert primitive into object and object into primitive.

//	Autoboxing	:
//				: The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing,
//class B
//{
//	public static void main(String[] args) {
//		int a=10;
//		System.out.println(a);
//		Integer b=Integer.valueOf(a);
//		System.out.println(b);
//		Integer c=a;			//  don't need to use values of since java 5
//		System.out.println(c);
//	}
//}

//	Unboxing
//	The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.

//class B
//{
//	public static void main(String[] args) 
//	{
//		Integer a=new Integer(5);
//		int b=a.intValue();
//		System.out.println(b);
//		int c=a;
//		System.out.println(c);
//	}
//}

class B
{
	public static void main(String[] args) {
		byte b=10;
		short c=20;
		int d=30;
		long e=40;
		float f=50.8f;
		long g=60;
		double h=70.60d;
		char i='l';
		boolean j=true;
		System.out.println("****************************autoboxing*******************************");
		Byte B=b;
		Short C=c;
		Integer D=d;
		Long  E=e;
		Float F=f;
		Long G=g;
		Double H=h;
		Character I=i;
		Boolean J=j;
		System.out.println("Byte : "+B);
		System.out.println("Short : "+C);
		System.out.println("Integer : "+D);
		System.out.println("Long : "+E);
		System.out.println("Float : "+F);
		System.out.println("Long : "+G);
		System.out.println("Double : "+H);
		System.out.println("Character : "+I);
		System.out.println("Boolean : "+J);
		System.out.println("****************************unboxing*******************************");
		byte b1=B;
		short c1=C;
		int d1=D;
		long  e1=E;
		float f1=F;
		long g1=G;
		double h1=H;
		char i1=I;
		boolean j1=J;
		System.out.println("Byte : "+b1);
		System.out.println("Short : "+c1);
		System.out.println("Integer : "+d1);
		System.out.println("Long : "+e1);
		System.out.println("Float : "+f1);
		System.out.println("Long : "+g1);
		System.out.println("Double : "+h1);
		System.out.println("Character : "+i1);
		System.out.println("Boolean : "+j1);
	}
}