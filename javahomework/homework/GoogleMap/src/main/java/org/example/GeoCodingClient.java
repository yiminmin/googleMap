/**
 * @Auther: Emily
 * @Date: 2023/7/21 - 07 - 21 - 12:01
 * @Description: assignment3
 * @version: 1.0
 */
package org.example;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GeoCodingClient {

    private final String apiKey = "AIzaSyAQ00-EwPnwveSbNjWpoxspkDpRjGjEIZo";

    public String getGeoCoordinates(String address) throws Exception {
        // URL encode the address
        String encodedAddress = URLEncoder.encode(address, StandardCharsets.UTF_8.toString());

        // Build the API request URL
        String urlString = "https://maps.googleapis.com/maps/api/geocode/json?address=" + encodedAddress + "&key=" + apiKey;

        // Create a URL object from the string
        URL url = new URL(urlString);

        // Open a connection to the URL
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // Create a BufferedReader to read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        // Read the response into a StringBuilder
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }

        // Close the reader and connection
        reader.close();
        conn.disconnect();

        // Return the response as a string
        return sb.toString();
    }

    public LatLng getLatLng(Address address) throws Exception {
        // Use the getFormattedAddress method from Address class
        String formattedAddress = address.getFormattedAddress();

        // Send a geocoding request to the Google Geocoding API
        String response = getGeoCoordinates(formattedAddress);


        // Parse the JSON response and get the latitude and longitude
        JSONObject jsonObject = new JSONObject(response);
        JSONObject location = jsonObject.getJSONArray("results").getJSONObject(0)
                .getJSONObject("geometry").getJSONObject("location");
        //System.out.println("Response JSON: " + jsonObject.toString(4)); // This will print the whole JSON.
        double latitude = location.getDouble("lat");
        double longitude = location.getDouble("lng");

        // Create a new LatLng object and return it
        return new LatLng(latitude, longitude);
    }
}
