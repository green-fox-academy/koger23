public class Student {

  private String name;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void learn(){
    System.out.println("OK, impossible as always...");
  }

  public void question(Teacher teacher){
    System.out.println("Excuse me " + teacher.getName() + ", what is the solution for this?");
    teacher.answer();
  }

  public static void main(String[] args) {

    Teacher t = new Teacher("Mr. John");

    Student s = new Student("Clack");

    s.question(t);
  }

}
