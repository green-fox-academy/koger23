public class Mentor {
  public String name;
  public int age;
  public String gender;
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
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }
}
