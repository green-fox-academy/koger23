public class BlogPost {

  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(){
  }

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(String publicationDate) {
    this.publicationDate = publicationDate;
  }

  public static void main(String[] args) {

    BlogPost post_1 = new BlogPost();
    post_1.setAuthorName("John Doe");
    post_1.setPublicationDate("2000.05.04.");
    post_1.setTitle("Lorem Ipsum");
    post_1.setText("Lorem ipsum dolor sit amet.");

    BlogPost post_2 = new BlogPost();
    post_2.setTitle("Wait but why");
    post_2.setAuthorName("Tim Urban");
    post_2.setPublicationDate("2010.10.10." );
    post_2.setText("A popular long-form, stick-figure-illustrated blog about almost everything.");

    BlogPost post_3 = new BlogPost();
    post_3.setTitle("One Engineer Is Trying to Get IBM to Reckon With Trump");
    post_3.setAuthorName("William Turton");
    post_3.setPublicationDate("2017.03.28.");
    post_3.setText("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
            "When I asked to take his picture outside one of IBM’s New York City offices, " +
            "he told me that he wasn’t really into the whole organizer profile thing.");


  }

}
