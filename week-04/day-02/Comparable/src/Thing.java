import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
    this.completed = false;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  public int compareTo(Thing thing) {
    return toString().compareTo(thing.toString());
  }

  public static void main(String[] args) {
    List<Thing> todoList = new ArrayList<>();

    todoList.add(new Thing("What the hell is this Comparator?..."));
    todoList.add(new Thing("Comparator is evil..."));
    todoList.add(new Thing("Noone knows what it is doing..."));
    todoList.add(new Thing("Get to know Comparator thing"));
    todoList.add(new Thing("Get to know Comparator thing again"));
    todoList.add(new Thing("Get to know Comparator thing again and over again"));
    todoList.get(2).complete();
    todoList.get(3).complete();

    Collections.sort(todoList, new Comparator<Thing>(){

      public int compare(Thing o1, Thing o2)
      {
        return o1.compareTo(o2);
      }
    });
    System.out.println(todoList);
  }
}