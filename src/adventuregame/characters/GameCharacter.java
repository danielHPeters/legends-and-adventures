package adventuregame.characters;

import adventuregame.items.Item;
import java.util.List;

/**
 *
 * @author Daniel
 */
public abstract class GameCharacter {

    protected String name, gender;

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
