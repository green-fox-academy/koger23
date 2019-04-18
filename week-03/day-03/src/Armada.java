import java.util.ArrayList;
import java.util.List;


public class Armada {

  private List<Ship> armada = new ArrayList<>();

  private String name;


  public Armada() {
  }

  public Armada(String name) {
    this.name = name;
  }

  public Armada(List<Ship> armada) {
    this.armada = armada;
  }

  public List<Ship> getArmada() {
    return armada;
  }

  public void setArmada(List<Ship> armada) {
    this.armada = armada;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void fillupArmada(){

    for (int i = 0; i < 45 + Math.random() * 20; i++){

      Ship ship = new Ship();

      ship.setName(getName() + " - Black Pearl - " + i);

      ship.fillShip();

      ship.shipInfo();

      armada.add(ship);

    }

  }

  public int getLiveShips(){

    int numberOfLiveShip = 0;

    for (Ship s : armada){
      if (s.getCrew().size() > 0){
        numberOfLiveShip++;
      }
    }
    return numberOfLiveShip;
  }


  public boolean war(Armada otherArmada){

    Ship ship_1 = null;
    Ship ship_2 = null;

    List<Ship> loserThis = new ArrayList<>();
    List<Ship> loserOther= new ArrayList<>();

    while ((getLiveShips() > 0) && (otherArmada.getLiveShips() > 0)){

      for (Ship ship : armada){

        if ((!loserThis.contains(ship)) && (ship.getCrew().size() > 0)){
          ship_1 = ship;
          break;
        }
      }

      for (Ship ship : otherArmada.getArmada()){

        if ((!loserOther.contains(ship)) && (ship.getCrew().size() > 0)){
          ship_2 = ship;
          break;
        }
      }

      if (ship_1.battle(ship_2)){
        loserOther.add(ship_2);
      } else {
        loserThis.add(ship_1);
      }

      if ((loserOther.size() == otherArmada.getArmada().size()) || (loserThis.size() == getArmada().size())){
        break;
      }

    }

    if ((getLiveShips() > 0) && (otherArmada.getLiveShips() == 0)){
      return true;
    } else {
      return false;
    }

  }

}
