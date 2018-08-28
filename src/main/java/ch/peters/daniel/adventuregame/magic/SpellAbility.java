package ch.peters.daniel.adventuregame.magic;

import java.util.List;

/**
 * Ability / Spell.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class SpellAbility {
  private final String name;
  /**
   * The level at which this spell/ability is unlocked.
   */
  private final int level;
  private final double cost;
  private final List<Effect> effects;

  public SpellAbility(String name, int level, double cost, List<Effect> effects) {
    this.name = name;
    this.level = level;
    this.cost = cost;
    this.effects = effects;
  }
}
