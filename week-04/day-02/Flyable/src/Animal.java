public abstract class Animal {
  private String name;
  private int age;

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  abstract String breed();

}
