package adventuregame.characters;

import adventuregame.characters.enums.EStat;
import adventuregame.characters.stats.Stat;
import adventuregame.items.Item;
import adventuregame.magic.Effect;

import java.util.List;
import java.util.Map;

/**
 * Game character object.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class GameCharacter {
  /**
   * Character name.
   */
  protected String name;
  /**
   * Gender of the character.
   */
  protected String gender;
  /**
   * Player stats list.
   */
  protected Map<EStat, Stat> stats;
  /**
   * Inventory of the Player.
   */
  protected List<Item> inventory;

  protected List<Effect> effects;

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public Map<EStat, Stat> getStats() {
    return stats;
  }

  public void setStats(Map<EStat, Stat> stats) {
    this.stats = stats;
  }

  public List<Item> getInventory() {
    return inventory;
  }

  public List<Effect> getEffects() {
    return effects;
  }
}
