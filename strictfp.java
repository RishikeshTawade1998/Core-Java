package practice;

//	strictfp : it is used to follow strictly follow float 
//			 : it might vari floating point from os to os 
//			 : to fix one value to all os use strictfp 
			
strictfp interface M
{
	
}
strictfp class B
{
	public static void main(String[] args)
	{
		float f=10.80f;
		System.out.println(f);
		sh();
	}
	public static strictfp void sh()
	{
		System.out.println("show");
	}
}

//strictfp abstract void m();//Illegal combination of modifiers  
//strictfp int data=10;//modifier strictfp not allowed here  
//strictfp B(){}//modifier strictfp not allowed here  