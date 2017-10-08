package adventuregame.magic;

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
  private final EMechanic mechanic;
  /**
   * The magnitude of the effect.
   */
  private final double value;
  /**
   * Duration of the effect.
   */
  private final double duration;

  /**
   * Default constructor. Sets the mechanic, the value and the duration of the effect.
   *
   * @param mechanic what the effect does (eg. damaga, healing, poison etc)
   * @param value    the magnitude of the effect
   * @param duration duration of the effect
   */
  public Effect(EMechanic mechanic, double value, double duration) {
    this.mechanic = mechanic;
    this.value = value;
    this.duration = duration;
  }
}
