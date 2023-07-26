package assignment3;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayMyAddressOnTheMap {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        try {
            // Create a BufferedReader to read the input file
            BufferedReader reader = new BufferedReader(new FileReader("/Users/yiminliu/javahomework/homework/GoogleMap/src/main/java/assignment3/InputAddresses.txt"));

            // Create a FileWriter to write to the output file
            FileWriter writer = new FileWriter("/Users/yiminliu/javahomework/homework/GoogleMap/src/main/java/assignment3/OutAddresses.csv");

            String line;
            List<String> currentAddressLines = new ArrayList<>();

            while (true) {
                line = reader.readLine();
                if (line != null && !line.trim().isEmpty()) {
                    currentAddressLines.add(line);
                } else if (!currentAddressLines.isEmpty()) {
                    // Process the lines
                    String nameLine = currentAddressLines.get(0);
                    String addressLine;
                    String cityProvinceLine;

                    // Check for unit line
                    if (currentAddressLines.get(1).toLowerCase().startsWith("unit")) {
                        // If we have a unit line, we need to ignore it and read the address from the next line
                        addressLine = currentAddressLines.get(2);
                        cityProvinceLine = currentAddressLines.get(3);
                    } else {
                        addressLine = currentAddressLines.get(1);
                        cityProvinceLine = currentAddressLines.get(2);
                    }

                    // Process nameLine
                    String firstName = null;
                    String lastName = null;
                    String spouseFirstName = null;
                    String spouseLastName = null;

                    if (nameLine.contains(" and ")) {
                        String[] splitAtAnd = nameLine.split(" and ");
                        String[] name1Parts = splitAtAnd[0].split(" ");
                        String[] name2Parts = splitAtAnd[1].split(" ");
                        firstName = name1Parts[0];
                        spouseFirstName = name2Parts[0];
                        spouseLastName = name2Parts.length > 1 ? name2Parts[1] : "";
                        lastName = name1Parts.length > 1 ? name1Parts[1] : spouseLastName;
                    } else if (nameLine.contains(", ")) {
                        String[] splitAtComma = nameLine.split(", ");
                        String[] name1Parts = splitAtComma[0].split(" ");
                        String[] name2Parts = splitAtComma[1].split(" ");
                        firstName = name1Parts[0];
                        spouseFirstName = name2Parts[0];
                        spouseLastName = name2Parts.length > 1 ? name2Parts[1] : "";
                        lastName = name1Parts.length > 1 ? name1Parts[1] : spouseLastName;
                    } else {
                        String[] nameParts = nameLine.split(" ");
                        firstName = nameParts[0];
                        lastName = nameParts.length > 1 ? nameParts[1] : "";
                    }

                    // Process addressLine
                    String streetNumber = null;
                    String streetName = null;
                    String streetType = null;
                    String streetOrientation = null;

                    String[] addressParts = addressLine.split(" ");
                    streetNumber = addressParts[0];

                    List<String> orientations = Arrays.asList("east", "west", "north", "south");

                    if (orientations.contains(addressParts[addressParts.length - 1].toLowerCase())) {
                        streetOrientation = addressParts[addressParts.length - 1];
                        streetType = addressParts[addressParts.length - 2];
                        streetName = String.join(" ", Arrays.copyOfRange(addressParts, 1, addressParts.length - 2));
                    } else {
                        streetType = addressParts[addressParts.length - 1];
                        streetName = String.join(" ", Arrays.copyOfRange(addressParts, 1, addressParts.length - 1));
                    }

                    // Process cityProvinceLine
                    String cityName = cityProvinceLine.split(",")[0].trim();
                    String provinceName;
                    if(cityProvinceLine.split(",").length > 1) {
                        provinceName = cityProvinceLine.split(",")[1].trim().split(" ")[0];
                    } else {
                        provinceName = "ON"; // Default to ON if not provided
                    }

                    // Create the Address and Person objects
                    Address address = new Address(streetNumber, streetName, streetType, streetOrientation, cityName, provinceName);
                    Person person = new Person(firstName, lastName, spouseFirstName, spouseLastName, address);

                    // Add the Person object to the list
                    persons.add(person);

                    // Clear the currentAddressLines list for the next address
                    currentAddressLines.clear();
                }

                if (line == null) {
                    break;
                }
            }

            // Write the information from the Person objects to the output file
            for (Person person : persons) {
                writer.write(person.toCsvString() + "\n");
            }

            // Close the BufferedReader and FileWriter
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
