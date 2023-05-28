class Method_recurrsion
{
	static int i=1;
	public static void show()
	{
		if(i<11)
		{
			System.out.println(i);
			i++;
			show();    //method calling itself
		}
	}

	public static void main(String[] args)
	{
		show();
	}
}