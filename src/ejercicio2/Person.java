package ejercicio2;

public class Person {
    private int dni;
    private String name;
    private String lastName;
    private String email;
    private String address;

    public Person(int dni, String name, String lastName, String email, String address){
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
