public class Test {
  public static void main(String[] args) {
    Carrier cary1 = new Carrier(300, 3000);
    Carrier cary2 = new Carrier(400, 2000);
    Carrier cary3 = new Carrier(400, 3000);

    for (int i = 0; i < 3; i++){
      cary1.add(new F35());
      cary1.add(new F16());
      cary2.add(new F35());
      cary2.add(new F16());
      cary3.add(new F35());
      cary3.add(new F16());
    }
    System.out.println("<<<<<<<< 1st BATTLE >>>>>>>>\n");
    cary1.fight(cary2);
    System.out.println(cary1.getStatus());
    System.out.println(cary2.getStatus()); // should be dead

    System.out.println("<<<<<<<< 2nd BATTLE >>>>>>>>\n");
    cary1.fight(cary3);
    System.out.println(cary1.getStatus());
    System.out.println(cary3.getStatus()); // should have less HP
  }
}
