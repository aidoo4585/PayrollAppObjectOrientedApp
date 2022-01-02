public class PartTime extends Employee {
    public double hourlyRate;
    public double hours;
    private double payment;


    public PartTime(String name, String address, double phoneNumber, double hourlyRate, double hours) {
        super(name, address, phoneNumber);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public void setPartTimePayment() {
        this.payment = (hourlyRate * hours);
    }

    public double getPartTimePayment(Double payment) {
        return payment = this.payment;
    }

    public String printPartTimeInfo() {
        return ("Name: " + name + "  \nPayment: " + String.valueOf(this.payment));
    }


}
