public class PersonComparator implements ComparableInterface<Person> {

    @Override
    public boolean isBigger(Person first, Person second) {

        int result = first.getSurname()
                .compareToIgnoreCase(second.getSurname());

        if (result < 0) {
            return true;
        }

        if (result > 0) {
            return false;
        }

        return first.getName()
                .compareToIgnoreCase(second.getName()) < 0;
    }
}