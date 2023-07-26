/**
 * @Auther: Emily
 * @Date: 2023/7/21 - 07 - 21 - 18:01
 * @Description: assignment3
 * @version: 1.0
 */
package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class LatLongWriter {
    public void writeLatLongFile(List<Address> addresses, String outputFilePath) throws Exception {
        // Create a FileWriter to write to the output file
        FileWriter writer = new FileWriter(outputFilePath);

        // Write the header line to the output file
        writer.write("Latitude,Longitude,Name,Icon,IconScale,IconAltitude\n");

        // Loop over the addresses list
        for (Address address : addresses) {
            // Get the LatLng for the person
            LatLng latLng = address.getLatLng();

            // Get the person from the address
            Person person = address.getPerson();

            // Check if spouse name exists
            String spouseName = "";
            if (!person.getSpouseFirstName().isEmpty() && !person.getSpouseLastName().isEmpty()) {
                spouseName = " and " + person.getSpouseFirstName() + " " + person.getSpouseLastName();
            }

            // Write the lat, long, and person's first name + last name to the output file
            writer.write(String.format("%s,%s,%s%s,111,1,1\n", latLng.getLatitude(), latLng.getLongitude(), person.getFirstName() + " " + person.getLastName(), spouseName));
        }

        // Close the FileWriter
        writer.close();
    }
}
