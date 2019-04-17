import java.util.ArrayList;
import java.util.List;

public class Armada {

  private List<Ship> armada = new ArrayList<>();

  public Armada() {
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

  public void fillupArmada(){

    for (int i = 0; i < 1 + Math.random() * 50; i++){

      Ship ship = new Ship();

      ship.setName("Black Pearl - " + i);

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

    while ((armada.size() > 0) && (otherArmada.getArmada().size() > 0)){

      Ship ship_1 = null;
      Ship ship_2 = null;

      if (getLiveShips() > 0){
        for (Ship ship : armada){

          if (ship.getCrew().size() > 0){
            ship_1 = ship;
            break;
          }
        }
      }

      if (otherArmada.getLiveShips() > 0){
        for (Ship ship : otherArmada.getArmada()){

          if (ship.getCrew().size() > 0){
            ship_2 = ship;
            break;
          }
        }

      }

      ship_1.battle(ship_2);

    }

    if ((armada.size()>0) && (otherArmada.getArmada().size() == 0)){
      return true;
    } else {
      return false;
    }

  }

}
