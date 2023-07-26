package org.example;

public class Address {
    private Person person;
    private String streetNumber;
    private String streetName;
    private String streetType;
    private String streetOrientation;
    private String cityName;
    private String province;
    private LatLng latLng; // LatLng field

    //constructor
    public Address() {
    }

    public Address(Person person, String streetNumber, String streetName, String streetType, String streetOrientation, String cityName, String province) {
        this.person = person;
        this.streetNumber = preprocessStreetNumber(streetNumber); // Add the preprocess method here
        this.streetName = streetName;
        this.streetType = streetType;
        this.streetOrientation = streetOrientation;
        this.cityName = cityName;
        this.province = province;
    }

    // Getters and setters for new fields
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = preprocessStreetNumber(streetNumber);
    }

    private String preprocessStreetNumber(String streetNum) {
        int position = -1;
        for (int i = 0; i < streetNum.length(); i++) {
            if (streetNum.charAt(i) < '0' || streetNum.charAt(i) > '9')
                position = i;
        }
        return streetNum.substring(position + 1);
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetOrientation() {
        return streetOrientation;
    }

    public void setStreetOrientation(String streetOrientation) {
        this.streetOrientation = streetOrientation;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getFormattedAddress() {
        return String.format("%s %s, %s, %s", this.streetNumber, this.streetName, this.cityName, this.province);
    }

    // Add LatLng getter and setter
    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    // Add method to create an Address from a CSV string
    // Add method to create an Address from a CSV string
    public static Address fromCsvString(String csvString) {
        String[] parts = csvString.split(",");
        String firstName = parts.length > 0 ? parts[0] : "";
        String lastName = parts.length > 1 ? parts[1] : "";
        String spouseFirstName = parts.length > 2 ? parts[2] : "";
        String spouseLastName = parts.length > 3 ? parts[3] : "";
        String streetNumber = parts.length > 4 ? parts[4] : "";
        String streetName = parts.length > 5 ? parts[5] : "";
        String streetType = parts.length > 6 ? parts[6] : "";
        String streetOrientation = parts.length > 7 ? parts[7] : "";
        String cityName = parts.length > 8 ? parts[8] : "";
        String province = parts.length > 9 ? parts[9] : "";
        Person person = new Person(firstName, lastName, spouseFirstName, spouseLastName);
        return new Address(person, streetNumber, streetName, streetType, streetOrientation, cityName, province);
    }
}
