public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing thing_1 = new Thing("Get milk");
    Thing thing_2 = new Thing("Remove the obstacles");

    Thing thing_3 = new Thing("Stand up");
    thing_3.complete();

    Thing thing_4 = new Thing("Eat lunch");
    thing_4.complete();

    fleet.add(thing_1);
    fleet.add(thing_2);
    fleet.add(thing_3);
    fleet.add(thing_4);

    System.out.println(fleet);
  }
}