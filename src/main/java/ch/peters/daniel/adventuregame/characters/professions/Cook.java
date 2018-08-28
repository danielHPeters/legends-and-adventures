package ch.peters.daniel.adventuregame.characters.professions;

/**
 * Cook profession.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Cook implements Profession {
  @Override
  public void doWork() {
    System.out.println("I'm cooking.");
  }
}
