import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  private List<Sharpie> sharpieList;

  public SharpieSet(List<Sharpie> sharpieSet) {
    this.sharpieList = sharpieSet;
  }


  public void countUsable(){

    int counter = 0;

    for (Sharpie s : sharpieList){

      if (s.getInkAmount() > 0){
        counter++;
      }
    }

    System.out.println("Usuble sharpies: " + counter + " pcs.");
  }

  public void removeTrash(){

    List<Sharpie> emptySharpie = new ArrayList<>();


    for (int i = 0; i < sharpieList.size(); i++){

      if (sharpieList.get(i).getInkAmount() == 0){
        emptySharpie.add(sharpieList.get(i));
      }
    }


    for (Sharpie s : emptySharpie){

      System.out.println(s.getColor() + " colored Sharpie was removed" +
              ", because it is empty.");
      sharpieList.remove(s);

    }
  }

  public static void main(String[] args) {

    Sharpie sharpie_1 = new Sharpie("red", 0.5);
    Sharpie sharpie_2 = new Sharpie("blue", 0.5);
    Sharpie sharpie_3 = new Sharpie("green", 0.3);

    sharpie_2.setInkAmount(0); // make one empty for testing
    sharpie_3.setInkAmount(0); // make one empty for testing

    List<Sharpie> sharpieList = new ArrayList<>();

    sharpieList.add(sharpie_1);
    sharpieList.add(sharpie_2);
    sharpieList.add(sharpie_3);

    SharpieSet sharpieSet = new SharpieSet(sharpieList);

    sharpieSet.countUsable();

    sharpieSet.removeTrash();

  }

}
