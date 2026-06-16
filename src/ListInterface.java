/**
 * @author Christopher Bergsveinsson
 * @version 12/4/2025
 * CSC 223 - Anwar Ahmad
 * Every Tuesday and  Thursday 9:35am → 11:35am
 * Programming Assignment 6 - Course Tracker with NodeBasedList - ListInterface
 */

public interface ListInterface<D>
{
    public abstract void add(D item);

    public abstract boolean remove(D item);

    public abstract boolean find(D item);

    public ListInterface<D> difference(ListInterface<D> secondList);

}    