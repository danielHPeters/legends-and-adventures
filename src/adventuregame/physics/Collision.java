package adventuregame.physics;

import adventuregame.base.interfaces.ICollidable;

/**
 *
 * @author Daniel
 */
public class Collision {
    
    /**
     * 
     */
    private ICollidable obj1;
    
    /**
     * 
     */
    private ICollidable obj2;
    
    /**
     * 
     */
    private boolean resolved;
    
    /**
     * 
     * @param obj1
     * @param obj2 
     */
    public Collision(ICollidable obj1, ICollidable obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.resolved = false;
    }

    /**
     * 
     * @return 
     */
    public ICollidable getObj1() {
        return obj1;
    }

    /**
     * 
     * @return 
     */
    public ICollidable getObj2() {
        return obj2;
    }

    /**
     * 
     * @return 
     */
    public boolean isResolved() {
        return resolved;
    }

    /**
     * 
     * @param resolved 
     */
    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }
    
}
