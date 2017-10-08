package adventuregame.base.interfaces;

import adventuregame.base.enums.EDirection;

/**
 * Interface for movable objects.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public interface IMovable {
  void move(EDirection direction);
}
