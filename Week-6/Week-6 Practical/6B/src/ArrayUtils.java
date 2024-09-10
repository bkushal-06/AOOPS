// Generic class implementing the ComparableArray interface
class ArrayUtils<T extends Comparable<T>> implements ComparableArray<T> {

    // Method to find the maximum value in the array
    @Override
    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    // Method to find the minimum value in the array
    @Override
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }
}
