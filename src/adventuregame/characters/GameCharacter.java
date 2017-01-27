package adventuregame.characters;

import adventuregame.items.Item;
import java.util.List;

/**
 *
 * @author Daniel
 */
public abstract class GameCharacter {

    /**
     * Character name
     */
    protected String name;
    
    /**
     * Gender of the character
     */
    protected String  gender;

    /**
     * Player Statslist
     */
    protected List<Integer> Stats;

    /**
     * Inventory of the Player
     */
    protected List<Item> inventory;

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
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return
     */
    public List<Integer> getStats() {
        return Stats;
    }

    /**
     *
     * @return
     */
    public List<Item> getInventory() {
        return inventory;
    }

}
