public class Fulltime extends Employee {
    public double monthlySalary;
    public double taxRate;
    private double payment = (monthlySalary - (this.monthlySalary * this.taxRate));

    public Fulltime(String name, String address, double phoneNumber, double monthlySalary, double taxRate) {
        super(name, address, phoneNumber);
        this.monthlySalary = monthlySalary;
        this.taxRate = taxRate;
    }

    public void setFulltimePayment() {
        this.payment = (monthlySalary - (this.monthlySalary * this.taxRate));
    }

    public double getFulltimePayment(Double payment) {
        return payment = this.payment;
    }

    public String printFulltimeInfo() {
        return ("Name: " + name + "  \nPayment: " + String.valueOf(this.payment));
    }

}
