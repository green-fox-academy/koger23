public class Person {
  public String name;
  public int age;
  public String gender;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void introduce(){
    String message = "Hi, I'm " + name + ", a " + age + " year old " + gender + ".";
    System.out.println(message);
  }

  public void getGoal(){
    String message = "My goal is: Live for the moment!";
    System.out.println(message);
  }

  public Person(){
    this("Jane Doe", 30, "female");
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
