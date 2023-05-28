class A
{
	private String name;
	private float salary;
	
	// parametrise constructor
	A(String nm,float sal)
	{
		this.name=nm;
		this.salary=sal;
	}

	// Setter method
	public void setter(String nm,float sal)
	{
		this.name=nm;
		this.salary=sal;
	}

	// Getter method
	public String getter()
	{
		return name+" "+salary;
	}
}

class Encapulation_N
{
	public static void main(String[] args)
	{
		A ref = new A("virat",20000);         // Declaring value at time of object creation
		System.out.println(ref.getter());   // Getter method

		ref.setter("rishikesh",40000);	   // Setter method
		System.out.println(ref.getter());   // Getter method
	}
}
	