package ch.peters.daniel.adventuregame.rooms.cells;

/**
 * Room cell.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Cell {
  public enum Type {
    OUTDOOR_GRASS, INTERIOR_DUNGEON
  }

  private Type type;
}
