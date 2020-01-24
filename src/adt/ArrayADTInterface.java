/*
 *   Created by IntelliJ IDEA.
 *   User: Vaibhav
 *   Date: 14/01/20
 *   Time: 7:17 PM
 */

package adt;

public interface ArrayADTInterface {
    //insert at next empty index, defined by end
    boolean insert(int element);
    //delete the last inserted element and return that element
    int delete();
    // to print elements of array, till end index
    void traverse();
    // search the given element
    boolean search(int element);
    // sort the existing array and preserve the original
    int[] sort();
    // checks for empty array
    boolean isEmpty();
}
