package org.example;

/**
 * @Auther: Emily
 * @Date: 2023/7/21 - 07 - 21 - 15:12
 * @Description: assignment3
 * @version: 1.0
 */
public class LatLng {
    private double latitude;
    private double longitude;

    public LatLng(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
