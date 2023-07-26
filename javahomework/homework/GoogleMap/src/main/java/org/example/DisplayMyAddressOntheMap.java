package org.example;

import java.io.IOException;
import java.util.List;

public class DisplayMyAddressOntheMap {
    public static void main(String[] args) throws Exception {
        // Input and output file paths
        String inputFilePath = "/Users/yiminliu/javahomework/homework/GoogleMap/src/main/java/org/example/input.csv";
        String outputFilePath = "/Users/yiminliu/javahomework/homework/GoogleMap/src/main/java/org/example/LatLong.csv";

        // Read addresses from CSV file
        List<Address> addresses = CSVReader.readCsvFile(inputFilePath);

        // Create a new GeoCodingClient
        GeoCodingClient client = new GeoCodingClient();

        // Loop over the addresses list
        for (Address address : addresses) {
            // Get the LatLng for the address
            LatLng latLng = client.getLatLng(address);

            // Set the LatLng for the address
            address.setLatLng(latLng);
        }

        // Write addresses with lat long to output CSV file
        LatLongWriter writer = new LatLongWriter();
        writer.writeLatLongFile(addresses, outputFilePath);
    }
}
