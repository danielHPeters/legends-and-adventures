package ch.peters.daniel.adventuregame.magic;

/**
 * This class is used to generate effects for spells and abilities.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Effect {
  /**
   * What the effect does (eg. healing, damage etc.)
   */
  private final Mechanic mechanic;
  private final double value;
  private final double duration;

  public Effect(Mechanic mechanic, double value, double duration) {
    this.mechanic = mechanic;
    this.value = value;
    this.duration = duration;
  }
}
