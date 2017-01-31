package com.github.sebialex.tools.linkedmap;

import java.util.HashMap;
import java.util.Map;

/**
 * DESCRIPTION.
 *
 * @version $Id$
 */
public class LinkedHashMap<K, V> {

    private Map<K, ListNode<K, V>> map = new HashMap<K, ListNode<K, V>>();
    private DoublyLinkedList<K, V> list = new DoublyLinkedList<K, V>();

    //var listNode = this._list.add({ key: key, value: value });
    //this.size = this._list.length;
    //return this._hashMap.put(key, { value: value, listNode: listNode });

    public ListNode<K, V> put(K key, V value) {

        if (this.map.containsKey(key)) {
            ListNode<K, V> mapValue = this.map.get(key);
            mapValue.getMapNode().setValue(value);
            return mapValue;
            
        } else {
            return this.map.put(key, this.list.add(new MapNode<K, V>(key, value)));
        }
    }
}
