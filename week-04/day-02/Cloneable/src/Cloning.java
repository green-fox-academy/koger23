public class Cloning {
  public static void main(String[] args) throws CloneNotSupportedException {
    Person student_1 = new Student("Max", 30, "male", "Google");
    Person student_2 = (Person) ((Student) student_1).clone();

    student_2.setName("Peter");
    System.out.println(student_1.getName());
    System.out.println(student_2.getName());
  }
}
