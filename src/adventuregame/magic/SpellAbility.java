/*
 * The MIT License
 *
 * Copyright 2017 d.peters.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package adventuregame.magic;

import java.util.List;

/**
 *
 * @author d.peters
 */
public class SpellAbility {
    
    /**
     * Name of spell or ability
     */
    private final String name;
    
    /**
     * The level at which this spell/ability is unlocked
     */
    private final int level;
    
    /**
     * The cost of the spell/ability
     */
    private final double cost;
    
    /**
     * Effects of this spell/ability
     */
    private final List<Effect> effects;

    /**
     * 
     * @param name set name for spell/ability
     * @param level set the level at which the spell/ability unlocks
     * @param cost set cost of this spell/ability
     * @param effects set list of effects for this spell/ability
     */
    public SpellAbility(String name, int level, double cost, List<Effect> effects) {
        this.name = name;
        this.level = level;
        this.cost = cost;
        this.effects = effects;
    }
    
    
}
