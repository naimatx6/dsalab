
public class Test {
	public static void main(String arg[])
	{
	
		IUArrayList<Integer> a = new IUArrayList<Integer>();
		
		a.Add(12);a.Add(23);
		System.out.println(a);
		
		
		IUStack s1 = new IUStack();
		
		s1.push(23);
		s1.push(34);
		System.out.println(s1);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
     System.out.println(s1.peek());
		
	}
	
	
	
	
	
	

}
