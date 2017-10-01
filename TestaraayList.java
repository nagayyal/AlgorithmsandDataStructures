
public class TestaraayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product mat=new Product("doormat",25);
		Product table=new Product("woodtable",35);
		Product mugs=new Product("coffemugs",15);
		Product bathproducts=new Product("moisturizer",15);
		
          arrayListTest a1=new arrayListTest();
          a1.add(mat);
          a1.add(table);
          a1.add(bathproducts);
          for(Product productiterator1:a1)
          {
        	  System.out.println("before changing"+productiterator1);
          }
          a1.replace(bathproducts,mugs);
          for(Product productiterator:a1)
          {
        	  System.out.println("after replace"+productiterator);
          }
          
	}

}
