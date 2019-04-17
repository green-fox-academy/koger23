public class Counter {

  private int counter;

  public Counter() {
    this(0);
  }
  
  public Counter(int counter) {
    this.counter = counter;
  }

  public void add(int number){
    this.counter += number;
  }

  public void add(){
    this.counter++;
  }

  public void reset(){
    this.counter = 0;
  }

  public int get(){
    return this.counter;
  }
}
