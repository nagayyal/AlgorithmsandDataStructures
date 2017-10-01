import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> myexample=new HashSet<Integer>();
		myexample.add(2);
	
		myexample.add(5);
		myexample.add(19);
		myexample.add(34);
		myexample.add(23);
		myexample.add(5);
		myexample.add(20);
		final Iterator<Integer> iterator1=myexample.iterator();
		while(iterator1.hasNext())
		{
			int a=iterator1.next();
			System.out.println(a);
		}
		
		

	}

}
