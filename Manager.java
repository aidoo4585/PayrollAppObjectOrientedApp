public class Manager extends Fulltime {
    public double monthlyBonus;
    private double payment;

    public Manager(String name, String address, double phoneNumber, double monthlySalary, double taxRate, double monthlyBonus) {
        super(name, address, phoneNumber, monthlySalary, taxRate);
        this.monthlyBonus = monthlyBonus;
    }


    public void setManagerPayment() {
        this.payment = (monthlySalary - (this.monthlySalary * this.taxRate) + monthlyBonus);
    }

    public double getManagerPayment(Double payment) {
        return payment = this.payment;
    }

    public String printManagerInfo() {
        return ("Name: " + name + "  \nPayment: " + String.valueOf(this.payment);
    }
}
