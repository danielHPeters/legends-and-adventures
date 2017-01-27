package adventuregame.rooms;

/**
 *
 * @author d.peters
 */
public abstract class LockableObject {
    boolean locked;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
