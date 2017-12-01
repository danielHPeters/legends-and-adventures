package adventuregame.rooms;

import adventuregame.items.Item;
<<<<<<< HEAD
import adventuregame.rooms.cells.Cell;
=======

>>>>>>> 1ea25d9358b361a3e2fe6623b17201f9bb0cdb3c
import java.util.List;

/**
 * Room with items and exits.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Room {
<<<<<<< HEAD

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Room north, east, south, west;
    
    private List<Cell> cells;

    /**
     * 
     */
    private List<Item> items;
    
    /**
     * Default Constructor
     * @param name Name of the room
     * @param items Items in the room
     */
    public Room(String name, List<Item> items){
        this.name = name;
        this.items = items;
    }

    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return 
     */
    public Room getNorth() {
        return north;
    }

    /**
     * 
     * @return 
     */
    public Room getEast() {
        return east;
    }

    /**
     * 
     * @return 
     */
    public Room getSouth() {
        return south;
    }

    /**
     * 
     * @return 
     */
    public Room getWest() {
        return west;
    }

    /**
     * 
     * @return 
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param north 
     */
    public void setNorth(Room north) {
        this.north = north;
    }

    /**
     * 
     * @param east 
     */
    public void setEast(Room east) {
        this.east = east;
    }

    /**
     * 
     * @param south 
     */
    public void setSouth(Room south) {
        this.south = south;
    }

    /**
     * 
     * @param west 
     */
    public void setWest(Room west) {
        this.west = west;
    }

    /**
     * 
     * @param items 
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    
=======
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
>>>>>>> 1ea25d9358b361a3e2fe6623b17201f9bb0cdb3c
}
