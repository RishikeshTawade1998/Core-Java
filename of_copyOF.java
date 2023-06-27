package package_2nd;
import java.util.*;
public class C
{
	public static void main(String Args[])
	{
//		List<String> ls=new ArrayList();
//		ls.add("r");
//		ls.add("i");
//		ls.add("k");
//		
//		List<String> ks=List.copyOf(ls);
		
//		Set<String> ls1=new HashSet();
//		ls1.add("r");
//		ls1.add("i");
//		ls1.add("k");
//		List<String> hk=List.of("rishik","virat","youv"); // immuatble collection
//		List<String> ks1=List.copyOf(ls1);		// immuatble collection
//		for(String s:hk)
//		{
//			System.out.println(s);
//		}
		
//		Map<String,Integer> mp=new HashMap<String,Integer>();
//		mp.put("rishi", 100);
//		mp.put("virat", 200);
//		Map<Integer,String> ml=Map.of(1,"R",2,"I",3,"S"); // immuatble collection
//		
//		Map<String,Integer> jk=Map.copyOf(mp);		// immuatble collectio
//		for(Map.Entry mp1:ml.entrySet())
//		{
//			System.out.println(mp1.getKey()+" "+mp1.getValue());
//		}
		
//		Queue<String> qe=new LinkedList<>();
		Queue<String> qe=new PriorityQueue();
		qe.add("rishi");
		qe.add("tawade");
		qe.add("virat");
		Object[] st=qe.toArray();
		for(Object e:st)
		{
			System.out.println(e.toString());
		}
		
	}
}
		
			
