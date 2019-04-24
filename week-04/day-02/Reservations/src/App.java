import main.java.booking.Reservation;

public class App {
  public static void main(String[] args) {
    Reservation reservation = new Reservation();
    for (int i = 0; i < 8; i++){
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}
