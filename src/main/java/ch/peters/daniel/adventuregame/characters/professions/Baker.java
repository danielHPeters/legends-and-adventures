package ch.peters.daniel.adventuregame.characters.professions;

/**
 * Baker profession.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Baker implements Profession {
  @Override
  public void doWork() {
    System.out.println("I'm Baking");
  }
}
