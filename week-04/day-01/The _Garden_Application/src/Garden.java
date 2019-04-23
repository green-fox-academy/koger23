import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants =  new ArrayList<>();

  public void addPlant(Plant plant){
    plants.add(plant);
  }
  public List<Plant> getPlants() {
    return plants;
  }
  public void setPlants(List<Plant> plants) {
    this.plants = plants;
  }
}
