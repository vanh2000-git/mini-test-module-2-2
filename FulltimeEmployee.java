public class FulltimeEmployee extends Employee {
    private double bonus;
    private double penaltyFee;
    private double salary;

    public FulltimeEmployee(int id, String fullName, int age, String phoneNumber, String email, int bonus, int penaltyFee, int salary) {
        super(id, fullName, age, phoneNumber, email);
        this.bonus = bonus;
        this.penaltyFee = penaltyFee;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public double getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(int penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getIncome(){
        return this.salary - this.penaltyFee + this.bonus;
    }
}
