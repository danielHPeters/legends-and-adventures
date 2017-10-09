package adventuregame.physics;

import adventuregame.base.interfaces.CollideAble;

/**
 * Collision.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Collision {
  private CollideAble obj1;
  private CollideAble obj2;
  private boolean resolved;

  public Collision(CollideAble obj1, CollideAble obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
    this.resolved = false;
  }

  public CollideAble getObj1() {
    return obj1;
  }

  public CollideAble getObj2() {
    return obj2;
  }

  public boolean isResolved() {
    return resolved;
  }

  public void setResolved(boolean resolved) {
    this.resolved = resolved;
  }
}
