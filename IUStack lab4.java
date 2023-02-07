
public class IUStack <T>{

	
	private T A[];
	private int size;
	private int count;
	IUStack()
	{
		A = (T[])new Object[5];
		count = 0;
		size = 5;
	}
	
	void push(T Val){
		
		A[count] = Val;
		count++;
	}
	// Make it Dynamic Stack
	
	T pop(){
		
		count--;
		T temp = A[count];
		A[count] = null;
		return temp;
		
	}
	
	
	
		T peek()
	              {
		if(count>0)
		{
		 return A[count-1];
		}
		else 
			return null;
	              }
	
	
	
	public String toString()
	{
		String s = "[";
		for(int i=0;i<count-1;i++)
		{
			s =s +A[i]+",";
		}
		s=s+A[count-1]+"]";
		return s;
	}
	
	
	
	
	
}
