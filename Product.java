import java.util.Collection;
import java.util.Comparator;

public class Product {
private final String Name;
public String getName() {
	return Name;
}
public int getWeight() {
	return Weight;
}
private final int Weight;
public Product(String name, int weight) {
	//super();
	this.Name = name;
	this.Weight = weight;
}
@Override
public String toString() {
	return "Product [name=" + Name + ", weight=" + Weight + "]";
}
public static final Comparator<Product> BY_WEIGHT()
// comparing(Product::getWeight);
{
	public int compare(Product p1,Product p2)
	{
		return Integer.compare(p1.getWeight(), p2.getWeight());
	}
};

}
