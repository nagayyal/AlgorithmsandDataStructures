
import java.util.HashSet;
import java.util.Set;


public class Item {

  private Long id;

  
  private String title;


  private String description;

  
  Set<Review> reviews = new HashSet<>();

  public Item() {
  }

  public Item(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public Set<Review> getReviews() {
    return reviews;
  }

  public void addReview(Review review) {
    reviews.add(review);
    review.setItem(this);
  }

  @Override
  public String toString() {
    return "\nItem{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", description='" + description + '\'' +
        ", reviews=" + reviews +
        '}';
  }
}


