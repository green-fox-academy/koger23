public class PostIt {

  private String backgroundColor;
  private String text;
  private String textColor;

  public PostIt() {
  }

  public PostIt(String backgroundColor, String text, String textColor) {

    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;

  }

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTextColor() {
    return textColor;
  }

  public void setTextColor(String textColor) {
    this.textColor = textColor;
  }

  public static void main(String[] args) {

    PostIt postIt_1 = new PostIt("orange", "Idea 1", "blue");
    PostIt postIt_2 = new PostIt("pink", "Awesome", "black");
    PostIt postIt_3 = new PostIt("yellow", "Superb!", "green");

  }

}
