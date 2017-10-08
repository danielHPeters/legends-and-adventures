package adventuregame.physics;

import adventuregame.base.interfaces.ICollidable;

/**
 * Collision.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Collision {
  private ICollidable obj1;
  private ICollidable obj2;
  private boolean resolved;

  public Collision(ICollidable obj1, ICollidable obj2) {
    this.obj1 = obj1;
    this.obj2 = obj2;
    this.resolved = false;
  }

  public ICollidable getObj1() {
    return obj1;
  }

  public ICollidable getObj2() {
    return obj2;
  }

  public boolean isResolved() {
    return resolved;
  }

  public void setResolved(boolean resolved) {
    this.resolved = resolved;
  }
}
