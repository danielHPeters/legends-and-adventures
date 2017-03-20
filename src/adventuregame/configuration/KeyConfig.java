package adventuregame.configuration;

import adventuregame.actions.KeyAction;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Daniel
 */
public class KeyConfig {
    
    /**
     * 
     */
    private KeyCode key;
    
    /**
     * 
     */
    private KeyAction action;
    
    /**
     * 
     * @param key
     * @param action 
     */
    public KeyConfig(KeyCode key, KeyAction action){
        this.key = key;
        this.action = action;
    }
}
