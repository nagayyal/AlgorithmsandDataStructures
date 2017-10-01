import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product> {

	
		// TODO Auto-generated method stub
        private static final int lightmaxweight=25;
        private final List<Product> products=new ArrayList<>();
        public List<Product> HeavyVanProduct;
        
		
		public List<Product> getHeavyVanProduct() {
			return HeavyVanProduct;
		}
		public List<Product> getLightVanProduct() {
			return LightVanProduct;
		}
		public List<Product> LightVanProduct;
        public void add(Product product)
        {
        	products.add(product);
        }
        public void replace(Product oldProduct , Product newProduct)
        {
        	int index=products.indexOf(oldProduct);
        	if(index!=-1)
        	{
        	products.set(index, newProduct);
        	}
        	else
        	{
        		products.add(newProduct);
        	}
        }
        public Iterator<Product> iterator()
		{

			return products.iterator();
			
		}
		
	}


