package adventuregame.rooms;

import adventuregame.items.Item;

import java.util.List;

/**
 * Room with items and exits.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Room {
  private String name;
  private Room north;
  private Room east;
  private Room south;
  private Room west;
  private List<Item> items;

  /**
   * Default Constructor.
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

  public void setName(String name) {
    this.name = name;
  }

  public void setNorth(Room north) {
    this.north = north;
  }

  public void setEast(Room east) {
    this.east = east;
  }

  public void setSouth(Room south) {
    this.south = south;
  }

  public void setWest(Room west) {
    this.west = west;
  }

  public void setItems(List<Item> items) {
    this.items = items;
  }
}
