package assignment3;

/**
 * @Auther: Emily
 * @Date: 2023/6/11 - 06 - 11 - 17:05
 * @Description: assignment3
 * @version: 1.0
 */
public class Person {
    private Address address;
    //variable to store Person's data
    private String firstName;
    private String lastName;
    private String spouseFirstName;
    private String spouseLastName;

    public Person() {
    }

    public Person(String firstName, String lastName, String spouseFirstName, String spouseLastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spouseFirstName = spouseFirstName;
        this.spouseLastName = spouseLastName;
        this.address = address;
    }

    public Person(String firstName, String lastName, String spouseFirstName, String spouseLastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spouseFirstName = spouseFirstName;
        this.spouseLastName = spouseLastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    // Method to return CSV string representation of Person
    public String toCsvString() {
        return (firstName == null ? "" : firstName) + ","
                + (lastName == null ? "" : lastName) + ","
                + (spouseFirstName == null ? "" : spouseFirstName) + ","
                + (spouseLastName == null ? "" : spouseLastName) + ","
                + (address.getStreetNumber() == null ? "" : address.getStreetNumber()) + ","
                + (address.getStreetName() == null ? "" : address.getStreetName()) + ","
                + (address.getStreetType() == null ? "" : address.getStreetType()) + ","
                + (address.getStreetOrientation() == null ? "" : address.getStreetOrientation()) + ","
                + (address.getCityName() == null ? "" : address.getCityName()) + ","
                + (address.getProvince() == null ? "" : address.getProvince());
    }


}
