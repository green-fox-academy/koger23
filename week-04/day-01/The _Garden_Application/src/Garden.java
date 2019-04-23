import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants = new ArrayList<>();

  public void addPlant(Plant plant) {
    plants.add(plant);
  }
  public List<Plant> getPlants() {
    return plants;
  }
  public void setPlants(List<Plant> plants) {
    this.plants = plants;
  }
  public void watering(int waterAmount) {
    double waterForEach;
    List<Integer> mustWater = new ArrayList<>();
    System.out.println("Watering with " + waterAmount);

    for (int i = 0; i < plants.size(); i++) {
      if (plants.get(i).needWater()) {
        mustWater.add(i);
      }
    }
    waterForEach = waterAmount / mustWater.size();

    for (Integer index : mustWater) {
      plants.get(index).watering((int) waterForEach);
    }
  }
  public void printPlants(){
    for (Plant plant : plants){
      plant.printStatus();
    }
  }
}
