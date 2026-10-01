public class Sort {

    public void sorting(Person[] persons) {

        for (int i = 0; i < persons.length - 1; i++) {

            for (int j = 0; j < persons.length - 1 - i; j++) {

                int Compare =
                        persons[j].getSurname().compareToIgnoreCase(
                                persons[j + 1].getSurname());

                if (Compare > 0 ||
                        (Compare == 0 &&
                                persons[j].getName().compareToIgnoreCase(
                                        persons[j + 1].getName()) > 0)) {


                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}