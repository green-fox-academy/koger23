package main.java.booking;

public class Reservation implements Reservationy {
  private final String[] dow = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

  public String getDowBooking() {
    return dow[(int) (Math.random()*dow.length)];
  }

  public String getCodeBooking() {
    String strings = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
    String finalCode = "";

    for (int i = 0; i < 8; i++){
      finalCode += strings.charAt((int) (Math.random()*strings.length()));
    }
    return finalCode;
  }
}
