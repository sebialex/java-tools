package com.github.sebialex.tools.linkedmap;

/**
 * DESCRIPTION.
 *
 * @version $Id$
 */
public class MapNode<K, V>  {

    private K key;
    private V value;

    public MapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Getter for key.
     *
     * @return the key value
     */
    public K getKey()
    {
        return this.key;
    }

    /**
     * Setter for key.
     *
     * @param key the value to set
     * @return this object
     */
    public MapNode setKey(K key)
    {
        this.key = key;
        return this;
    }

    /**
     * Getter for value.
     *
     * @return the value value
     */
    public V getValue()
    {
        return this.value;
    }

    /**
     * Setter for value.
     *
     * @param value the value to set
     * @return this object
     */
    public MapNode setValue(V value)
    {
        this.value = value;
        return this;
    }
}
