public class Cloning {
  public static void main(String[] args) throws CloneNotSupportedException {
    Person student_1 = new Student("John", 20, "male", "BME");
    Person jonhTheClone = (Person) ((Student) student_1).clone();

    jonhTheClone.setName("John The Clone");
    System.out.println(student_1.getName());
    System.out.println(jonhTheClone.getName());
  }
}
