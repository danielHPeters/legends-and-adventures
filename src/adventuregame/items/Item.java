package adventuregame.items;

import java.util.List;

/**
 *
 * @author Daniel
 */
public class Item {

    /**
     * 
     */
    private String description, name;

    /**
     * 
     */
    private List<String> properties;

    /**
     * 
     * @param name
     * @param description 
     */
    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * 
     * @return 
     */
    public String getName() {
        return this.name;
    }
}
