import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product door=new Product("TeakWood Door",5);
		Product window=new Product("Glass Window",15);
		Product ceiling=new Product("Ceiling Fan",2);
		Collection<Product> collectionOfProducts=new ArrayList<>();
		//Since it is ArrayList it returns true even if we add two same elements
		collectionOfProducts.add(door);
		collectionOfProducts.add(window);
		collectionOfProducts.add(ceiling);
		//using iterator1
		for(Iterator<Product> iterator=collectionOfProducts.iterator();iterator.hasNext();)
		{
			final Product i=iterator.next();
			{
				System.out.println(i);
			}
			
		}
		final Iterator<Product> iteartor1=collectionOfProducts.iterator();
		while(iteartor1.hasNext())
		{
			
			Product product=iteartor1.next();
			if(product.getWeight()>10)
			System.out.println("Using 2nd iterator"+product);
			else
			{
				iteartor1.remove();
			}
		}
		
		//Using foreach
		for(Product product:collectionOfProducts)
		{
			System.out.println("Using Foreach"+product);
		}
		
		Collection<Product> otherProducts=new ArrayList<>();
		otherProducts.add(door);
		otherProducts.add(ceiling);
		
		collectionOfProducts.removeAll(otherProducts);
		
		for(Product product1:collectionOfProducts)
		{
			System.out.println("After removing"+product1);
		}
		
		
	}

}
