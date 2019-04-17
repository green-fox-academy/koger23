public class Sharpie {

  String color;
  double width;
  double inkAmount;

  public Sharpie(String color, double width) {
    this.width = width;
    this.color = color;
    this.inkAmount = 100;
  }

  public void use(){

    if (inkAmount != 0){
      this.inkAmount--;
    }
  }
}
