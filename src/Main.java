public class Main {

    public static void main(String[] args) {

        Person[] persons = {
                new Person("John", "Smith"),
                new Person("Alice", "Brown"),
                new Person("David", "Smith"),
                new Person("Bob", "Adams"),
                new Person("Charlie", "Brown")
        };

        Sort sorter = new Sort();

        System.out.println("Before sorting:");

        for (Person person : persons) {
            person.printPerson();
        }

        sorter.sorting(persons);
        System.out.println("---------------------");
        System.out.println("\nAfter sorting:");

        for (Person person : persons) {
            person.printPerson();
        }



        ComparatorSorter sorters = new ComparatorSorter();

        ComparableInterface<Person> personComparator =
                new PersonComparator();

        sorters.sorting(persons, personComparator);

        System.out.println("\nPersons after sorting:");

        for (Person person : persons) {
            person.printPerson();
        }


        Rectangle[] rectangles = {
                new Rectangle(5, 4),
                new Rectangle(2, 3),
                new Rectangle(10, 2),
                new Rectangle(3, 4),
                new Rectangle(6, 5)
        };

        System.out.println("\nRectangles before sorting:");

        for (Rectangle rectangle : rectangles) {
            rectangle.calculateArea();
        }

        ComparableInterface<Rectangle> rectangleComparator =
                new RectangleComparator();

        sorters.sorting(rectangles, rectangleComparator);

        System.out.println("\nRectangles after sorting:");

        for (Rectangle rectangle : rectangles) {
            rectangle.calculateArea();
        }
    }
}