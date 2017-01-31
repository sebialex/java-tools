package com.github.sebialex.tools.linkedmap;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * DESCRIPTION.
 *
 * @version $Id$
 */
public class DoublyLinkedList<K, V> extends AbstractSequentialList<ListNode<K, V>>
    implements Serializable, Deque<ListNode<K, V>>
{

    private ListNode<K, V> head;
    private ListNode<K, V> tail;
    private int size;


    public ListNode<K, V> addMapNode(MapNode<K, V> mapNode) {

        ListNode<K, V> node = new ListNode<K, V>(mapNode);

        if (this.size == 0) {
            this.head = node;
            this.tail = node;
            this.size++;
        } else {
            this.insertAfter(node, this.tail);
            this.tail = node;
        }

        return node;
    }

    public ListNode<K, V> detach(ListNode<K, V> node) {

        if (node == null || this.size == 0) {
            return node;
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            node.unlink();
        } else if (this.head == node) {
            this.head = node.getNext();
            this.head.setPrev(null);
            node.setNext(null);
        } else if (this.tail == node) {
            this.tail = node.getPrev();
            this.tail.setNext(null);
            node.setPrev(null);
        } else {
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
            node.unlink();
        }

        this.size--;
        return node;
    }

    public void insertAfter(ListNode<K, V> nodeToInsert, ListNode<K, V> existingNode) {

        if (nodeToInsert == existingNode) {
            throw new IllegalArgumentException("The given nodes cannot be the same object.");
        }

        ListNode<K, V> nextNextNode = existingNode.getNext();

        existingNode.setNext(nodeToInsert);
        nodeToInsert.setPrev(existingNode);
        nodeToInsert.setNext(nextNextNode);

        if (nextNextNode != null) {
            nextNextNode.setPrev(nodeToInsert);
        }

        this.size++;
    }

    public void insertBefore(ListNode<K, V> nodeToInsert, ListNode<K, V> existingNode) {

        if (nodeToInsert == existingNode) {
            throw new IllegalArgumentException("The given nodes cannot be the same object.");
        }

        ListNode<K, V> prevPrevNode = existingNode.getPrev();

        existingNode.setPrev(nodeToInsert);
        nodeToInsert.setNext(existingNode);
        nodeToInsert.setPrev(prevPrevNode);

        if (prevPrevNode != null) {
            prevPrevNode.setNext(nodeToInsert);
        }
        this.size++;
    }

    //public void insertAfter(MapNode<K, V> mapNode)

    public void remove(ListNode<K, V> node) {

        if (node == null || this.size == 0) {
            return;
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else if (this.head == node) {

        } else if (this.tail == node) {

        } else {

        }
    }

    @Override public ListIterator<ListNode<K, V>> listIterator(int index)
    {
        return null;
    }

    @Override public void addFirst(ListNode<K, V> kvListNode)
    {

    }

    @Override public void addLast(ListNode<K, V> kvListNode)
    {

    }

    @Override public boolean offerFirst(ListNode<K, V> kvListNode)
    {
        return false;
    }

    @Override public boolean offerLast(ListNode<K, V> kvListNode)
    {
        return false;
    }

    @Override public ListNode<K, V> removeFirst()
    {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.detach(this.head);
    }

    @Override public ListNode<K, V> removeLast()
    {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.detach(this.tail);
    }

    @Override public ListNode<K, V> pollFirst()
    {
        return this.detach(this.head);
    }

    @Override public ListNode<K, V> pollLast()
    {
        return this.detach(this.tail);
    }

    @Override public ListNode<K, V> getFirst()
    {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.head;
    }

    @Override public ListNode<K, V> getLast()
    {
        if (this.size == 0) {
            throw new NoSuchElementException();
        }
        return this.tail;
    }

    @Override public ListNode<K, V> peekFirst()
    {
        return this.head;
    }

    @Override public ListNode<K, V> peekLast()
    {
        return this.tail;
    }

    @Override public boolean removeFirstOccurrence(Object o)
    {
        return false;
    }

    @Override public boolean removeLastOccurrence(Object o)
    {
        return false;
    }

    @Override public boolean offer(ListNode<K, V> kvListNode)
    {
        return false;
    }

    @Override public ListNode<K, V> remove()
    {
        return null;
    }

    @Override public ListNode<K, V> poll()
    {
        return null;
    }

    @Override public ListNode<K, V> element()
    {
        return null;
    }

    @Override public ListNode<K, V> peek()
    {
        return null;
    }

    @Override public void push(ListNode<K, V> kvListNode)
    {

    }

    @Override public ListNode<K, V> pop()
    {
        return null;
    }

    @Override public int size()
    {
        return 0;
    }

    @Override public Iterator<ListNode<K, V>> descendingIterator()
    {
        return null;
    }
}
