public class Counter {

  private int counter;
  private int initValue;

  public Counter() {
    this(0);
    this.initValue = 0;

  }

  public Counter(int counter) {
    this.counter = counter;
    this.initValue = counter;
  }

  public void add(int number){
    this.counter += number;
  }

  public void add(){
    this.counter++;
  }

  public void reset(){
    this.counter = initValue;
  }

  public int get(){
    return this.counter;
  }

}
