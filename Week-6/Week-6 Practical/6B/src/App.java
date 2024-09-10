// Generic interface to find max and min values in an array
interface ComparableArray<T extends Comparable<T>> {
    T findMax(T[] array);
    T findMin(T[] array);
}
