package practice;

class B
{
	public static void main(String[] args) 
	{
		String st="rishikesh";
		System.out.println("String is : "+st);
		char ch=st.charAt(2);
		System.out.println("charAT() : "+ch);
		System.out.println(st.compareTo("rishi")); //4
		System.out.println("rishi".compareTo(st)); //-4
		System.out.println(st.contains("sh"));     //true
		System.out.println(st.endsWith("h"));	   //true
		System.out.println("startsWith : "+st.startsWith("r"));	   //true
		System.out.println("startsWith : "+st.startsWith("i",1));	   //true
		System.out.println(st.equals("rishikesh")); //true
		System.out.println(st.equalsIgnoreCase("RisHiKESH")); //true
		char[] chArr=new char[6];
		st.getChars(1, 5, chArr, 2);	// string start index , string end index , arr name , index of arry to store
		System.out.println(chArr);		// ishi
		System.out.println(st.indexOf("ik")); //4
		System.out.println(st.indexOf("i",2)); //4
		System.out.println(st.lastIndexOf("h"));
		System.out.println(st.length());
		System.out.println(st.replace("i", "sh"));  //replace() replaceAll()
		String[] arrstr1=st.split("s");				//creates array
		for(String gh:arrstr1)
		{
			System.out.println(gh);
		}
		System.out.println("SubString() : "+st.substring(1,5));
		char[] ar=st.toCharArray();
		System.out.println(ar);
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		int i=20;
		String d=String.valueOf(i);  // conver any data type into String
		System.out.println(d+30);
		char gh='f';
		String dt=""+gh;
		System.out.println(dt);
	}
}