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

  public void hire(){
    this.hiredStudents++;
  }

  public Sponsor(){
    this("Jane Doe", 30, "female", "Google");
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }
}
