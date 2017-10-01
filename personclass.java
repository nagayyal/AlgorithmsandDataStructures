import java.util.Objects;

public class personclass {
	String name;
	String id;
	public personclass(){
		
	}
	public personclass(String id,String name)
{
		Objects.requireNonNull(id);
	this.name=name;
	this.id=id;
}
	public String getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		personclass p1=(personclass)o;
		return p1.getid()==id && p1.getname()==name ;
		
	}
	public String toString()
	{
		return "Person id="+id+"\t"+"Person name="+name;
	}
}