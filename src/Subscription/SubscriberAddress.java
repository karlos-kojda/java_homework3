package Subscription;

public class SubscriberAddress {

    private String street_name;
    private int street_number;
    private String city;
    private String country;
    private int zip_code;

    public SubscriberAddress(String street_name, int street_number, String city, String country, int zip_code) {
        this.street_name = street_name;
        this.street_number = street_number;
        this.city = city;
        this.country = country;
        this.zip_code = zip_code;
    }
}
