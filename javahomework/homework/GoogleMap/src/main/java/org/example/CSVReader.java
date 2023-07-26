
/**
 * @Auther: Emily
 * @Date: 2023/7/21 - 07 - 21 - 15:15
 * @Description: assignment3
 * @version: 1.0
 */

package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static List<Address> readCsvFile(String filePath) throws IOException {
        List<Address> addresses = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Address address = Address.fromCsvString(line);
                addresses.add(address);
            }
        }

        return addresses;
    }
}
