public class ComparatorSorter {

    public <T> void sorting(T[] objects,
                            ComparableInterface<T> comparator) {

        for (int i = 0; i < objects.length - 1; i++) {

            for (int j = 0; j < objects.length - 1 - i; j++) {

                if (comparator.isBigger(objects[j], objects[j + 1])) {

                    T temp = objects[j];
                    objects[j] = objects[j + 1];
                    objects[j + 1] = temp;
                }
            }
        }
    }
}