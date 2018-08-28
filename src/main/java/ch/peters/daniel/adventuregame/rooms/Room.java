package ch.peters.daniel.adventuregame.rooms;

import ch.peters.daniel.adventuregame.items.Item;
import ch.peters.daniel.adventuregame.rooms.cells.Cell;

import java.util.List;

/**
 * Room with items and exits.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Room {
  private String name;
  private Room north, east, south, west;
  private List<Cell> cells;
  private List<Item> items;

  /**
   * Default Constructor
   *
   * @param name  Name of the room
   * @param items Items in the room
   */
  public Room(String name, List<Item> items) {
    this.name = name;
    this.items = items;
  }

  public String getName() {
    return name;
  }

  public Room getNorth() {
    return north;
  }

  public Room getEast() {
    return east;
  }

  public Room getSouth() {
    return south;
  }

  public Room getWest() {
    return west;
  }

  public List<Item> getItems() {
    return items;
  }
}
