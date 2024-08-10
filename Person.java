// Defines a person by name and address
public class Person {
    private String firstName;
    private String lastName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home.toString();
    }
}
