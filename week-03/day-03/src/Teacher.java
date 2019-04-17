public class Teacher {

  private String name;

  public Teacher(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void answer(){
    System.out.println("Google it or RTFM!");
  }

  public void teach(Student student){
    System.out.println(student.getName() + ", make all the task for yesterday!");
    student.learn();
  }

  public static void main(String[] args) {

    Teacher t = new Teacher("Mr. John");

    Student s = new Student("Clack");

    t.teach(s);
  }
}
