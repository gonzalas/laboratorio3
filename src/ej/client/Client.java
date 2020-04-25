package ej.client;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private String phone;
    private String address;

    public Client(String name, String phone, String address){
        this.id = UUID.randomUUID();
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
