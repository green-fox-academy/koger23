public class Student {
  public String name;
  public int age;
  public String gender;
  public String previousOrganization;
  public int skippedDays;

  public void introduce(){
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + "from " + previousOrganization + " who skipped " + skippedDays + ".");
  }

  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }

  public Student(){
    this("Jane Doe", 30, "female", "The School of Life");
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }
}
