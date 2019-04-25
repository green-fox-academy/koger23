package animal;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
  Animal defaultAnimal;
  Animal customAnimal;

  @Before
  public void setUp() {
    defaultAnimal = new Animal();
    customAnimal = new Animal(100, 200);
  }

  @Test
  public void getHunger() {
    assertEquals(50, defaultAnimal.getHunger());
    assertNotEquals(100, defaultAnimal.getHunger());
    assertNotEquals(50, customAnimal.getHunger());
    assertEquals(100, customAnimal.getHunger());
  }

  @Test
  public void setHunger() {
    defaultAnimal.setHunger(11);
    customAnimal.setHunger(22);
    assertNotEquals(50, defaultAnimal.getHunger());
    assertEquals(11, defaultAnimal.getHunger());
    assertNotEquals(100, customAnimal.getHunger());
    assertEquals(22, customAnimal.getHunger());
  }

  @Test
  public void getThirst() {
    assertEquals(50, defaultAnimal.getThirst());
    assertNotEquals(200, defaultAnimal.getThirst());
    assertNotEquals(50, customAnimal.getThirst());
    assertEquals(200, customAnimal.getThirst());
  }

  @Test
  public void setThirst() {
    defaultAnimal.setThirst(111);
    customAnimal.setThirst(222);
    assertNotEquals(50, defaultAnimal.getThirst());
    assertEquals(111, defaultAnimal.getThirst());
    assertNotEquals(200, customAnimal.getThirst());
    assertEquals(222, customAnimal.getThirst());
  }

  @Test
  public void eat() {
    defaultAnimal.eat();
    customAnimal.eat();
    assertNotEquals(51, defaultAnimal.getHunger());
    assertEquals(49, defaultAnimal.getHunger());
    assertNotEquals(101, customAnimal.getHunger());
    assertEquals(99, customAnimal.getHunger());
  }

  @Test
  public void drink() {
    defaultAnimal.drink();
    customAnimal.drink();
    assertNotEquals(50, defaultAnimal.getThirst());
    assertNotEquals(51, defaultAnimal.getThirst());
    assertEquals(49, defaultAnimal.getThirst());
    assertNotEquals(200, customAnimal.getThirst());
    assertNotEquals(201, customAnimal.getThirst());
    assertEquals(199, customAnimal.getThirst());
  }

  @Test
  public void play() {
    defaultAnimal.play();
    customAnimal.play();
    assertNotEquals(50, defaultAnimal.getHunger());
    assertNotEquals(50, defaultAnimal.getThirst());
    assertNotEquals(100, customAnimal.getHunger());
    assertNotEquals(200, customAnimal.getThirst());
    assertEquals(51, defaultAnimal.getHunger());
    assertEquals(51, defaultAnimal.getThirst());
    assertEquals(101, customAnimal.getHunger());
    assertEquals(201, customAnimal.getThirst());
  }
}