package ejercicio2;

public class Staff extends Person{
    private float wage;
    private String timetable; //Morning or Night

    public Staff(int dni, String name, String lastName, String email, String address, float wage, String timetable){
        super(dni, name, lastName, email, address);
        this.wage = wage;
        this.timetable = timetable;
    }

    public float calculateAnualWage(){
        return this.wage * 12;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }

    @Override
    public String toString(){
        return "Staff -> Name: " + super.getName() + " " + super.getLastName()
                + "\nDNI: " + super.getDni() + "\nAddress: " + super.getAddress()
                + "\nTimetable: " + this.timetable + "\nWage: $" + this.wage
                + "\n------------------------------------------------------------------------";

    }
}
