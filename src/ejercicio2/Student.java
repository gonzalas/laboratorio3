package ejercicio2;


public class Student extends Person{
    private String career;
    private int incomeYear;
    private float feeMonthly;

    public Student(int dni, String name, String lastName, String email, String address, String career, int incomeYear, float feeMonthly){
        super(dni, name, lastName, email, address);
        this.career = career;
        this. incomeYear = incomeYear;
        this.feeMonthly = feeMonthly;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getIncomeYear() {
        return incomeYear;
    }

    public void setIncomeYear(int incomeYear) {
        this.incomeYear = incomeYear;
    }

    public float getFeeMonthly() {
        return feeMonthly;
    }

    public void setFeeMonthly(float feeMonthly) {
        this.feeMonthly = feeMonthly;
    }

    @Override
    public String toString(){
        return "Student -> Name: " + super.getName() + " " + super.getLastName()
                + "\nDNI: " + super.getDni() + "\nAddress: " + super.getAddress()
                + "\nCarrer: " + this.career + "\nIncome Year: " + this.incomeYear
                + "\nFee Monthly: " + this.feeMonthly
                + "\n------------------------------------------------------------------------";
    }
}
