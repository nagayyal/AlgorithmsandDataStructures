import java.util.*;

public class queuesexample {

	
	public static void main(String[] args)
	{
		Queue<Integer> a1=new LinkedList<Integer>();
		a1.add(45);
		a1.add(67);
		a1.add(45);
		int size=a1.size();
		for(int i=0;i<size;i++)
		{
			int elements=a1.remove();
			if(elements>45)
			System.out.println(elements);
		}
		
		while(!a1.isEmpty())
		{
			System.out.println(a1.remove());
			
		}
		
	}
}
