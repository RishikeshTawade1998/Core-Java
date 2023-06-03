// The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
// Java Regex API provides 1 interface and 3 classes in java.util.regex package.
// MatchResult interface
// Matcher class
// Pattern class
// PatternSyntaxException class
package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class RegeXJ
{
	public static void main(String[] args)
	{
		String a=".";
		String b="@";		//Any thing that matches no of .
		Pattern pt=Pattern.compile(a);
		Matcher mt=pt.matcher(b);
		boolean result=mt.matches();
		System.out.println(result);  // true 
		
		String a1="\\w\\w";
		String b1="99";  //[a-z][A-Z][0-9]
		Pattern pt1=Pattern.compile(a1);
		Matcher mt1=pt1.matcher(b1);
		boolean result1=mt1.matches();
		System.out.println(result1);	// true 
		
		String a2="\\W";
		String b2=">";  //[!@#$%^&*()":?<>] all special character
		Pattern pt2=Pattern.compile(a2);
		Matcher mt2=pt2.matcher(b2);
		boolean result2=mt2.matches();
		System.out.println(result2);     //true
		
		String a3="\\w\\W.";
		String b3="a@1"; 
		Pattern pt3=Pattern.compile(a3);
		Matcher mt3=pt3.matcher(b3);
		boolean result3=mt3.matches();
		System.out.println(result3);  //true
		
		String a4="\\s";
		String b4=" ";  //only one space
		Pattern pt4=Pattern.compile(a4);
		Matcher mt4=pt4.matcher(b4);
		boolean result4=mt4.matches();
		System.out.println(result4);     //true
		
		String a5="\\S";
		String b5="y";  //Except space
		Pattern pt5=Pattern.compile(a5);
		Matcher mt5=pt5.matcher(b5);
		boolean result5=mt5.matches();
		System.out.println(result5);   //true
		
		String a6="\\d";
		String b6="8";  //only digit
		Pattern pt6=Pattern.compile(a6);
		Matcher mt6=pt6.matcher(b6);
		boolean result6=mt6.matches();
		System.out.println(result6);  //true
		
		String a7="\\D";
		String b7="%";  //Except digit
		Pattern pt7=Pattern.compile(a7);
		Matcher mt7=pt7.matcher(b7);
		boolean result7=mt7.matches();
		System.out.println(result7);  //true
		
		String a8="[abc]";
		String b8="a";  // only a or b or c
		Pattern pt8=Pattern.compile(a8);
		Matcher mt8=pt8.matcher(b8);
		boolean result8=mt8.matches();
		System.out.println(result8);// true
		
		String a9="[^abc]";
		String b9="f";  // except a or b or c
		Pattern pt9=Pattern.compile(a9);
		Matcher mt9=pt9.matcher(b9);
		boolean result9=mt9.matches();
		System.out.println(result9);// true
		
		String a10="[a-zA-z]";
		String b10="R";  // except a to z or A to Z
		Pattern pt10=Pattern.compile(a10);
		Matcher mt10=pt10.matcher(b10);
		boolean result10=mt10.matches();
		System.out.println(result10);// true
		
		System.out.println("11 : "+Pattern.matches("..s", "mas"));//true (3rd char is s)
		
		System.out.println("12 : "+Pattern.matches("\\w", "r"));
	}
}
