


public class Review {


  private Long id;

  
  private Integer rating;

  
  private String comment;

 
  private Item item;

 
  private User author;

  public Review() {
  }

  public Review(Integer rating, String comment, User author) {
    this.rating = rating;
    this.comment = comment;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public Integer getRating() {
    return rating;
  }

  public String getComment() {
    return comment;
  }

  public Item getItem() {
    return item;
  }

  public User getAuthor() {
    return author;
  }

  void setItem(Item item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "\nReview{" +
        "id=" + id +
        ", rating=" + rating +
        ", comment='" + comment + '\'' +
        '}';
  }
}
