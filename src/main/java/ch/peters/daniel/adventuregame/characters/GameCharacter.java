package ch.peters.daniel.adventuregame.characters;

import ch.peters.daniel.adventuregame.characters.enums.StatType;
import ch.peters.daniel.adventuregame.characters.stats.Stat;
import ch.peters.daniel.adventuregame.items.Item;
import ch.peters.daniel.adventuregame.magic.Effect;

import java.util.List;
import java.util.Map;

/**
 * Game character object.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class GameCharacter {
  public enum Gender {
    MALE, FEMALE
  }

  protected String name;
  protected Gender gender;
  protected Map<StatType, Stat> stats;
  protected List<Item> inventory;
  protected List<Effect> effects;

  public String getName() {
    return name;
  }

  public Gender getGender() {
    return gender;
  }

  public Map<StatType, Stat> getStats() {
    return stats;
  }

  public void setStats(Map<StatType, Stat> stats) {
    this.stats = stats;
  }

  public List<Item> getInventory() {
    return inventory;
  }

  public List<Effect> getEffects() {
    return effects;
  }
}
