package ch.peters.daniel.adventuregame.characters.stats;

/**
 * Definition of character stats.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Stat {
  private double max;
  private double min;
  private double value;

  public Stat(double value, double min, double max) {
    this.value = value;
    this.min = min;
    this.max = max;
  }

  /**
   * Temporary stat increase (or heal for health).
   *
   * @param add added value
   */
  public void increase(double add) {
    this.value = this.value + add < this.max ? this.value + add : this.max;
  }

  /**
   * Temporary stat decrease (or damage taken for health).
   *
   * @param sub subtracted value
   */
  public void decrease(double sub) {
    this.value = this.value - sub > this.min ? this.value + -sub : this.min;
  }

  public void increaseMax(double add) {
    this.max += add;
  }

  public void decreaseMax(double subtract) {
    this.max += subtract;
  }

  public void increaseMin(double add) {
    this.min += add;
  }

  public void decreaseMin(double subtract) {
    this.min += subtract;
  }
}
