import java.util.ArrayList;
import java.util.List;

public class Armada {

  private List<Ship> armada = new ArrayList<>();

  public Armada(List<Ship> armada) {
    this.armada = armada;
  }

  public List<Ship> getArmada() {
    return armada;
  }

  public void setArmada(List<Ship> armada) {
    this.armada = armada;
  }

  private boolean war(Armada otherArmada){

    while ((armada.size() > 0) && (otherArmada.getArmada().size() > 0)){

      Ship ship_1 = null;
      Ship ship_2 = null;

      for (Ship ship : armada){

        if (ship.getCrew().size() > 0){
          ship_1 = ship;
          break;
        }
      }

      for (Ship ship : armada){

        if (ship.getCrew().size() > 0){
          ship_2 = ship;
          break;
        }
      }

      ship_1.battle(ship_2);

    }

    return true;
  }

}
