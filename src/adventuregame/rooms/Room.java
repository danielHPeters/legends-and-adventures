package adventuregame.rooms;

import adventuregame.items.Item;
import adventuregame.rooms.cells.Cell;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Room {

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
    
    
}
