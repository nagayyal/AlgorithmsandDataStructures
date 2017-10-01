import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

  

  public Page<Item> findItems(PageRequest pageRequest) {
    // TODO: Implement me
	  int pageno=0;
	  int size=0;
	  l1=new ArrayList<Item>();
    if(pageRequest.getCount()>0 && pageRequest.getPageNumber()>=0)
      {
       pageno=pageRequest.getPageNumber();
      size=pageRequest.getCount();
    
     ;
    int i;
	while(i<size)
      {
      l1.add(new Item());
    }
      }
    return new Page<>(l1, pageno, 0);
  }

  public List<Item> findItemsWithAverageRatingLowerThan(Integer rating) {
    // TODO: Implement me
    return new ArrayList<>();
  }

}
