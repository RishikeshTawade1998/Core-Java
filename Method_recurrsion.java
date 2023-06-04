package practice;

//   Method recurrsion : method call itself

class B
{
	public static void show(int i)
	{
		System.out.println("show : "+i);
		if(i>0)
		{
			i--;
			show(i);
		}
	}
	public static void main(String[] args)
	{
		show(5);
	}
}