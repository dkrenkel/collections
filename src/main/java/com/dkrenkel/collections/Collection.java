package com.dkrenkel.collections;

/**
 * A collection, also known as data structure, is a group of elements of a
 * determined type T.
 *
 * @author David Krenkel
 * @param <T> The type of elements
 */
public interface Collection<T> {

    /**
     * Adds a new element to the collection.
     *
     * @param object the object to be added
     * @return <tt>true</tt> if the specified object was added to the collection
     */
    boolean add(T object);

    /**
     * Removes a specified object from the collection.
     *
     * @param object the object to be removed
     * @return <tt>true</tt> if the specified object was removed from the
     * collection
     */
    boolean remove(T object);

    /**
     * Returns the number of elements in the collection.
     *
     * @return returns the number of elements in the collection
     */
    int size();

    /**
     * Removes all the elements from the collection.
     */
    void clear();

    /**
     * Checks if the collection contains the given element.
     *
     * @param object the element to be checked
     * @return <tt>true</tt> if the collection contains the specified element
     */
    boolean contains(T object);
}
