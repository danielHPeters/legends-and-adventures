package adventuregame.characters;

import adventuregame.characters.enums.EStat;
import adventuregame.characters.stats.Stat;
import adventuregame.items.Item;
import java.util.List;
import java.util.Map;

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
    protected Map<EStat, Stat> stats;

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
    public Map<EStat, Stat> getStats() {
        return stats;
    }
    
    public void setStats(Map<EStat, Stat> stats){
        this.stats = stats;
    }

    /**
     *
     * @return
     */
    public List<Item> getInventory() {
        return inventory;
    }

}
