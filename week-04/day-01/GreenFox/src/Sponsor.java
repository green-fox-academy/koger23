public class Sponsor {
  public String name;
  public int age;
  public String gender;
  public String company;
  public int hiredStudents;

  public void introduce(){
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + "who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }

  public Sponsor(){
    this("Jane Doe", 30, "female");
  }

  public Sponsor(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
