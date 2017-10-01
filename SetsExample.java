import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> myexample=new HashSet<Person>();
		Person p1=new Person("Sravya",9094);
		Person p2=new Person("Tanmaiyee",9892);
		Person p3=new Person("Swarna",992);
		Person p4=new Person("Swarna",992);
		
		myexample.add(p1);
		myexample.add(p2);
		myexample.add(p3);
		myexample.add(p4);
		for(Iterator<Person> iterator=myexample.iterator();iterator.hasNext();)
		{
			Person person=iterator.next();
			System.out.println(person.getName());
		}

}
}
