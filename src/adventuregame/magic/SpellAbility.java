package adventuregame.magic;

import java.util.List;

/**
 * Ability / Spell.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class SpellAbility {
  /**
   * Name of spell or ability.
   */
  private final String name;
  /**
   * The level at which this spell/ability is unlocked.
   */
  private final int level;
  /**
   * The cost of the spell/ability.
   */
  private final double cost;
  /**
   * Effects of this spell/ability.
   */
  private final List<Effect> effects;

  /**
   * Default constructor.
   *
   * @param name    set name for spell/ability
   * @param level   set the level at which the spell/ability unlocks
   * @param cost    set cost of this spell/ability
   * @param effects set list of effects for this spell/ability
   */
  public SpellAbility(String name, int level, double cost, List<Effect> effects) {
    this.name = name;
    this.level = level;
    this.cost = cost;
    this.effects = effects;
  }
}
