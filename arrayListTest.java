import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayListTest implements Iterable<Product> {

	
	private static final ArrayList<Integer> a1=new ArrayList<>();
	private static final List<Product> listofProduct=new ArrayList<>();
	
	public void main()
	{
		
		a1.add(10);
		a1.add(30);
	// for retrieveing	
	for(int i=0;i<a1.size();i++)
	{
		System.out.println("Index retrieving"+a1.get(i));
	}
	//Second method
	for (Integer value:a1)
	{
		System.out.println("Iteration number 2"+value);
	}
	}
	public void replace(Product oldProdct,Product newProduct)
	{
		int index=listofProduct.indexOf(oldProdct);
		listofProduct.set(index, newProduct);
	}
	public void add(Product product)
    {
    	listofProduct.add(product);
    }
	
	public Iterator<Product> iterator()
	{
		return listofProduct.iterator();
	}
	public void sort(Product product)
	{
		Collections.sort(a1:))
	}

