public class Mentor extends Person {
  public String level;

  public void introduce(){
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + level + "mentor.");
  }

  public void getGoal(){
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  public Mentor(){
    this("Jane Doe", 30, "female", "intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }
}
