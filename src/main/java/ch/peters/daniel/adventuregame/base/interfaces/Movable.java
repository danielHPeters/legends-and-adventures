package ch.peters.daniel.adventuregame.base.interfaces;

import ch.peters.daniel.adventuregame.base.enums.Direction;

/**
 * Interface for movable objects.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public interface Movable {
  void move(Direction direction);
}
