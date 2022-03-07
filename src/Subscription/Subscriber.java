package Subscription;

public class Subscriber {

    private String first_name;
    private String last_name;
    private SubscriberAddress address;
    private String email;
    private int age;

    public Subscriber(String first_name, String last_name, SubscriberAddress address, String email, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    //this constructor is used when i want to create subscriber without his age
    public Subscriber(String first_name, String last_name, SubscriberAddress address, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.email = email;
    }
}

