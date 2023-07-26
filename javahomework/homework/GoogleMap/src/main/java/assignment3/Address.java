package assignment3;

/**
 * @Auther: Emily
 * @Date: 2023/6/11 - 06 - 11 - 17:05
 * @Description: assignment3
 * @version: 1.0
 */
public class Address {
    //create variables for the address specific data
    private String streetNumber;
    private String streetName;
    private String streetType;
    private String streetOrientation;
    private String cityName;
    private String province;

    //constructor
    public Address() {
    }

    public Address(String streetNumber, String streetName, String streetType, String streetOrientation, String cityName, String province) {
        this.streetNumber = preprocessStreetNumber(streetNumber); // Add the preprocess method here
        this.streetName = streetName;
        this.streetType = streetType;
        this.streetOrientation = streetOrientation;
        this.cityName = cityName;
        this.province = province;
    }


    public String getStreetNumber() {
        return streetNumber;
    }

//    public void setStreetNumber(String streetNumber) {
//        this.streetNumber = streetNumber;
//    }
    public void setStreetNumber(String streetNumber) {
        this.streetNumber = preprocessStreetNumber(streetNumber); // Add the preprocess method here
    }
    // The method to preprocess the street number
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





}
