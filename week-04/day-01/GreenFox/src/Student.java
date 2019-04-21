public class Student {
  public String name;
  public int age;
  public String gender;

  public void introduce(){
    System.out.println( "Hi, I'm " + name + ", a " + age + " year old " + gender + ".");
  }

  public void getGoal(){
    System.out.println("My goal is: Live for the moment!");
  }

  public Student(){
    this("Jane Doe", 30, "female");
  }

  public Student(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
