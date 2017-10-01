import java.util.Iterator;

public class Person implements Comparable<Person> {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	private int rollno;
	public Person(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", rollno=" + rollno + "]";
	}
	
	public int compareTo(Person o)
	{
		return name.compareTo(o.getName());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

}
