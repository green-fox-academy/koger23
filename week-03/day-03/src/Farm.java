import java.util.ArrayList;
import java.util.List;

public class Farm {

  private List<Animal> listOfAnimals = new ArrayList<>();

  private int slots;

  public Farm(int slots) {
    this.slots = slots;
  }

  public Farm(List<Animal> listOfAnimals, int slots) {

    this.listOfAnimals = listOfAnimals;
    this.slots = slots;
  }

  public List<Animal> getListOfAnimals() {
    return listOfAnimals;
  }

  public void setListOfAnimals(List<Animal> listOfAnimals) {
    this.listOfAnimals = listOfAnimals;
  }

  public int getSlots() {
    return slots;
  }

  public void setSlots(int slots) {
    this.slots = slots;
  }

  public void breed(Animal newAnimal){

    if (slots > listOfAnimals.size()){

      listOfAnimals.add(newAnimal);

      System.out.println("New Animal obj. added with hunger: " + newAnimal.getHunger());
    }

  }

  public void slaughter(){

    int leastHungerAnimalIndex = 0;
    int lastHungerValue = 50;

    for (Animal animal : listOfAnimals){

      if (lastHungerValue > animal.getHunger()){
        lastHungerValue = animal.getHunger();
        leastHungerAnimalIndex = listOfAnimals.indexOf(animal);
      }
    }

    listOfAnimals.remove(leastHungerAnimalIndex);
    System.out.println("Animal with index " + leastHungerAnimalIndex + " has been slaughtered.");

  }

  public static void main(String[] args) {

    Farm farm = new Farm(100);

    Animal ani_1 = new Animal();
    Animal ani_2 = new Animal();
    Animal ani_3 = new Animal(0, 50);
    Animal ani_4 = new Animal();
    Animal ani_5 = new Animal(2, 3);

    List<Animal> listOfAnimals = new ArrayList<>();

    listOfAnimals.add(ani_1);
    listOfAnimals.add(ani_2);
    listOfAnimals.add(ani_3);
    listOfAnimals.add(ani_4);
    listOfAnimals.add(ani_5);

    farm.setListOfAnimals(listOfAnimals);

    farm.slaughter();

    farm.breed(ani_3);

    farm.slaughter();
  }

}
