package package_2nd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class C
{
	
	static
	{
		System.out.println("**************** Welcome to file operation program *****************************");
	}
	public int inputInfo()
	{
		System.out.println("Press 1 to Create File ");
		System.out.println("Press 2 to Read File ");
		System.out.println("Press 3 to Write File ");
		System.out.println("Press 4 to Delete file");
		System.out.print("Enter no : ");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		return a;
	}
	public void createFile()
	{
		System.out.print("Enter file name along with directory : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		File f=new File(s);
		try 
		{
			if(f.createNewFile()) { System.out.println(f.getName() +" Created Successfully ");}
			else {System.out.println("already exist ");}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void readFile()
	{
		System.out.print("Enter file name to read : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Scanner filereader=null;
		try 
		{
			File fd=new File(s);
			filereader=new Scanner(fd);
			while(filereader.hasNextLine())
			{
				System.out.println(filereader.next());
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			filereader.close();
		}
	}
	public void writeFile() 
	{
		System.out.print("Enter file name to write : ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		FileWriter fd=null;
		try 
		{
			fd = new FileWriter(s);
			System.out.print("Enter text to write : ");
			String s1=sc.nextLine();
			fd.write(s1);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try { fd.close(); } 
			catch (IOException e) { e.printStackTrace(); }
		}
	}
	public void file()
	{
		Scanner sc=new Scanner(System.in);
		C c=new C();
		switch(c.inputInfo())
		{
			case 1:c.createFile();
					c.file();
					break;
			case 2:c.readFile();
					c.file();
					break;
			case 3:c.writeFile();
					c.file();
					break;
			case 4:c.deleteFile();
				c.file();
				break;
		}
	}
	private void deleteFile()
	{
		System.out.print("Enter file name to Delete : ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		File f=new File(s1);
		f.delete();
	}
	public static void main(String Args[]) throws IOException
	{
		C c=new C();
		c.file();
	}
}
		
			
