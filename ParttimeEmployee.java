public class ParttimeEmployee extends Employee {
    private int workHours;

    public ParttimeEmployee(int id, String fullName, int age, String phoneNumber, String email, int workHours) {
        super(id, fullName, age, phoneNumber, email);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public double getIncome() {
        return this.workHours * 100000;
    }
}
