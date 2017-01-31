package com.github.sebialex.tools.linkedmap;

/**
 * DESCRIPTION.
 *
 * @version $Id$
 */
public class ListNode<K, V>
{
    private MapNode<K, V> mapNode;
    private ListNode<K, V> next;
    private ListNode<K, V> prev;

    public ListNode() {
    }

    public ListNode(MapNode<K, V> mapNode) {
        this.mapNode = mapNode;
    }

    public void unlink() {
        this.next = null;
        this.prev = null;
    }



    public void clear() {
        this.mapNode = null;
        this.unlink();
    }

    /**
     * Getter for mapNode.
     *
     * @return the mapNode value
     */
    public MapNode<K, V> getMapNode()
    {
        return this.mapNode;
    }

    /**
     * Setter for mapNode.
     *
     * @param mapNode the value to set
     * @return this object
     */
    public ListNode setMapNode(MapNode<K, V> mapNode)
    {
        this.mapNode = mapNode;
        return this;
    }

    /**
     * Getter for next.
     *
     * @return the next value
     */
    public ListNode<K, V> getNext()
    {
        return this.next;
    }

    /**
     * Setter for next.
     *
     * @param next the value to set
     * @return this object
     */
    public ListNode setNext(ListNode<K, V> next)
    {
        this.next = next;
        return this;
    }

    /**
     * Getter for prev.
     *
     * @return the prev value
     */
    public ListNode<K, V> getPrev()
    {
        return this.prev;
    }

    /**
     * Setter for prev.
     *
     * @param prev the value to set
     * @return this object
     */
    public ListNode setPrev(ListNode<K, V> prev)
    {
        this.prev = prev;
        return this;
    }
}
