package ch.peters.daniel.adventuregame.physics;

import ch.peters.daniel.adventuregame.base.interfaces.Collideable;

/**
 * Class Collision.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Collision {
  private Collideable obj1;
  private Collideable obj2;
  private boolean resolved;

  public Collision(Collideable obj1, Collideable obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
    this.resolved = false;
  }

  public Collideable getObj1() {
    return obj1;
  }

  public Collideable getObj2() {
    return obj2;
  }

  public boolean isResolved() {
    return resolved;
  }

  public void setResolved(boolean resolved) {
    this.resolved = resolved;
  }
}
