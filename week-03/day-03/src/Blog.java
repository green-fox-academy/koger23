import java.util.ArrayList;
import java.util.List;

public class Blog {

  private List<BlogPost> listOfPosts = new ArrayList<>();

  public Blog(){
  }

  public Blog(List<BlogPost> listOfPosts) {
    this.listOfPosts = listOfPosts;
  }

  public List<BlogPost> getListOfPosts() {
    return listOfPosts;
  }

  public void setListOfPosts(List<BlogPost> listOfPosts) {
    this.listOfPosts = listOfPosts;
  }

  public void addPost(BlogPost blogPost){
    this.listOfPosts.add(blogPost);
  }

  public void removePost(int index){
    this.listOfPosts.remove(index);
  }

  public void updatePost(int index, BlogPost post){
    this.listOfPosts.set(index, post);
  }

}
